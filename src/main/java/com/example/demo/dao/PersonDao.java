package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.List;
import java.util.UUID;

public interface PersonDao {

//define meth to insert person to db

    int insertPerson (UUID id, Person person);

    default int insertPerson(Person person){
        UUID id = UUID.randomUUID(); //generate id ourselves
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

}


