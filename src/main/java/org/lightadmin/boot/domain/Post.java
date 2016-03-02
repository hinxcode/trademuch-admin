package org.lightadmin.boot.domain;


import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;


@Entity
@Table(name = "post")
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "int(11)")
    private Integer id;

    @Column(columnDefinition="char(36) BINARY CHARACTER SET utf8 COLLATE utf8_bin")
    private UUID uuid;

    @Column
//    @NotBlank
    private String title;

//    @Column(name = "start_date", columnDefinition = "datetime")
//    @NotNull
//    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
//    private Date startDate;
//
//    @Column(name = "end_date", columnDefinition = "datetime")
//    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
//    private Date endDate;
//
//    @Column(name = "cover_image")
//    private String coverImage;
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

//    @ManyToOne
//    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "post_ibfk_1"))

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "post_place", joinColumns = @JoinColumn(name = "post_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "place_id", referencedColumnName = "id"))
    private Set<Place> places;

    @ManyToMany(mappedBy = "posts")
    private Set<User> users;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Place> getPlaces() {
        return places;
    }

    public void setPlaces(Set<Place> places) {
        this.places = places;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
