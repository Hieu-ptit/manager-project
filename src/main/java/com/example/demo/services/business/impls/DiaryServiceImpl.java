package com.example.demo.services.business.impls;

import com.example.demo.exceptions.Response;
import com.example.demo.exceptions.ResponseDetail;
import com.example.demo.models.entities.DiaryEntity;
import com.example.demo.models.entities.UserEntity;
import com.example.demo.models.outs.DiaryDto;
import com.example.demo.repositories.DiaryRepository;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.business.DiaryService;
import com.example.demo.services.mappers.DiaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DiaryServiceImpl implements DiaryService {

    @Autowired
    private DiaryMapper diaryMapper;

    @Autowired
    private DiaryRepository diaryRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public ResponseEntity<ResponseDetail<List<DiaryDto>>> read() {
        List<DiaryEntity> diaryEntityList = diaryRepository.getDiaryEntity();
        List<UserEntity> userEntityList = userRepository.getUserEntity();
        List<DiaryEntity> list = diaryEntityList.stream().filter(d -> userEntityList
                .stream().map(UserEntity::getId).anyMatch(u -> u.equals(d.getIdUser()))).collect(Collectors.toList());
        return Response.ok(diaryMapper.mapToListDiaryDto(list));
    }
}
