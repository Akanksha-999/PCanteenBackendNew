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
    
    @Column(name = "mobile_number")
    private String mobileNumber;
    
    
    @Column(nullable = false)
    private String password;
    
    @Transient
    private String confirmPassword;
    
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt; 
    
    @Column(name = "reset_password_otp")
    private String resetPasswordOtp;

    @Column(name = "reset_password_otp_expiry")
    private LocalDateTime resetPasswordOtpExpiry;
    
    //@Column(name = "temp_email")
    //private String tempEmail;

    // Add getter and setter
    
    public Employee() {
    }

public Employee(Long id, String fullName, String employeeId, String department, String mobileNumber,
			String password, String confirmPassword, LocalDateTime createdAt, String resetPasswordOtp,
			LocalDateTime resetPasswordOtpExpiry) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.employeeId = employeeId;
		this.department = department;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.createdAt = createdAt;
		this.resetPasswordOtp = resetPasswordOtp;
		this.resetPasswordOtpExpiry = resetPasswordOtpExpiry;
		
	}

/*
	public Employee(Long id, String fullName, String employeeId, String department, String mobileNumber,
			String password, String confirmPassword, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.employeeId = employeeId;
		this.department = department;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.createdAt = createdAt;
	}
*/
    

	/*public String getTempEmail() {
		return tempEmail;
	}

	public void setTempEmail(String tempEmail) {
		this.tempEmail = tempEmail;
	}
*/
	public String getResetPasswordOtp() {
		return resetPasswordOtp;
	}

/*
	public Employee(Long id, String fullName, String employeeId, String department, String mobileNumber, String password,
		String confirmPassword, LocalDateTime createdAt, String resetPasswordOtp,
		LocalDateTime resetPasswordOtpExpiry) {
	super();
	this.id = id;
	this.fullName = fullName;
	this.employeeId = employeeId;
	this.department = department;
	this.mobileNumber = mobileNumber;
	this.password = password;
	this.confirmPassword = confirmPassword;
	this.createdAt = createdAt;
	this.resetPasswordOtp = resetPasswordOtp;
	this.resetPasswordOtpExpiry = resetPasswordOtpExpiry;
}
*/
	public void setResetPasswordOtp(String resetPasswordOtp) {
		this.resetPasswordOtp = resetPasswordOtp;
	}


	public LocalDateTime getResetPasswordOtpExpiry() {
		return resetPasswordOtpExpiry;
	}


	public void setResetPasswordOtpExpiry(LocalDateTime resetPasswordOtpExpiry) {
		this.resetPasswordOtpExpiry = resetPasswordOtpExpiry;
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


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
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
