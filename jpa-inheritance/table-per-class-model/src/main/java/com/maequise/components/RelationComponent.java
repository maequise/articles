package com.maequise.components;

import com.maequise.repositories.RelationRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RelationComponent {
    private final RelationRepository relationRepository;

    @PostConstruct
    public void init(){
        var l = relationRepository.fetchAll();

        System.out.println("test");
    }
}
