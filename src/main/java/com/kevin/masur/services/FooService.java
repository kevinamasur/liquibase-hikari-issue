package com.kevin.masur.services;

import com.kevin.masur.models.Foo;
import com.kevin.masur.repository.FooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FooService {

    @Autowired
    private FooRepository fooRepository;

    public void insert() {
        fooRepository.save(new Foo());
    }
}
