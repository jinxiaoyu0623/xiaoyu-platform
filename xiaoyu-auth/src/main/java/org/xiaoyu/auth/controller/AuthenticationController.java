package org.xiaoyu.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jinxiaoyu
 * @date 2019/05/28 13:42
 */
@RestController
@RequestMapping("/authentication")
public class AuthenticationController {

    @GetMapping("/require")
    public ModelAndView require() {
        return new ModelAndView("login");
    }
}
