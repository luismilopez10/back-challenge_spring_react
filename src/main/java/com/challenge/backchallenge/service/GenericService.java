package com.challenge.backchallenge.service;

import java.util.List;

public interface GenericService<T,ID> {

    List<T> findAll();

    T save(T entity) throws Exception;

    T update(T entity) throws Exception;

    void deleteById(ID id) throws Exception;
}
