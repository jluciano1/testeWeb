package auth.permission;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.stereotype.Component;

/**
 * Classe que configura as permissões de acesso
 * 
 * @author Techne
 *
 */
@Component
public class SecurityPermission {

    
  public void loadSecurityPermission(HttpSecurity http) throws Exception {
    
    // public
    http.authorizeRequests().antMatchers("/**").permitAll();
  }
  
}
