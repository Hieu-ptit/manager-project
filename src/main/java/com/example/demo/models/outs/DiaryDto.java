package com.example.demo.models.outs;

import java.time.LocalDateTime;

public class DiaryDto {

    private int id;

    private String title;

    private String content;

    private LocalDateTime createAt;

    private boolean statusFavorite;

    private boolean status;

    private LocalDateTime modifiedAt;

    private int idUser;

    public DiaryDto(){

    }

    public DiaryDto(int id, String title, String content, LocalDateTime createAt, LocalDateTime modifiedAt, int idUser) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createAt = createAt;
        this.modifiedAt = modifiedAt;
        this.idUser = idUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isStatusFavorite() {
        return statusFavorite;
    }

    public void setStatusFavorite(boolean statusFavorite) {
        this.statusFavorite = statusFavorite;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
