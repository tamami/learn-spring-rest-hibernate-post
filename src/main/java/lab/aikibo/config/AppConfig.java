package lab.aikibo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by tamami on 31/10/16.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"lab.aikibo"})
//@Import({HibernateConfiguration.class})
@Import({SecurityConfig.class})
public class AppConfig {
}
