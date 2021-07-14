package com.runbom.demo.dao;

import com.runbom.demo.model.Ljgw;

public interface LjgwMapper {
    int deleteByPrimaryKey(String id);

    int insert(Ljgw record);

    int insertSelective(Ljgw record);

    Ljgw selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Ljgw record);

    int updateByPrimaryKey(Ljgw record);
}