package com.vesta.controller;

import com.vesta.controller.view.Token;
import com.vesta.controller.view.UserView;
import com.vesta.service.dto.AccountCredential;
import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RequestMapping("/user")
@Api(value = "User Controller REST Endpoint")
public interface UserController {

    @PostMapping("/login")
    Map<String, String> login(@RequestBody AccountCredential accountCredential) throws Exception;


    @GetMapping("/{id}")
    UserView getById(@PathVariable Long id);


    @GetMapping
    List<UserView> findAll();

    @PostMapping("/registration")
    @ResponseStatus(HttpStatus.CREATED)
    void create(@Valid @RequestBody UserView userView);

    @PutMapping("/{id}")
    UserView update(@PathVariable("id") Long id, @RequestBody UserView userView);

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id);

    @PostMapping("/refresh")
    Token refreshToken(String refreshToken);
}