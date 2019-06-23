package com.yt.smvc.service.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yt.smvc.mapper.TbUserMapper;
import com.yt.smvc.po.TbUser;
import com.yt.smvc.po.TbUserExample;
import com.yt.smvc.service.IUserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements IUserService {

	@Resource(name = "tbUserMapper")
	private TbUserMapper userMapper;

	public int addUser(TbUser user) throws Exception {
		return userMapper.insert(user);
	}

	public int delUser(int uid) throws Exception {
		return userMapper.deleteByPrimaryKey(uid);
	}

	public int updUser(TbUser user) throws Exception {
		return userMapper.updateByPrimaryKey(user);
	}

	public TbUser findUser_id(int id) throws Exception {
		return userMapper.selectByPrimaryKey(id);
	}

	public List<TbUser> findUsers(int pno, int psize) throws Exception {
		final int pstart = (pno - 1) * psize;// 页码算法
		Map<String, Object> map = new LinkedHashMap<>();
		map.put("pstart", pstart);
		map.put("psize", psize);
		return userMapper.queryPageUsers(map);

	}

	public static List<String> getArrayStr(String arrStr, String splitStr) {
		List<String> arrayls = new ArrayList<>();
		String[] array = arrStr.split(splitStr);
		for (String s : array)
			arrayls.add(s);
		return arrayls;
	}

	public List<TbUser> queryUsers() throws Exception {
		TbUserExample userExample = new TbUserExample();
		// Criteria criteria = userExample.createCriteria();
		// criteria.andUnameLike("");
		return userMapper.selectByExample(userExample);
	}
}
