/*package Pcanteen.Backend.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
    private String employeeId;
    private String token;
    private String fullName;
    private String department;
}
*/
package Pcanteen.Backend.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
	 private String employeeId;
	    private String token;
	    private String fullName;
	    private String department;
	    
		public String getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(String employeeId) {
			this.employeeId = employeeId;
		}
		public String getToken() {
			return token;
		}
		public void setToken(String token) {
			this.token = token;
		}
		public String getFullName() {
			return fullName;
		}
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}
		public String getDepartment() {
			return department;
		}
		public AuthResponse() {
			super();
			// TODO Auto-generated constructor stub
		}
		public AuthResponse(String employeeId, String token, String fullName, String department) {
			super();
			this.employeeId = employeeId;
			this.token = token;
			this.fullName = fullName;
			this.department = department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
	    
}


