package com.yt.smvc.service;

import java.util.List;

import com.yt.smvc.po.TbUser;

public interface IUserService {
	int addUser(TbUser user) throws Exception;

	int delUser(int uid) throws Exception;

	int updUser(TbUser user) throws Exception;

	TbUser findUser_id(int id) throws Exception;

	List<TbUser> findUsers(int pno, int psize) throws Exception;

	List<TbUser> queryUsers() throws Exception;
}
