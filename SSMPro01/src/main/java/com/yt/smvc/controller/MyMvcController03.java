package com.yt.smvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MyMvcController03 extends MultiActionController {

	public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return new ModelAndView("/user", "method", "add");
	}
	public ModelAndView updUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ModelAndView("/user", "method", "update");
	}

	public ModelAndView delUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ModelAndView("/user", "method", "del");
	}

	public ModelAndView queryUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ModelAndView("/user", "method", "query");
	}

	public ModelAndView queryUsers(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ModelAndView("/user", "method", "querys");
	}

}
