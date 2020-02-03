package controller;

import model.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.UserService;

import java.util.List;

@RestController
public class RestPaging {
    private final ResponseEntity BAD_REQUEST = new ResponseEntity(HttpStatus.BAD_REQUEST);
    private final ResponseEntity NOT_FOUND = new ResponseEntity(HttpStatus.NOT_FOUND);
    private final ResponseEntity OK = new ResponseEntity(HttpStatus.OK);

    private final UserService service;

    @Autowired
    public RestPaging(UserService service) {
        this.service = service;
    }

    @GetMapping("/allUsers")
    public List<User> gelAllUsers(){
        return service.getAllUsers();
    }

    @PostMapping("/addUser")
    public ResponseEntity addUser(@NotNull @RequestBody User user){
        try {
            service.addUser(user);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            return BAD_REQUEST;
        }
        return OK;
    }

    @PostMapping("/login")
    public ResponseEntity loginAction(@NotNull @RequestBody User user){
        User userFromDB = service.getUserByLogin(user.getLogin());
        if (userFromDB.getPassword().equals(user.getPassword())) return OK;
        else return BAD_REQUEST;
    }
}
