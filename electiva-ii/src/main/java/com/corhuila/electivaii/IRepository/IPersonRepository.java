package com.corhuila.electivaii.IRepository;

import com.corhuila.electivaii.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonRepository extends IBaseRepository<Person, Long> {
}
