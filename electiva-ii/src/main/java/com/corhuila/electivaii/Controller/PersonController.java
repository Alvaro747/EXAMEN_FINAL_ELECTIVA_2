package com.corhuila.electivaii.Controller;

import com.corhuila.electivaii.Entity.Person;
import com.corhuila.electivaii.IService.IPersonService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/person")
public class PersonController extends ABaseController<Person, IPersonService> {
    public PersonController(IPersonService service) {
        super(service, "Person");
    }
}
