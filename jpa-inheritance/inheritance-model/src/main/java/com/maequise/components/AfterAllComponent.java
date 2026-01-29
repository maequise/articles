package com.maequise.components;

import com.maequise.repositories.RelationRepository;
import com.maequise.repositories.SubChildOneRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@DependsOn("relationComponent")
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class AfterAllComponent {
    private final SubChildOneRepository subChildOneRepository;
    private final RelationRepository relationRepository;

    @PostConstruct
    @Transactional(readOnly = true)
    public void init() {
        var all = subChildOneRepository.fetchAll();

        var relations = relationRepository.findAll();

        System.out.println("test");
    }
}
