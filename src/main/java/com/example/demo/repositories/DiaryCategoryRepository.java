package com.example.demo.repositories;

import com.example.demo.models.entities.DiaryCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiaryCategoryRepository extends JpaRepository<DiaryCategoryEntity,Integer> {
}
