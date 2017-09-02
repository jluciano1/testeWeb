package auth.permission;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.stereotype.Component;

@Component
public class SecurityPermission {

  public void loadSecurityPermission(HttpSecurity http) throws Exception {
    http.authorizeRequests().antMatchers("/**").permitAll();
  }
  
}
