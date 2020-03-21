package danieldrzazga.com.github.weedingplaner.config;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by "Daniel Drzazga" on 21.03.2020
 */
@Configuration
public class WebConfig {

    @Bean
    public MapperFacade mapper(){
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().useBuiltinConverters(true).build();

        return mapperFactory.getMapperFacade();
    }

}
