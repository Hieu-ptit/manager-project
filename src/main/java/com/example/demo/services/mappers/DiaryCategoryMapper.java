package com.example.demo.services.mappers;

import com.example.demo.models.entities.DiaryCategoryEntity;
import com.example.demo.models.ins.DiaryCategoryRequest;
import com.example.demo.models.outs.DiaryCategoryDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class DiaryCategoryMapper {

    public List<DiaryCategoryDto> mapToListDiaryCategoryDto(List<DiaryCategoryEntity> diaryCategoryEntity){
        return  diaryCategoryEntity.stream().map(this::mapToDiaryCategoryDto).collect(Collectors.toList());
    }

    public DiaryCategoryDto mapToDiaryCategoryDto(DiaryCategoryEntity diaryCategoryEntity){
        DiaryCategoryDto diaryCategoryDto = new DiaryCategoryDto();
        diaryCategoryDto.setId(diaryCategoryEntity.getId());
        diaryCategoryDto.setIdCategory(diaryCategoryEntity.getIdCategory());
        diaryCategoryDto.setIdDiary(diaryCategoryEntity.getIdDiary());
        return diaryCategoryDto;
    }

    public void mapToDiaryCategoryEntity(DiaryCategoryEntity diaryCategoryEntity,DiaryCategoryRequest diaryCategoryRequest){
        diaryCategoryEntity.setIdDiary(diaryCategoryRequest.getIdDiary());
        diaryCategoryEntity.setIdCategory(diaryCategoryRequest.getIdCategory());
    }

    public DiaryCategoryEntity mapToDiaryCategoryEntity(DiaryCategoryRequest diaryCategoryRequest){
        DiaryCategoryEntity diaryCategoryEntity = new DiaryCategoryEntity();
        mapToDiaryCategoryEntity(diaryCategoryEntity,diaryCategoryRequest);
        return diaryCategoryEntity;
    }
    public DiaryCategoryEntity mapToCategoryEntityById(DiaryCategoryRequest diaryCategoryRequest,int id){
        DiaryCategoryEntity diaryCategoryEntity = new DiaryCategoryEntity();
        diaryCategoryEntity.setId(id);
        mapToDiaryCategoryEntity(diaryCategoryEntity,diaryCategoryRequest);
        return diaryCategoryEntity;
    }
}
