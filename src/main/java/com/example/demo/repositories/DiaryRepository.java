package com.example.demo.repositories;

import com.example.demo.models.entities.DiaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

public interface DiaryRepository extends JpaRepository<DiaryEntity, Integer> {

    @Query("SELECT d FROM DiaryEntity d WHERE d.status = true")
    List<DiaryEntity> getDiaryEntity();

    @Query("SELECT c FROM DiaryEntity c WHERE c.id = ?1")
    DiaryEntity findById(int id);

    @Query("UPDATE DiaryEntity c SET c.title = ?1, c.content = ?2, c.modifiedAt = ?3 WHERE c.id = ?4")
    @Modifying
    @Transactional
    Integer updateById(String title, String content, LocalDateTime modifiedAt, int id);
}
