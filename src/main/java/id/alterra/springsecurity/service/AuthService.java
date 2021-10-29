package id.alterra.springsecurity.service;

import id.alterra.springsecurity.model.User;
import id.alterra.springsecurity.payload.TokenResponse;
import id.alterra.springsecurity.payload.UsernamePassword;

public interface AuthService {
    User register(UsernamePassword req);
    TokenResponse generateToken(UsernamePassword req);
}
