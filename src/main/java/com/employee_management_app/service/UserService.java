package com.employee_management_app.service;

import com.employee_management_app.dto.UserRegistrationDto;
import com.employee_management_app.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto userRegistrationDto);
}
