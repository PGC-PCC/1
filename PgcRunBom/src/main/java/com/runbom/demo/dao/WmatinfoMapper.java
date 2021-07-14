package com.runbom.demo.dao;

import com.runbom.demo.model.Wmatinfo;

public interface WmatinfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(Wmatinfo record);

    int insertSelective(Wmatinfo record);

    Wmatinfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Wmatinfo record);

    int updateByPrimaryKey(Wmatinfo record);
}