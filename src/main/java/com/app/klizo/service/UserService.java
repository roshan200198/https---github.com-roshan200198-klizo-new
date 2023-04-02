package com.app.klizo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.klizo.entity.User;
import com.app.klizo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
    private UserRepository repository;

    public String addSignupData(User bean){
        try{
            repository.save(bean);

        }catch(Exception ex){
            return "Error occuring while inserting signup data!";

        }
        return "signup data added.";
    }

    public java.util.List<User> getSignupData(){

        return repository.findAll();
    }

}
