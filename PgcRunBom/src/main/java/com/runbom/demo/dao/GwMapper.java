package com.runbom.demo.dao;

import com.runbom.demo.model.Gw;

public interface GwMapper {
    int deleteByPrimaryKey(String id);

    int insert(Gw record);

    int insertSelective(Gw record);

    Gw selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Gw record);

    int updateByPrimaryKey(Gw record);
}