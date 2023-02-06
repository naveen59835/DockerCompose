package com.niit.service;

import com.niit.model.User;

import java.util.Map;

public interface SecurityTokenGenerator {
    public Map<String, String>generateToken(User user);
}
