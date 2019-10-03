package zayed.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import zayed.service.Validator;
import zayed.serviceImpl.ValidatorImpl;

@Configuration
@ComponentScan("zayed")
public class RootApplicationContextConfig {

    @Bean
    public Validator validator() {
      return new ValidatorImpl();
    }

}
