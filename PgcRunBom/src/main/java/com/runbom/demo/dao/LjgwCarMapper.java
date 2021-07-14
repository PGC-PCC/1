package com.runbom.demo.dao;

import com.runbom.demo.model.LjgwCar;

public interface LjgwCarMapper {
    int deleteByPrimaryKey(String id);

    int insert(LjgwCar record);

    int insertSelective(LjgwCar record);

    LjgwCar selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(LjgwCar record);

    int updateByPrimaryKey(LjgwCar record);
}