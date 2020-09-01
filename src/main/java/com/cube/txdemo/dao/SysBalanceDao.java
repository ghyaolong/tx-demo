package com.cube.txdemo.dao;

import com.cube.txdemo.entity.SysBalance;

public interface SysBalanceDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SysBalance record);

    int insertSelective(SysBalance record);

    SysBalance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysBalance record);

    int updateByPrimaryKey(SysBalance record);
}