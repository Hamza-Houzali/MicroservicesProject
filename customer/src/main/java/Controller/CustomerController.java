package Controller;

import Beans.Customer;
import Service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/customer")
public class CustomerController {
    @Autowired
    CustomerService service;

    @GetMapping("")
    public List<Customer> findAll() {
        return service.findAll();
    }
}
