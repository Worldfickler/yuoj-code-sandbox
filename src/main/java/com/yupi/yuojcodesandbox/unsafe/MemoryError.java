package com.yupi.yuojcodesandbox.unsafe;

import java.util.ArrayList;
import java.util.List;

/**
 * 无限占用空间（浪费系统内存）
 * @author Fickler
 * @date 2024/4/25 16:18
 */
public class MemoryError {
    public static void main(String[] args) {
        ArrayList<byte[]> bytes = new ArrayList<>();
        while (true) {
            bytes.add(new byte[10000]);
        }
    }
}

