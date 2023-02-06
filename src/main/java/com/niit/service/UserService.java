package com.niit.service;

import com.niit.model.User;

import java.util.List;

public interface UserService {
    public User registerUser(User user);
    public boolean deleteUser(int userId);
    public User checkAuth(User user);
    public List<User> getAllUsers();
}
