package com.corhuila.electivaii.Service;

import com.corhuila.electivaii.Entity.Person;
import com.corhuila.electivaii.IRepository.IBaseRepository;
import com.corhuila.electivaii.IRepository.IPersonRepository;
import com.corhuila.electivaii.IService.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService extends ABaseService<Person> implements IPersonService {

    @Override
    protected IBaseRepository<Person, Long> getRepository() {
        return repository;
    }
    @Autowired
    private IPersonRepository repository;
}
