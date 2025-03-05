package com.restaurant.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "users")
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column()
    private int role;

    @Column()
    private String name;

    @JsonIgnore
    @Column()
    private String password;

    @Column(nullable = false)
    private String avatar;

    @Column()
    private String remember_token;

    @Column()
    private Boolean status;

    @Column(nullable = false)
    private int created_by;

    @Column(nullable = false)
    private Date created_at;

    @Column(nullable = false)
    private int updated_by;

    @Column(nullable = false)
    private Date updated_at;

    public User() {}

    public User(int role, String name, String password, String avatar, Boolean status, int created_by, Date created_at, int updated_by, Date updated_at) {
        this.role = role;
        this.name = name;
        this.password = new BCryptPasswordEncoder().encode(password);
        this.avatar = avatar;
        this.remember_token = UUID.randomUUID().toString();
        this.status = status;
        this.created_by = created_by;
        this.created_at = created_at;
        this.updated_by = updated_by;
        this.updated_at = updated_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    @JsonProperty
    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getRemember_token() {
        return remember_token;
    }

    public void setRemember_token(String remember_token) {
        this.remember_token = remember_token;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public int getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(int updated_by) {
        this.updated_by = updated_by;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}
