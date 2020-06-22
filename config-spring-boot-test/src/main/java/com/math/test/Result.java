package com.math.test;

import lombok.Builder;
import lombok.Data;

/**
 * @author fanzhi.meng
 * @description
 * @date 2020-06-22 15:05
 */
@Data
@Builder
public class Result {
    /**
     * 成功CODE
     */
    public static final String SUCCESS_CODE = "200";
    /**
     * 成功MSG
     */
    public static final String SUCCESS_MSG = "SUCCESS!";
    /**
     * code
     */
    private String code;
    /**
     * msg
     */
    private String msg;
    /**
     * data
     */
    private Object data;
}
