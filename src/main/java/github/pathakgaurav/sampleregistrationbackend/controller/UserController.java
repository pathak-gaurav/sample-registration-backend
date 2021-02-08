package github.pathakgaurav.sampleregistrationbackend.controller;

import github.pathakgaurav.sampleregistrationbackend.model.User;
import github.pathakgaurav.sampleregistrationbackend.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class UserController {

    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/findAllUser")
    public List<User> findAllUser() {
        return service.findAllUser();
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
        return service.saveUser(user);
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user) {
        if (service.findById(user.getId()) == null) {
            throw new RuntimeException("User Not Found");
        }
        return service.updateUser(user);
    }

    @GetMapping("/user/{id}")
    public User findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        service.deleteUser(id);
    }

}
