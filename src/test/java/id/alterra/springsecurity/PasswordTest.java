package id.alterra.springsecurity;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;

import java.util.Base64;

@Log4j2
public class PasswordTest {

    @Test
    public void generatePassword() {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String password = encoder.encode("password");
        log.info(password);
    }

    @Test
    public void passwordEncoder_sha256() {
        PasswordEncoder encoder = new StandardPasswordEncoder();
        String password = encoder.encode("password");
        log.info(password);
    }

    @Test
    public void passwordEncoder_pbkdf2() {
        PasswordEncoder encoder = new Pbkdf2PasswordEncoder();
        String password = encoder.encode("password");
        log.info(password);
    }

    @Test
    public void generateBase64() {
        String userPass = "user:password";
        String encoded = Base64.getEncoder().encodeToString(userPass.getBytes());
        log.info("userPass: {}, encode: {}", userPass, encoded);
    }

    @Test
    public void decodeBase64() {
        String base64 = "eyJleHAiOjE2MzU4Njc5NTQsImlhdCI6MTYzNTg2NzM1NCwidXNlcm5hbWUiOiJ1c2VyIn0";
        byte[] decode = Base64.getDecoder().decode(base64);
        log.info("{}", new String(decode));
    }
}
