package com.service.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tk.mybatis.mapper.common.Mapper;

public abstract class BaseServcie<T> {
	@Autowired
    protected Mapper<T> mapper;

    public Mapper<T> getMapper() {
        return mapper;
    }

    public T selectByKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    public T queryone(T obj) {
        return mapper.selectOne(obj);
    }

    
    public int save(T entity) {
        return mapper.insert(entity);
    }

    public int delete(Object key) {
        return mapper.deleteByPrimaryKey(key);
    }

    public int updateAll(T entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    public int updateNotNull(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }
    
    public int updatrByExample(T entity,Object example){
    	return mapper.updateByExampleSelective(entity, example);
    }

    public List<T> selectByExample(Object example) {
        return mapper.selectByExample(example);
    }

}
