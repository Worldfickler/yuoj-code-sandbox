package com.yupi.yuojcodesandbox.model;

import lombok.Data;

/**
 * 进程执行信息
 * @author Fickler
 * @date 2024/4/12 16:38
 */

@Data
public class ExecuteMessage {

    private Integer exitValue;

    private String message;

    private String errorMessage;

    private Long time;

}
