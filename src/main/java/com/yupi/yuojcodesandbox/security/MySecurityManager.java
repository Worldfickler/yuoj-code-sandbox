package com.yupi.yuojcodesandbox.security;

import java.security.Permission;

/**
 * @author Fickler
 * @date 2024/4/29 14:30
 */
public class MySecurityManager extends SecurityManager{
    // 检测所有权限
    @Override
    public void checkPermission(Permission perm) {
//        super.checkPermission(perm);
    }

    // 检测程序是否可执行文件
    @Override
    public void checkExec(String cmd) {
        throw new SecurityException("checkExec 权限异常" + cmd);
    }

    // 检查程序是否可读文件
    @Override
    public void checkRead(String file, Object context) {
        throw new SecurityException("checkRead 权限异常" + file);
    }

    // 检查程序是否可写文件
    @Override
    public void checkWrite(String file) {
        throw new SecurityException("checkWrite 权限异常" + file);
    }

    // 检查程序是否可删除文件
    @Override
    public void checkDelete(String file) {
        throw new SecurityException("checkDelete 权限异常" + file);
    }

    // 程序是否可连接网络
    @Override
    public void checkConnect(String host, int port) {
        throw new SecurityException("checkConnect 权限异常" + host + " : " + port);
    }
}
