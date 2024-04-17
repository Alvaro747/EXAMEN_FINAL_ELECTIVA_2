package com.corhuila.electivaii.IRepository;

import com.corhuila.electivaii.Entity.Person;
import com.corhuila.electivaii.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends IBaseRepository<User, Long> {
}
