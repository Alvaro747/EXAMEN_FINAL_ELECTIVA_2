package com.corhuila.electivaii.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User extends ABaseEntity{

    @Column(name = "user", length = 50, nullable = false, unique = true)
    private String user;

    @Column(name = "password", length = 50, nullable = false)
    private String password;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "person_id", nullable = false)
    private Person personId;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPersonId() {
        return personId;
    }

    public void setPersonId(Person personId) {
        this.personId = personId;
    }
}
