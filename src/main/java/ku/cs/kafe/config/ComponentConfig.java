package ku.cs.kafe.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComponentConfig {
    @Bean
    public ModelMapper modelMapper(){ //map dto dao
        return new ModelMapper();
    }
}
//Peerasit Ployaram 6410451237