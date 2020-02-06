package model;

import org.springframework.security.core.GrantedAuthority;

public enum UserRole implements GrantedAuthority {
    USER,
    ADMINISTRATOR,
    ANONYMOUS;

    UserRole() {
    }

    @Override
    public String getAuthority() {
        return name();
    }
}
