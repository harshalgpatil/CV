package com.example.entities;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public interface UserDetails {

	Collection<? extends GrantedAuthority> getAuthorities();

	String getUsername();

	boolean isAccountNonExpired();

	boolean isAccountNonLocked();

	boolean isCredentialsNonExpired();

	boolean isEnabled();

	String getPassword();

}
