package org.lightadmin.boot.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Table(name = "place")
public class Place implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "int(11)")
    private Integer id;

    @Column
    private String name;

//    @Column
//    private String address;
//
//    @Column(columnDefinition = "DOUBLE DEFAULT null")
//    private Double latitude;
//
//    @Column(columnDefinition = "DOUBLE DEFAULT null")
//    private Double longitude;
//
//    @Column(name = "created_at", insertable = false, updatable = false, columnDefinition = "datetime")
//    @org.hibernate.annotations.Generated(value = GenerationTime.INSERT)
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date createdAt;
//
//    @Column(name = "updated_at", insertable = false, updatable = false, columnDefinition = "datetime")
//    @org.hibernate.annotations.Generated(value = GenerationTime.ALWAYS)
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date updatedAt;

    @ManyToMany(mappedBy = "places")
    private Set<Post> posts;

    @ManyToMany(mappedBy = "places")
    private Set<User> users;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
