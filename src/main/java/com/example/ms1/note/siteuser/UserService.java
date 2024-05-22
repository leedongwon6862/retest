package com.example.ms1.note.siteuser;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    public SiteUser createUser(String loginId , String password , String nickname , String email) {
        SiteUser siteUser = new SiteUser ();
        siteUser.setLoginId (loginId);
        siteUser.setPassword (passwordEncoder.encode (password));
        siteUser.setNickname (nickname);
        siteUser.setEmail (email);
        return  userRepository.save(siteUser);
    }
}
