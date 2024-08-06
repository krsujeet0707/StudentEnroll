package com.StudentEnroll.Edu.util;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class CustomPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence rawPassword) {
        // Implement your hashing logic here
        return rawPassword.toString(); // This is just an example, you should implement proper hashing
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        // Implement your password matching logic here
        return rawPassword.toString().equals(encodedPassword); // This is just an example
    }
}

