package org.lightadmin.boot.domain;


import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;


@Entity
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "int(11)")
    private Integer id;

    @Column(columnDefinition="char(36) BINARY CHARACTER SET utf8 COLLATE utf8_bin")
    private UUID uuid;

    @Column
    @NotBlank
    private String username;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_favorite", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "post_id", referencedColumnName = "id"))
    private Set<Post> posts;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_place", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "place_id", referencedColumnName = "id"))
    private Set<Place> places;

//    @Column(name = "full_name")
//    private String fullName;
//
//    @Column(name = "first_name")
//    private String firstName;
//
//    @Column(name = "last_name")
//    private String lastName;
//
//    @Column(unique = true)
//    private String email;
//
//    @Column
//    private String telephone;
//
//    @Column(columnDefinition = "int(11) DEFAULT 0")
//    private Integer age;
//
//    @Column(columnDefinition = "ENUM('none','male','female') DEFAULT 'none'")
//    @Enumerated(EnumType.STRING)
//    private Gender gender;
//
//    @Column(name = "is_first_login", columnDefinition = "tinyint(1) DEFAULT 1")
//    @NotNull
//    private Integer isFirstLogin;
//
//    @Column(name = "created_at", insertable = false, updatable = false, columnDefinition = "datetime")
//    @org.hibernate.annotations.Generated(value = GenerationTime.INSERT)
//    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
//    private Date createdAt;
//
//    @Column(name = "updated_at", insertable = false, updatable = false, columnDefinition = "datetime")
//    @org.hibernate.annotations.Generated(value = GenerationTime.ALWAYS)
//    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
//    private Date updatedAt;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }

    public Set<Place> getPlaces() {
        return places;
    }

    public void setPlaces(Set<Place> places) {
        this.places = places;
    }
}
