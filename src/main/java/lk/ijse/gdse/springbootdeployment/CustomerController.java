package lk.ijse.gdse.springbootdeployment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @GetMapping
    public String getCustomers() {
        return "Hello World";
    }
}
