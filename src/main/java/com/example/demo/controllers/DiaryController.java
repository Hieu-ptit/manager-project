package com.example.demo.controllers;

import com.example.demo.exceptions.ResponseDetail;
import com.example.demo.models.ins.DiaryIn;
import com.example.demo.models.outs.DiaryDto;
import com.example.demo.services.business.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diaries")
public class DiaryController {

    @Autowired
    private DiaryService diaryService;

    @GetMapping
    public ResponseEntity<ResponseDetail<List<DiaryDto>>> read() {
        return diaryService.read();
    }

    @PostMapping
    public ResponseEntity<ResponseDetail<DiaryDto>> postClass(@RequestBody DiaryIn diaryIn) {
        return diaryService.createDiary(diaryIn);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ResponseDetail<DiaryDto>> updateClassById(@PathVariable("id") int id, @RequestBody DiaryIn diaryIn) {
        return diaryService.updateDiaryById(id, diaryIn);
    }
}
