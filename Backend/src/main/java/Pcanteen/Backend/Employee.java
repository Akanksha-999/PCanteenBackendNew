package Pcanteen.Backend;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "employee")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    
    @Column(name = "full_name", nullable = false)
    private String fullName;
    
    @Column(name = "employee_id", nullable = false, unique = true)
    private String employeeId;
    
    @Column(nullable = false)
    private String department;
    
    @Column(nullable = false)
    private String password;
    
    @Transient
    private String confirmPassword;
    
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt; 
    
    
    public Employee() {
    }
    
    
    public Employee(String fullName, String employeeId, String department, 
                   String password, String confirmPassword) {
        this.fullName = fullName;
        this.employeeId = employeeId;
        this.department = department;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.createdAt = LocalDateTime.now();
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
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

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
    
}
/*package Pcanteen.Backend;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "employee")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "full_name", nullable = false)
    @NotBlank(message = "Full name is required")
    private String fullName;
    
    @Column(name = "employee_id", nullable = false, unique = true)
    @NotBlank(message = "Employee ID is required")
    private String employeeId;
    
    @Column(nullable = false)
    @NotBlank(message = "Department is required")
    private String department;
    
    @Column(nullable = false)
    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password;
    
    @Transient
    private String confirmPassword;
    
    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;
    
    public Employee() {}
    
    public Employee(String fullName, String employeeId, String department, 
                   String password, String confirmPassword) {
        this.fullName = fullName;
        this.employeeId = employeeId;
        this.department = department;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
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

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
    
}*/