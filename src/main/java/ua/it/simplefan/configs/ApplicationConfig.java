package ua.it.simplefan.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@EnableWebMvc
public class ApplicationConfig implements WebMvcConfigurer {

    private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
            "classpath:/META-INF/resources/", "classpath:/resources/static/", "classpath:/static/" , "classpath:/META-INF/resources/webjars/"};

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/**", "/webjars/**")
                .addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);
    }

}
