package com.math.config;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 配置信息
 *
 * @author fanzhi.meng
 * @description
 * @date 2020-06-22 14:42
 */
@Data
@Builder
public class ConfigureInfo implements Serializable {

    /**
     * ID
     */
    private String id;
    /**
     * IP地址
     */
    private String ip;
}
