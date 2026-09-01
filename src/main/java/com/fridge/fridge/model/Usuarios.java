package com.fridge.fridge.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Usuarios {

@Id
@GeneratedValue
    private Long id;
    private String user;
    private String email;
    private String senha;

// getters e setters
    public Long getid() { return getid(); }
    public void setId(Long id) { this.id = id; }

    public String getuser() { return user; }
    public void setuser(String User) { this.user = user; }

    public String getemail() { return email; }
    public void setemail(String Email) { this.email = Email; }

    public String getsenha() { return senha; }
    public void setsenha(String senha) { this.senha = senha; }

    }

