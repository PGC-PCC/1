package com.runbom.demo.dao;

import com.runbom.demo.model.Wcounter;

public interface WcounterMapper {
    int insert(Wcounter record);

    int insertSelective(Wcounter record);
}