package configs;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

import java.util.ArrayList;

/**
 * Created by Ufuk on 09-05-15.
 */
@Configuration
@ComponentScan(basePackages = "javabasedconfiguration")
@Import({SecurityConfig.class, AppConfig.class})
@PropertySource("classpath:/tracks.properties")
public class CarConfig {

    @Autowired
    private Environment env;

    @Bean
    public ArrayList<String> play() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(env.getProperty("track1"));
        arrayList.add(env.getProperty("track2"));
        arrayList.add(env.getProperty("track3"));
        return arrayList;
    }
}