package com.math.test;

import com.math.config.ConfigureInfo;
import com.math.config.ConfigureService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fanzhi.meng
 * @description
 * @date 2020-06-22 15:04
 */
@RestController
@RequestMapping(value = "/config")
public class ConfigController {

    public ConfigController(ConfigureService configureService) {
        this.configureService = configureService;
    }

    /**
     * 获取配置的IP 和ID
     *
     * @return {@link Result}
     */
    @GetMapping(value = "/info")
    public Result configInfo() {
        // 获取配置信息
        ConfigureInfo configureInfo = configureService.configInfo();
        // 封装返回
        return Result.builder()
                .code(Result.SUCCESS_CODE)
                .msg(Result.SUCCESS_MSG)
                .data(configureInfo).build();
    }

    /**
     * 注入 ConfigureService
     */
    private final ConfigureService configureService;
}
