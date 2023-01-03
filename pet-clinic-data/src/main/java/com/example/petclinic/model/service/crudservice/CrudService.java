package com.example.petclinic.model.service.crudservice;

import java.util.Set;

/**
 * Created by jt on 7/21/18.
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
