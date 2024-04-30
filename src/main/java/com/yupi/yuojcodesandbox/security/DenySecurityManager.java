package com.yupi.yuojcodesandbox.security;

import java.security.Permission;

/**
 * 禁用所有权限安全管理器
 * @author Fickler
 * @date 2024/4/29 14:27
 */
public class DenySecurityManager extends SecurityManager{
    @Override
    public void checkPermission(Permission perm) {
        throw new SecurityException("权限异常：" + perm.toString());
    }
}
