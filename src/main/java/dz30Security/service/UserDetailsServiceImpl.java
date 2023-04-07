package dz30Security.service;





import dz30Security.repository.UserRepository;
import dz30Security.model.Userr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User;

import java.util.Collections;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Userr user = userRepository.findByLogin(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        return new User(user.getLogin(), user.getPassword(), Collections.emptyList());
    }
}