package com.manage.controller;

import com.manage.model.Customer;
import com.manage.service.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ManageController {
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    @GetMapping("/Show")
    public ModelAndView ShowList() {
        List<Customer> customerList = customerService.findAll();
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("cus", customerList);
        return modelAndView;

    }

//    @PutMapping
//    @DeleteMapping

}
