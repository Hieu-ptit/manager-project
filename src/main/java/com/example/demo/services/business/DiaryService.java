package com.example.demo.services.business;

import com.example.demo.exceptions.ResponseDetail;
import com.example.demo.models.outs.DiaryDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DiaryService {
    ResponseEntity<ResponseDetail<List<DiaryDto>>> read();
}
