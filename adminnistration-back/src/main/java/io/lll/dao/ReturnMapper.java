package io.lll.dao;

import io.lll.po.Return;
import org.springframework.stereotype.Repository;

@Repository
public abstract class ReturnMapper {
    public abstract int deleteByPrimaryKey(Integer returnId);

    public abstract int insert(Return record);

    public abstract int insertSelective(Return record);

    public abstract Return selectByPrimaryKey(Integer returnId);

    public abstract int updateByPrimaryKeySelective(Return record);

    public abstract int updateByPrimaryKey(Return record);
}