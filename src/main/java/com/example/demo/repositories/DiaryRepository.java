package com.example.demo.repositories;

import com.example.demo.models.entities.DiaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DiaryRepository extends JpaRepository<DiaryEntity, Integer> {

}
