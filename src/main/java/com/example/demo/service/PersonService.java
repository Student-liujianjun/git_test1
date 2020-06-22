package com.example.demo.service;

import com.example.demo.mapper.PersonMapper;
import com.example.demo.model.Person;

public interface PersonService {

    Person queryById(Integer id);

}
