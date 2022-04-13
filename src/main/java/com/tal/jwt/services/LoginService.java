package com.tal.jwt.services;

import com.tal.jwt.beans.Credentials;
import com.tal.jwt.exceptions.LoginException;
import com.tal.jwt.repositories.UserRepo;
import com.tal.jwt.util.DataEnc;
import com.tal.jwt.util.JWT;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor

public class LoginService {
    private final UserRepo userRepo;
    private final JWT jwt;

    public String login(String userName, String userPass) throws LoginException {
        Optional<Credentials> credentials = userRepo.findByUserName(userName);
        if (credentials.isPresent()) {
            //System.out.println(credentials);
            if (DataEnc.getEncryptor(credentials.get().getUserPass()).equals(userPass)) {
                return jwt.generateToken(credentials.get());
            } else {
                throw new LoginException("Password mismatch !!!");
            }
        } else {
            throw new LoginException("User not found");
        }
    }
}
