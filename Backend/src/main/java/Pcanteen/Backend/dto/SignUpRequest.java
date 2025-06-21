/*package Pcanteen.Backend.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class SignUpRequest {
    @NotBlank(message = "Full name is required")
    private String fullName;
    
    @NotBlank(message = "Department is required")
    private String department;
    
    @NotBlank(message = "Employee ID is required")
    private String employeeId;
    
    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password;
    
    private String confirmPassword;
}
*/
package Pcanteen.Backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignUpRequest {
    private String fullName;
    private String department;
    private String employeeId;
    private String password;
    private String confirmPassword;
    private String mobileNumber;
    
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public SignUpRequest(String fullName, String department, String employeeId, String password, String confirmPassword,
			String mobileNumber) {
		super();
		this.fullName = fullName;
		this.department = department;
		this.employeeId = employeeId;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.mobileNumber = mobileNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	/*
	public SignUpRequest(String fullName, String department, String employeeId, String password,
			String confirmPassword) {
		super();
		this.fullName = fullName;
		this.department = department;
		this.employeeId = employeeId;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}*/
	public SignUpRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}