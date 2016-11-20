package com.kevin.masur.repository;

import com.kevin.masur.models.Foo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FooRepository extends CrudRepository<Foo, UUID> {

}
