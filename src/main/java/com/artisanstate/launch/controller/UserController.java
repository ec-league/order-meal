package com.artisanstate.launch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ethan(baiyp) <br/>
 * Date: 2015/8/31.
 */
@Controller
@RequestMapping("/")
public class UserController {

	@RequestMapping("/login")
	public String loginInPage() {
		return "login";
	}

    public String signIn() {
        return null;
    }

    public String signUp() {
		return null;
    }
}
