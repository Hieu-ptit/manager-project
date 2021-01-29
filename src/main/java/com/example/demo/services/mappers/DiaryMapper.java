package com.example.demo.services.mappers;

import com.example.demo.models.entities.DiaryEntity;
import com.example.demo.models.ins.DiaryIn;
import com.example.demo.models.ins.DiaryRequest;
import com.example.demo.models.outs.DiaryDto;
import com.example.demo.repositories.DiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DiaryMapper {

    @Autowired
    private DiaryRepository diaryRepository;

    public List<DiaryDto> mapToListDiaryDto(List<DiaryEntity> diaryEntity){
        return  diaryEntity.stream().map(this::mapToDiaryDto).collect(Collectors.toList());
    }

    public  DiaryDto mapToDiaryDto(DiaryEntity diaryEntity){
        DiaryDto diaryDto = new DiaryDto();
        diaryDto.setId(diaryEntity.getId());
        diaryDto.setTitle(diaryEntity.getTitle());
        diaryDto.setContent(diaryEntity.getContent());
        diaryDto.setStatus(diaryEntity.isStatus());
        diaryDto.setStatusFavorite(diaryEntity.isStatusFavorite());
        diaryDto.setModifiedAt(diaryEntity.getModifiedAt());
        diaryDto.setCreateAt(diaryEntity.getCreateAt());
        diaryDto.setIdUser(diaryEntity.getIdUser());
        return diaryDto;
    }

    public DiaryEntity mapToDiaryEntity(DiaryRequest diaryRequest){
        DiaryEntity diaryEntity = new DiaryEntity();
        diaryEntity.setTitle(diaryRequest.getTitle());
        diaryEntity.setContent(diaryRequest.getContent());
        diaryEntity.setCreateAt(diaryRequest.getCreateAt());
        diaryEntity.setIdUser(diaryRequest.getIdUser());
        diaryEntity.setStatus(diaryRequest.isStatus());
        diaryEntity.setStatusFavorite(diaryRequest.isStatusFavorite());
        diaryEntity.setModifiedAt(diaryRequest.getModifiedAt());
        return diaryEntity;
    }

    public DiaryEntity mapToDiaryEntity(DiaryRequest diaryRequest,int id){
        DiaryEntity diaryEntity = mapToDiaryEntity(diaryRequest);
        diaryEntity.setId(id);
        return diaryEntity;
    }

    public DiaryEntity mapToDiaryEntity(DiaryIn diaryIn){
        DiaryEntity diaryEntity = new DiaryEntity();
        diaryEntity.setTitle(diaryIn.getTitle());
        diaryEntity.setContent(diaryIn.getContent());
        LocalDateTime localDateTime = LocalDateTime.now();
        diaryEntity.setCreateAt(localDateTime);
        diaryEntity.setModifiedAt(localDateTime);
        diaryEntity.setStatus(true);
        return diaryEntity;
    }

    public DiaryEntity mapDiaryEntity(int id, DiaryIn diaryIn){
        DiaryEntity diaryEntity = diaryRepository.findById(id);
        LocalDateTime localDateTime = LocalDateTime.now();
        diaryEntity.setTitle(diaryIn.getTitle());
        diaryEntity.setContent(diaryIn.getContent());
        diaryEntity.setModifiedAt(localDateTime);
        return diaryEntity;
    }
}
