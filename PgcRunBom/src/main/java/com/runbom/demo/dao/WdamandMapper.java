package com.runbom.demo.dao;

import com.runbom.demo.model.Wdamand;

public interface WdamandMapper {
    int insert(Wdamand record);

    int insertSelective(Wdamand record);
}