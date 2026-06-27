package com.nelioalves.workshopmongo.resources;

import com.nelioalves.workshopmongo.domain.User;
import com.nelioalves.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity <List<User>> findAll() {
        List<User> list = service.findAll();

        System.out.println("Tamanho da lista: " + list.size());
        return ResponseEntity.ok().body(list);
    }
}
