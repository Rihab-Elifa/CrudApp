package com.example.crudApp.Controller;

import com.example.crudApp.model.User;
import com.example.crudApp.mongoRepository.userRepository;
import com.sun.management.VMOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost/4200/")
public class Controller {
    @Autowired
    private userRepository dao;

    public void setDao(userRepository dao) {
        this.dao = dao;
    }
    @RequestMapping(value="/add",method = RequestMethod.POST)
    public void addUser(@RequestBody User u){
       dao.save(u);

    }
    @RequestMapping(value="/delete",method = RequestMethod.DELETE)
    public void delete(@PathVariable int u)
    {
        dao.deleteById(u);
    }
    @RequestMapping(value="/find",method=RequestMethod.GET)
    public List<User> findAll(){
        return dao.findAll();
    }
}
