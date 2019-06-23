package com.yt.smvc.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yt.smvc.po.TbUser;
import com.yt.smvc.service.IUserService;

@Controller
@RequestMapping("/ssm")
public class UserController {
	@Resource(name = "userService")
	private IUserService userService;
	private int psize = 5;

	/**
	 * 测试
	 */
	@RequestMapping(value = "login.do")
	public String test() throws Exception {
		System.out.println("测试成功");
		return "success";
	}

	/**
	 * 注册
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "addUser.do")
	public ModelAndView addUser(HttpServletRequest request, TbUser userBean) throws Exception {
		// 调用业务层
		userService.addUser(userBean);
		return queryUsers(request);
	}

	@RequestMapping(value = "delUser.do")
	public ModelAndView delUser(HttpServletRequest request, String uid) throws Exception {
		int id = 0;
		if (!"".equals(uid))
			id = Integer.parseInt(uid);
		// 调用业务层
		userService.delUser(id);

		return queryUsers(request);
	}

	@RequestMapping(value = "updUser.do")
	public String updUser(HttpServletRequest request, TbUser tbUser) throws Exception {
		// 调用业务层
		userService.updUser(tbUser);
		return queryUser(request, tbUser.getUid());
	}

	@RequestMapping(value = "queryUser.do")
	public String queryUser(HttpServletRequest request, int uid) throws Exception {
		TbUser user = userService.findUser_id(uid);
		request.setAttribute("user", user);
		return "ShowUser";

	}

	@RequestMapping(value = "queryUsers.do")
	public ModelAndView queryUsers(HttpServletRequest request) throws Exception {
		// 测试forward后request是否可以共享
		int pno = 0;
		Object pnostr = request.getParameter("pno");
		if (pnostr != null)
			pno = Integer.parseInt(String.valueOf(pnostr).trim());
		if (pno <= 0)
			pno = 1;
		// 调用service查找 数据库
		List<TbUser> userls = userService.findUsers(pno, psize);
//		List<TbUser> userls =userService.queryUsers();
		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// 相当 于request的setAttribut，在jsp页面中通过itemsList取数据
		modelAndView.addObject("userls", userls);
		modelAndView.addObject("pstart", pno);
		// 指定视图
		// 下边的路径，如果在视图解析器中配置jsp路径的前缀和jsp路径的后缀，修改为
		// modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		// 上边的路径配置可以不在程序中指定jsp路径的前缀和jsp路径的后缀
		modelAndView.setViewName("ShowUsers");
		return modelAndView;
	}

}
