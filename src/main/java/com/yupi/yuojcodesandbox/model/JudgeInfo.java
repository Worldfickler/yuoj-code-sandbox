package com.yupi.yuojcodesandbox.model;

import lombok.Data;

/**
 * 判题信息
 * @author Fickler
 * @date 2024/2/19 15:37
 */

@Data
public class JudgeInfo {

    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 消耗内存
     */
    private Long memory;

    /**
     * 消耗时间（kb）
     */
    private Long time;

}
