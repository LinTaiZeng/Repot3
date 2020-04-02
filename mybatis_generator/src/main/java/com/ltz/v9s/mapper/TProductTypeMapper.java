package com.ltz.v9s.mapper;

import com.ltz.v9s.entity.TProductType;

public interface TProductTypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TProductType record);

    int insertSelective(TProductType record);

    TProductType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TProductType record);

    int updateByPrimaryKey(TProductType record);
}