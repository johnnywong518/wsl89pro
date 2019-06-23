package com.yt.smvc.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.yt.smvc.po.TbUser;
import com.yt.smvc.po.TbUserExample;

public interface TbUserMapper {
	int countByExample(TbUserExample example) throws Exception;

	int deleteByExample(TbUserExample example) throws Exception;

	int deleteByPrimaryKey(Integer uid) throws Exception;

	int insert(TbUser record) throws Exception;

	int insertSelective(TbUser record) throws Exception;

	List<TbUser> selectByExample(TbUserExample example) throws Exception;

	TbUser selectByPrimaryKey(Integer uid) throws Exception;

	int updateByExampleSelective(@Param("record") TbUser record, @Param("example") TbUserExample example)
			throws Exception;

	int updateByExample(@Param("record") TbUser record, @Param("example") TbUserExample example) throws Exception;

	int updateByPrimaryKeySelective(TbUser record) throws Exception;

	int updateByPrimaryKey(TbUser record) throws Exception;

	/**
	 * 分页
	 * 
	 * @param pstart
	 * @param psize
	 * @return
	 * @throws Exception
	 */
	List<TbUser> queryPageUsers(Map<String, Object> map) throws Exception;
}