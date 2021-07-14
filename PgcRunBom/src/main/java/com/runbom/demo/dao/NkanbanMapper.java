package com.runbom.demo.dao;

import com.runbom.demo.model.Nkanban;

public interface NkanbanMapper {
    int deleteByPrimaryKey(String kbno);

    int insert(Nkanban record);

    int insertSelective(Nkanban record);

    Nkanban selectByPrimaryKey(String kbno);

    int updateByPrimaryKeySelective(Nkanban record);

    int updateByPrimaryKey(Nkanban record);
}