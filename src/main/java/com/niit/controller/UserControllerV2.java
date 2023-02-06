/*
 * Author : Naveen Kumar
 * Date : 06-02-2023
 * Created With : IntelliJ IDEA Community Edition
 */

package com.niit.controller;

import com.niit.model.User;
import com.niit.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2")

public class UserControllerV2 {
    UserService userService;

    public UserControllerV2(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>> getAllUser() {
        return new ResponseEntity<List<User>>(userService.getAllUsers(), HttpStatus.OK);
    }
    @DeleteMapping("/users/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable int userId) {
        if(userService.deleteUser(userId)){
            return new ResponseEntity<String>("User Deleted Successfully",HttpStatus.OK);

        }else{
            return new ResponseEntity<String>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
