package com.shardingjdbc.kang.common.util;

import java.util.List;

/**
 * @author kanghaijun
 * @create 2019/6/26
 * @describe
 */
public interface BaseService<T> {

    public T get(T t);

    public List<T> getAll(T t);

    public void update(T t);

    public void delete(T t);

    public void save(T t);

}
