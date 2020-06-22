package com.math.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author fanzhi.meng
 * @description
 * @date 2020-06-22 14:43
 */
@Data
@ConfigurationProperties(value = ConfigureProperties.DEFAULT_PREFIX)
public class ConfigureProperties {

    /**
     * PREFIX
     */
    public static final String DEFAULT_PREFIX = "com.math.config";
    /**
     * ID标识
     */
    private String id;

    /**
     * IP地址
     */
    private String ip;
}
