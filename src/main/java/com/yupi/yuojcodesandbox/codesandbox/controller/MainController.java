package com.yupi.yuojcodesandbox.codesandbox.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fickler
 * @date 2024/4/11 10:19
 */

@RestController
public class MainController {

    @GetMapping("/health")
    public String healthCheck() {
        return "ok";
    }

}
