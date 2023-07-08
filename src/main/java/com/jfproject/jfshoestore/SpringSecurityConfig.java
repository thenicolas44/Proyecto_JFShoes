package com.jfproject.jfshoestore;

import java.io.IOException;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.jfproject.jfshoestore.model.service.Service_UsuarioSecurity.UsuarioSecurityService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Configuration
public class SpringSecurityConfig{
    
    @Autowired
    private UsuarioSecurityService userService;

    @Bean
    public static BCryptPasswordEncoder encriptarPassword(){
        return new BCryptPasswordEncoder();
    }

    @Autowired
    public void criptografiaPassword(AuthenticationManagerBuilder outh) throws Exception{
        outh.userDetailsService(userService).passwordEncoder(encriptarPassword());
    }

    @Bean
    public CustomAuthenticationSuccessHandler customAuthenticationSuccessHandlerNew(){
        return new CustomAuthenticationSuccessHandler();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests()
        .requestMatchers("/*","/login/*").permitAll()
        .requestMatchers("/detalle/**").hasAuthority("Usuario")
        .requestMatchers("/admin/**").hasAuthority("ADMINISTRADOR")
        .anyRequest().authenticated()
        .and().formLogin().loginPage("/login/").successHandler(customAuthenticationSuccessHandlerNew())// Utiliza el controlador personalizado en lugar de defaultSuccessUrl
        .and().logout().permitAll();
        return http.build();
    }

    /*
     * 
     */
    
    



    @Bean

    public WebSecurityCustomizer webSecurityCustomizer() throws Exception{
        return (web)->web.ignoring().requestMatchers("/css/**","/js/**","/images/**", "/assets/**", "/demo/**", "/webfonts/**", "/fuentes/**","/administrador_usuarios/**");
    }
    /*
    @Bean
    public InMemoryUserDetailsManager configureAuthentication(){
        List<UserDetails> listaUsuarios = new ArrayList<>();
        List<GrantedAuthority> rolesAdministradores = new ArrayList<>();
        List<GrantedAuthority> rolesUsuarios = new ArrayList<>();
        rolesAdministradores.add(new SimpleGrantedAuthority("ADMIN"));
        rolesUsuarios.add(new SimpleGrantedAuthority("USER"));
        listaUsuarios.add(new User("Administrador", "{noop}123456", rolesAdministradores));
        listaUsuarios.add(new User("Jorge", "{noop}123456", rolesUsuarios));
        return new InMemoryUserDetailsManager(listaUsuarios);
    }
     */

    
}
