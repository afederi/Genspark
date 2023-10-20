package org.example.Service;

import org.example.Entity.CustonUserDetails;
import org.example.Entity.User;
import org.example.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.stream.Collectors;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final User user = this.userRepository.findByUsername(username);

        if(user == null){
            throw new UsernameNotFoundException("User not found !!");
        }else {
            return new CustonUserDetails(user);
        }

//        if(user.getRole().equals("ADMIN")){
//            return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), Arrays.stream(user.getRole().split(" ")).collect(Collectors.toList()).stream().map(role->new SimpleGrantedAuthority(role)).collect(Collectors.toList()));
//        }else{
//            throw new UsernameNotFoundException("User not found !!!");
//        }
    }
}
