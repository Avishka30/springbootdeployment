package lk.ijse.gdse.springbootdeployment.controller;

import lk.ijse.gdse.springbootdeployment.entity.Customer;
import lk.ijse.gdse.springbootdeployment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public String getCustomers() {
        return "Hello World";
    }
    @PostMapping("/save")
    public ResponseEntity<Customer> saveCustomer(Customer customer) {
        return ResponseEntity.ok(customerService.saveCustomer(customer));
    }
}
