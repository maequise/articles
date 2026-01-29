package com.maequise.services;

import com.maequise.entities.RelationEntity;
import com.maequise.repositories.RelationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RelationService {
    private final RelationRepository repository;

    @Transactional
    public List<RelationEntity> fetchAll(){
        var t = repository.fetchAll();

        return t;
    }
}
