package com.employee_management_app.controller;

import com.employee_management_app.dto.UserRegistrationDto;
import com.employee_management_app.service.UserService;
import org.springframework.web.bind.annotation.ModelAttribute;

public class UserRegistrationController {
    private UserService userService;
    public UserRegistrationController(UserService userService) {
        super();
        this.userService = userService;
    }
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }
    public String showRegistrationForm() {
        return "registration";
    }
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto userRegistrationDto) {
        userService.save(userRegistrationDto);
        return "redirect:/registration?success";
    }
}
