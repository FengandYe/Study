package io.lll.dao;

import io.lll.po.Administrator;
import org.springframework.stereotype.Repository;

@Repository
public abstract class AdministratorMapper {
    public abstract int deleteByPrimaryKey(Integer administratorId);

    public abstract int insert(Administrator record);

    public abstract int insertSelective(Administrator record);

    public abstract Administrator selectByPrimaryKey(Integer administratorId);

    public abstract int updateByPrimaryKeySelective(Administrator record);

    public abstract int updateByPrimaryKey(Administrator record);
}