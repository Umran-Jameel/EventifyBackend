package com.Eventify.entities;
import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int user_id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "user_type")
    private String user_type; //super admin, admin, student

    @Column(name = "university_id")
    private int university_id;

    @ManyToMany(mappedBy = "users")
    private Set<Rso> rsos = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "university_id", referencedColumnName = "university_id")
    private University university;

    public User (String username, String password, String email, String user_type)
    {
        this.username = username;
        this.password = password;
        this.email = email;
        this.user_type = user_type;
    }

    // Setters and Getters
    public int getUserId()
    {
        return user_id;
    }

    public void setUserId(int user_id)
    {
        this.user_id = user_id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getUserType()
    {
        return user_type;
    }

    public void setUserType(String userType)
    {
        this.user_type = user_type;
    }

    public University getUniversity()
    {
        return university;
    }

    public void setUniversity(University university)
    {
        this.university = university;
    }

    public Set<Rso> getRsos()
    {
        return rsos;
    }

    public void setRsos(Set<Rso> rsos)
    {
        this.rsos = rsos;
    }
}