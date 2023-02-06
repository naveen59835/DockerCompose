/*
 * Author : Naveen Kumar
 * Date : 06-02-2023
 * Created With : IntelliJ IDEA Community Edition
 */

package com.niit.service;

import com.niit.model.User;
import com.niit.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User registerUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public boolean deleteUser(int userId) {
        if(userRepo.findById(userId).isPresent()){
            User user = userRepo.findById(userId).get();
            userRepo.delete(user);
            return true;

        }
        return false;
    }

    @Override
    public User checkAuth(User user) {
        User user1 =userRepo.findById(user.getUserId()).get();
        if(user1 != null){
            if(user1.getPassword().equals(user.getPassword())){
                return user;

            }else {
                return null;
            }
            }else {
                return null;
            }
        }


    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
}
