package config;

import Beans.Customer;
import Service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Slf4j
@Configuration
public class CustomerConfig{

   /* @Bean
    public Customer LoadData(String nom, String prenom, String email) {
        //log.info("{} Loading customer into database");
        return Customer.builder()
                .nom(nom)
                .prenom(prenom)
                .email(email)
                .build();
    }*/

  /*  @Bean
    public String text (String txt){
        return "hey";
    }*/
}
