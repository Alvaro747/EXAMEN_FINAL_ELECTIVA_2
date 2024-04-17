package com.corhuila.electivaii.Service;

import com.corhuila.electivaii.Entity.User;
import com.corhuila.electivaii.IRepository.IBaseRepository;
import com.corhuila.electivaii.IRepository.IUserRepository;
import com.corhuila.electivaii.IService.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ABaseService<User> implements IUserService {

    @Override
    protected IBaseRepository<User, Long> getRepository() {
        return repository;
    }
    @Autowired
    private IUserRepository repository;
}
