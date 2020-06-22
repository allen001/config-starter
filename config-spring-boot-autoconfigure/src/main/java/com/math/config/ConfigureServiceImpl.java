package com.math.config;

/**
 * @author fanzhi.meng
 * @description
 * @date 2020-06-22 14:46
 */
public class ConfigureServiceImpl implements ConfigureService {

    /**
     * ID
     */
    private String id;
    /**
     * ip
     */
    private String ip;

    /**
     * 构造函数
     *
     * @param id ID
     * @param ip IP
     */
    public ConfigureServiceImpl(String id, String ip) {
        this.id = id;
        this.ip = ip;
    }


    /**
     * 获取配置信息
     *
     * @return {@link ConfigureInfo}
     */
    @Override
    public ConfigureInfo configInfo() {
        return ConfigureInfo.builder()
                .id(this.id)
                .ip(this.ip).build();
    }
}
