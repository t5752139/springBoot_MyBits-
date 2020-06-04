package com.example.service.impl;

import com.example.mapper.PersonAuthorityMapper;
import com.example.service.PersonAuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonAuthorityServiceImpl implements PersonAuthorityService {

    @Autowired
    private PersonAuthorityMapper personAuthorityMapper;


    @Override
    public void datagridMenu(Integer uid, Integer cid) {
        personAuthorityMapper.datagridMenu(uid,cid);
    }
}
