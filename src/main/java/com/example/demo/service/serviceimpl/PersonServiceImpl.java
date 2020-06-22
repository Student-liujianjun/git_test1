package com.example.demo.service.serviceimpl;

import com.example.demo.mapper.PersonMapper;
import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
//@CacheConfig(cacheManager = "personCacheManager")
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonMapper personMapper;

    @Override
   // @Cacheable(key = "#id",cacheNames = "person")
    public Person queryById(Integer id) {
        return personMapper.queryById(id);
    }
}
