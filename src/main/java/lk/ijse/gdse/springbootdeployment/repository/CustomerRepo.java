package lk.ijse.gdse.springbootdeployment.repository;

import lk.ijse.gdse.springbootdeployment.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
