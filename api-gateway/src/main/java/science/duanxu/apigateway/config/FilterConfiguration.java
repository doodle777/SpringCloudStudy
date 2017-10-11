package science.duanxu.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import science.duanxu.apigateway.filters.AccessFilter;

@Configuration
public class FilterConfiguration {
    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
