package com.example.demo.services.validators;

import com.example.demo.exceptions.Response;
import com.example.demo.exceptions.ResponseDetail;
import com.example.demo.models.ins.DiaryIn;
import com.example.demo.utils.StringResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class DiaryValidator {

    public <T> ResponseEntity<ResponseDetail<T>> validateDiary(DiaryIn diaryIn) {

        if (diaryIn.getTitle() == null || diaryIn.getTitle().isEmpty())
            return Response.badRequest(StringResponses.TITLE_IS_NULL);

        if (diaryIn.getContent() == null || diaryIn.getContent().isEmpty())
            return Response.badRequest(StringResponses.CONTENT_IS_NULL);

        return Response.ok();
    }
}
