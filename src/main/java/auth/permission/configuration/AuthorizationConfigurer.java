package auth.permission.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import auth.permission.SecurityPermission;

@Configuration
@EnableWebSecurity
public class AuthorizationConfigurer extends WebSecurityConfigurerAdapter {

	@Autowired
	private SecurityPermission securityPermission;

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable();

		securityPermission.loadSecurityPermission(http);

		http.headers().frameOptions().disable().httpStrictTransportSecurity().disable();
	}
}
