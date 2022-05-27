package Service;

import Beans.Customer;
import Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public abstract class CustomerService implements CustomerRepository {

    @Autowired
    CustomerRepository repository;


    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public Customer saveAndFlush(Customer c) {
        return repository.saveAndFlush(c);
    }
}
