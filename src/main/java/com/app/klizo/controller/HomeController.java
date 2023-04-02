package com.app.klizo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.klizo.entity.User;
import com.app.klizo.service.UserService;

@RestController
public class HomeController {

    @Autowired
    private UserService service;
    

    @RequestMapping(method=RequestMethod.POST, value = "/savedata")
    @CrossOrigin(origins = "*")
    public String addSignupData(@RequestBody User bean) {
        System.out.println("we are in controller!");

    

        return service.addSignupData(bean);
        //System.out.println("after controller!");

    }

    //To get contact us data
     @GetMapping("/viewdata")
     @CrossOrigin(origins = "*")
     public java.util.List<User> viewSignupData(User bean){
     return service.getSignupData();
     }
    
}
