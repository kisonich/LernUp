package dz30Security.service;



import dz30Security.repository.UserRepository;
import dz30Security.model.Userr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

   private EmailService emailService;
//    public Userr save(Userr user) {
//
//        return userRepository.save(user);
//    }

    public Userr findById(int id) {

        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User Not Found"));
    }

    public List<Userr> findAll() {

        return userRepository.findAll();
    }

    public void deleteById(int id) {

        userRepository.deleteById(id);
    }

    public Userr update(Userr user) {
        Userr byId = findById(user.getId());

        String newMail = user.getEmail();

        String oldMail = byId.getEmail();

        if (!oldMail.equals(newMail)) {
            emailService.sendEmailConfirmation(newMail);

            userRepository.save(user);
        }
        return user;
    }


    @Autowired
    private PasswordEncoder passwordEncoder;

    public Userr save(Userr user) {
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        return userRepository.save(user);
    }
}
