package com.example.demo.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        // In production: load from database
        if ("admin".equals(username)) {
            return User.builder()
                    .username("admin")
                    .password("{noop}password") // Use encoder in real apps
                    .roles("ADMIN")
                    .build();
        }
        throw new UsernameNotFoundException("User not found");
    }

	public com.example.demo.entity.User saveUser(com.example.demo.entity.User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<com.example.demo.entity.User> findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<com.example.demo.entity.User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
}
