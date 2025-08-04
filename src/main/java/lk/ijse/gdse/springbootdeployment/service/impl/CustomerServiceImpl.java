package lk.ijse.gdse.springbootdeployment.service.impl;

import lk.ijse.gdse.springbootdeployment.entity.Customer;
import lk.ijse.gdse.springbootdeployment.repository.CustomerRepo;
import lk.ijse.gdse.springbootdeployment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepo customerRepo;
    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

}
