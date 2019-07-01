package org.xiaoyu.auth.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author jinxiaoyu
 * @date 2019/06/24 14:02
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/info")
    public Authentication authentication(Principal user) {
        return (Authentication) user;
    }
}
