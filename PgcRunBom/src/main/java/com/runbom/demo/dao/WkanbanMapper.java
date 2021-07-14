package com.runbom.demo.dao;

import com.runbom.demo.model.Wkanban;

public interface WkanbanMapper {
    int deleteByPrimaryKey(String kbno);

    int insert(Wkanban record);

    int insertSelective(Wkanban record);

    Wkanban selectByPrimaryKey(String kbno);

    int updateByPrimaryKeySelective(Wkanban record);

    int updateByPrimaryKey(Wkanban record);
}