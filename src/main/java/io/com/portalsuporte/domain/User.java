package io.com.portalsuporte.domain;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String userId;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private String profileImgUrl;
    private Date lastLoginDate;
    private Date lastLoginDateDisplay;
    private Date joinDate;
    private String[] roles;
    private String[] authorities;
    private boolean isActive;
    private boolean isNotLocked;

}
