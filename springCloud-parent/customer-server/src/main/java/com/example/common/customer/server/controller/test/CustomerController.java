package com.example.common.customer.server.controller.test;

import com.example.common.customer.server.feign.product.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2020/1/22.
 */
@RestController
@RequestMapping(value = "/user")
public class CustomerController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String get(@PathVariable("id") Integer id) {

        return userService.getUserById(id);

    }
}
