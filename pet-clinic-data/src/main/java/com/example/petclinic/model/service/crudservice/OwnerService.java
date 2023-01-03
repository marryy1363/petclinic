package com.example.petclinic.model.service.crudservice;

import com.example.petclinic.model.Owner;

import java.util.List;


/**
 * Created by jt on 7/18/18.
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);


 }
