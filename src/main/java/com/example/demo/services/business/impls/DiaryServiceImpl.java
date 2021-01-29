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

}
