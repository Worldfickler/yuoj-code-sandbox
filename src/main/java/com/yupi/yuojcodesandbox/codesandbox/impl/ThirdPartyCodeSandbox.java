package com.yupi.yuojcodesandbox.codesandbox.impl;

import com.yupi.yuojcodesandbox.CodeSandbox;
import com.yupi.yuojcodesandbox.model.ExecuteCodeRequest;
import com.yupi.yuojcodesandbox.model.ExecuteCodeResponse;

/**
 * 第三方代码沙箱
 * @author Fickler
 * @date 2024/3/17 10:22
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
