package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;

/**
 * Created by akhmelov on 5/10/16.
 */
@Configuration
public class TestConfiguration {

    @Bean
    public TilesConfigurer tilesConfigurer() {
        TilesConfigurer configurer = new TilesConfigurer();
        configurer.setDefinitions(new String[] { "file:src/main/webapp/WEB-INF/tiles/tiles.xml" });
        configurer.setCheckRefresh(true);
        return configurer;
    }
}