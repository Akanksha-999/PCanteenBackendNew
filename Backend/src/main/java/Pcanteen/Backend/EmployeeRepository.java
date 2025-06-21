package Pcanteen.Backend;


import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findByEmployeeId(String employeeId);
    boolean existsByEmployeeId(String employeeId);
	Optional<Employee> findByMobileNumber(String mobileNumber);
	
	
}