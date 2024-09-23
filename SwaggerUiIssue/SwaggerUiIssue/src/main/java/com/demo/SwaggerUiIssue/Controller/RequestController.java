package com.demo.SwaggerUiIssue.Controller;

import com.demo.SwaggerUiIssue.Model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class RequestController {
    static List<User> users;

    static {
        users = new ArrayList<>(Arrays.asList(
                new User("John", 21, "M"),
                new User("Cathy", 25, "F"),
                new User("Summar", 29, "F")
        ));
    }

    @GetMapping("/getusers")
    public List<User> getUsers(){
            return users;
    }

    @PostMapping("/addnewuser")
    public List<User> addNewUser(@RequestBody User usr){
        users.add(usr);
        return users;
    }

}
