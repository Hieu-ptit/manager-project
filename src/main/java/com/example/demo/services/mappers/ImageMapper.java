package com.example.demo.services.mappers;

import com.example.demo.models.entities.ImageEntity;
import com.example.demo.models.ins.ImageRequest;
import com.example.demo.models.outs.ImageDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class ImageMapper {

    public List<ImageDto> mapToListImageDto(List<ImageEntity> imageEntity){
        return  imageEntity.stream().map(this::mapToImageDto).collect(Collectors.toList());
    }

    public ImageDto mapToImageDto(ImageEntity imageEntity){
        ImageDto imageDto = new ImageDto();
        imageDto.setId(imageEntity.getId());
        imageDto.setName(imageEntity.getName());
        imageDto.setDescription(imageEntity.getDescription());
        imageDto.setLink(imageEntity.getLink());
        imageDto.setIdDiary(imageEntity.getIdDiary());
        return imageDto;
    }

    public void mapToImageEntity(ImageEntity imageEntity, ImageRequest imageRequest){
        imageEntity.setName(imageRequest.getName());
        imageEntity.setDescription(imageRequest.getDescription());
        imageEntity.setLink(imageRequest.getLink());
        imageEntity.setIdDiary(imageRequest.getIdDiary());
    }

    public ImageEntity mapToImageEntity(ImageRequest imageRequest){
        ImageEntity imageEntity = new ImageEntity();
        mapToImageEntity(imageEntity,imageRequest);
        return imageEntity;
    }

    public ImageEntity mapImageEntityById(ImageRequest imageRequest,int id){
        ImageEntity imageEntity = new ImageEntity();
        imageEntity.setId(id);
        mapToImageEntity(imageEntity,imageRequest);
        return imageEntity;
    }
}
