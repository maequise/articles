package com.maequise.components;

import com.maequise.entities.RelationEntity;
import com.maequise.repositories.RelationRepository;
import com.maequise.repositories.SubChildOneRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn({"directChildComponent", "subChildOneComponent"})
@RequiredArgsConstructor
public class RelationComponent {
    private final RelationRepository relationRepository;
    private final SubChildOneRepository subChildOneRepository;

    @PostConstruct
    public void init() {
        var childEntity = subChildOneRepository.findById(2L).orElseThrow();
        var relationEntity = new RelationEntity();

        relationEntity.setName("relation");
        relationEntity.setPrice(100.0);
        relationEntity.setType("type");
        relationEntity.setSubParent(childEntity);
        relationRepository.save(relationEntity);
    }
}
