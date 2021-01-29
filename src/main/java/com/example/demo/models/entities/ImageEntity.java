package com.example.demo.models.entities;

import javax.persistence.*;

@Entity
@Table(name = "images")
public class ImageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String link;

    @Column
    private int idDiary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getIdDiary() {
        return idDiary;
    }

    public void setIdDiary(int idDiary) {
        this.idDiary = idDiary;
    }
}
