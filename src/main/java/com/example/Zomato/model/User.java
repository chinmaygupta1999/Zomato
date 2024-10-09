package com.example.Zomato.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String userName;
    private String password;

    public String getUserName() {
        return this.userName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Object getPassword() {
        return this.password;
    }

    public Long getId() {
        return this.id;
    }
}
