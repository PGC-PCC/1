package com.runbom.demo.dao;

import com.runbom.demo.model.M100;

public interface M100Mapper {
    int deleteByPrimaryKey(String id);

    int insert(M100 record);

    int insertSelective(M100 record);

    M100 selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(M100 record);

    int updateByPrimaryKey(M100 record);
}