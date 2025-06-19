package Pcanteen.Backend;


import Pcanteen.Backend.dto.AuthRequest;
import Pcanteen.Backend.dto.AuthResponse;
import Pcanteen.Backend.dto.SignUpRequest;
import Pcanteen.Backend.exception.CustomException;
import Pcanteen.Backend.Employee;
import Pcanteen.Backend.EmployeeRepository;
import Pcanteen.Backend.security.CustomUserDetailsService;
import Pcanteen.Backend.security.JwtUtil;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final CustomUserDetailsService userDetailsService;
    private final JwtUtil jwtUtil;
    private final PasswordEncoder passwordEncoder;
    private final EmployeeRepository employeeRepository;
    
    @Autowired
    public AuthController(AuthenticationManager authenticationManager, CustomUserDetailsService userDetailsService,
			JwtUtil jwtUtil, PasswordEncoder passwordEncoder, EmployeeRepository employeeRepository) {
		super();
		this.authenticationManager = authenticationManager;
		this.userDetailsService = userDetailsService;
		this.jwtUtil = jwtUtil;
		this.passwordEncoder = passwordEncoder;
		this.employeeRepository = employeeRepository;
	}

	@PostMapping("/signin")
    public ResponseEntity<?> signIn(@RequestBody AuthRequest authRequest) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getEmployeeId(), authRequest.getPassword())
            );
        } catch (Exception e) {
            throw new CustomException("Invalid employee ID or password");
        }

        final UserDetails userDetails = userDetailsService.loadUserByUsername(authRequest.getEmployeeId());
        final String token = jwtUtil.generateToken(userDetails);
        
        Employee employee = employeeRepository.findByEmployeeId(authRequest.getEmployeeId())
                .orElseThrow(() -> new CustomException("Employee not found"));

        return ResponseEntity.ok(new AuthResponse(
                employee.getEmployeeId(),
                token,
                employee.getFullName(),
                employee.getDepartment()
        ));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@RequestBody SignUpRequest signUpRequest) {
        if (employeeRepository.existsByEmployeeId(signUpRequest.getEmployeeId())) {
            throw new CustomException("Employee ID is already in use");
        }

        if (!signUpRequest.getPassword().equals(signUpRequest.getConfirmPassword())) {
            throw new CustomException("Passwords do not match");
        }

        Employee employee = new Employee();
        employee.setFullName(signUpRequest.getFullName());
        employee.setDepartment(signUpRequest.getDepartment());
        employee.setEmployeeId(signUpRequest.getEmployeeId());
        employee.setPassword(passwordEncoder.encode(signUpRequest.getPassword()));

        employeeRepository.save(employee);

        return ResponseEntity.ok("Employee registered successfully");
    }
}