package com.runbom.demo.dao;

import com.runbom.demo.model.Nmatinfo;

public interface NmatinfoMapper {
    int insert(Nmatinfo record);

    int insertSelective(Nmatinfo record);
}