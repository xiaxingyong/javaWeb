package com.example.demo;

import com.example.demo.domain.User;
import com.example.demo.enums.ResultEnum;
import com.example.demo.exception.UserException;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "hello springboot";
    }

    @RequestMapping(value="/exception",method = RequestMethod.GET)
    public void testException() throws Exception{
        throw new UserException(ResultEnum.TYPEA);
    }

    /** restful api */

    @GetMapping(value = "/user/getUser")
    public void getUser(@PathVariable Integer id){
    }


    @PostMapping(value="/user/newUser")
    public void newUser(@Valid User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){

        }

    }

    @PutMapping(value="/user/modifyUser")
    public void modifyUser(User user){

    }

    @DeleteMapping("value=/user/deleteUser")
    public void deleteUser(@PathVariable Integer id){

    }

}
