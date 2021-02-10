package github.pathakgaurav.sampleregistrationbackend.service;

import github.pathakgaurav.sampleregistrationbackend.model.User;
import github.pathakgaurav.sampleregistrationbackend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUser() {
        if (userRepository.findAll().isEmpty()) {
            List<User> userList = Arrays.asList(
                    new User("Zack", "zack@gmail.com", 10, "Telecom")
                    , new User("Cody", "cody@gmail.com", 6, "Banking")
                    , new User("Michael", "michael@gmail.com", 3, "Automobile"));
            userRepository.saveAll(userList);
        }
        return userRepository.findAll();
    }

    public void deleteUser(Long id) {
        User user = findById(id);
        userRepository.delete(user);
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User findByEmail(String email){
        return userRepository.findByEmail(email);
    }
}
