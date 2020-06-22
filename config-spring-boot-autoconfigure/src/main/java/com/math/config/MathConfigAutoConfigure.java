package com.math.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置类
 *
 * @author fanzhi.meng
 * @description
 * @date 2020-06-22 14:47
 */
@Configuration
@EnableConfigurationProperties(value = ConfigureProperties.class)
public class MathConfigAutoConfigure {

    private Logger logger = LoggerFactory.getLogger(MathConfigAutoConfigure.class);

    /**
     * 配置ExampleService
     *
     * @return {@link ConfigureService}
     */
    @Bean
    @ConditionalOnMissingBean
    public ConfigureService exampleService() {
        logger.info("Config ConfigureService Start...");
        ConfigureServiceImpl service = new ConfigureServiceImpl(properties.getId(), properties.getIp());
        logger.info("Config ConfigureService End.");
        return service;
    }

    /**
     * 注入ConfigureProperties
     */
    private final ConfigureProperties properties;

    public MathConfigAutoConfigure(ConfigureProperties properties) {
        this.properties = properties;
    }
}
