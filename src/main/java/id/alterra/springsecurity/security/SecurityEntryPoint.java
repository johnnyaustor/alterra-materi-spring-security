package id.alterra.springsecurity.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import id.alterra.springsecurity.payload.InternalError;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class SecurityEntryPoint implements AuthenticationEntryPoint {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        httpServletResponse.setContentType("application/json");
        httpServletResponse.setStatus(401);
        InternalError error = new InternalError(401, "username & password required");
        httpServletResponse.getWriter().print(objectMapper.writeValueAsString(error));
    }
}
