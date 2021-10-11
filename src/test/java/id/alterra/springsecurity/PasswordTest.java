package id.alterra.springsecurity;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

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
    public void generateBase64() {
        String userPass = "user:password";
        String encoded = Base64.getEncoder().encodeToString(userPass.getBytes());
        log.info("userPass: {}, encode: {}", userPass, encoded);
    }
}
