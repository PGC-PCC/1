package com.runbom.demo.dao;

import com.runbom.demo.model.FisPool;

public interface FisPoolMapper {
    int insert(FisPool record);

    int insertSelective(FisPool record);
}