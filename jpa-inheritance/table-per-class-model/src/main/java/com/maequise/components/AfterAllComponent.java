package com.maequise.components;

import com.maequise.repositories.RelationRepository;
import com.maequise.repositories.SubChildOneRepository;
import com.maequise.services.RelationService;
import com.maequise.services.SurParentService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@DependsOn("relationComponent")
@RequiredArgsConstructor
public class AfterAllComponent {
    private final SubChildOneRepository subChildOneRepository;
    private final RelationRepository relationRepository;
    private final SurParentService service;
    private final RelationService relationService;

    @PostConstruct
    @Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = true)
    public void init() {
        var all = subChildOneRepository.fetchAll();

        var relations = relationRepository.findAll();

        service.fetchAll();
        relationService.fetchAll();

        System.out.println("test");
    }
}
