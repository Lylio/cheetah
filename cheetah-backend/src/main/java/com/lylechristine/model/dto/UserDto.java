package com.lylechristine.model.dto;

import com.lylechristine.model.domain.Authority;
import lombok.Data;

import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Lyle Christine
 */
public class UserDto {

    @Data
    public static class Create {
        private Long id;
        private String email;
        private String password;
        private String userName;
        private Set<String> authorities;
        private String createdBy;
        private LocalDateTime createdDate;
        private String lastModifiedBy;
        private LocalDateTime lastModifiedDate;
    }

    @Data
    public static class Update {
        private Long id;
        private String email;
        private Set<String> authorities;
    }

    public static class Response {
        private Long id;
        private String email;
        private Set<String> authorities;

        public void setAuthorities(Set<Authority> authorities) {
            this.authorities = authorities.stream().map(Authority::getName).collect(Collectors.toSet());
        }
    }

    public static class Login {
        private String login;

        @Size(min = 4, max = 12)
        private String password;
    }

}
