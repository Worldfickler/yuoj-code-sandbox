package com.yupi.yuojcodesandbox.utils;

import com.yupi.yuojcodesandbox.model.ExecuteMessage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Fickler
 * @date 2024/4/12 16:37
 */
public class ProcessUtils {

    /**
     * 执行进程并获取信息
     * @param runProcess
     * @return
     */
    public static ExecuteMessage runProcessAndGetMessage(Process runProcess, String opName) {
        ExecuteMessage executeMessage = new ExecuteMessage();
        try {
            // 等待程序执行，获取错误码
            int exitValue = runProcess.waitFor();
            executeMessage.setExitValue(exitValue);
            // 正常退出
            if (exitValue == 0) {
                System.out.println(opName + "成功");
                // 分批获取进程的正确输出
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(runProcess.getInputStream()));
                StringBuilder compileOutputStringBuilder = new StringBuilder();
                String compileOutputLine;
                // 逐行读取
                while ((compileOutputLine = bufferedReader.readLine()) != null) {
                    compileOutputStringBuilder.append(compileOutputLine);
                }
                executeMessage.setMessage(compileOutputStringBuilder.toString());
            } else {
                // 异常退出
                System.out.println(opName + "错误，错误码：" + exitValue);
                // 分批获取进程的正确输出
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(runProcess.getInputStream()));
                StringBuilder compileOutputStringBuilder = new StringBuilder();
                String compileOutputLine;
                // 逐行读取
                while ((compileOutputLine = bufferedReader.readLine()) != null) {
                    compileOutputStringBuilder.append(compileOutputLine);
                }
                executeMessage.setMessage(compileOutputStringBuilder.toString());
                // 分批获取进程的错误输出
                BufferedReader errorBufferedReader = new BufferedReader(new InputStreamReader(runProcess.getErrorStream()));
                StringBuilder errorCompileOutputStringBuilder = new StringBuilder();
                String errorCompileOutputLine;
                // 逐行读取
                while ((errorCompileOutputLine = errorBufferedReader.readLine()) != null) {
                    errorCompileOutputStringBuilder.append(errorCompileOutputLine);
                }
                executeMessage.setErrorMessage(errorCompileOutputStringBuilder.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return executeMessage;
    }

}
