package com.corhuila.electivaii.Controller;

import com.corhuila.electivaii.Entity.Person;
import com.corhuila.electivaii.Entity.User;
import com.corhuila.electivaii.IService.IPersonService;
import com.corhuila.electivaii.IService.IUserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/user")
public class UserController extends ABaseController<User, IUserService> {
    public UserController(IUserService service) {
        super(service, "User");
    }
}
