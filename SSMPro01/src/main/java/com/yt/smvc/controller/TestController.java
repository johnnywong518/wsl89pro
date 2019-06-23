package com.yt.smvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 开发实用
 * @author Administrator
 *
 */
@Controller
public class TestController {

	@RequestMapping(value = "/test.do")
	public String testUser() throws Exception {
		System.out.println("AA");
		return "success";
	}

}
