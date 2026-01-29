package com.maequise.components;

import com.maequise.entities.DirectChildOne;
import com.maequise.repositories.DirectChildRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DirectChildComponent {
    private final DirectChildRepository directChildRepository;

    @PostConstruct
    public void init(){
        var child = new DirectChildOne();
        child.setName("child");
        child.setPropertyOne("property");
        child.setChildOneName("child name");

        directChildRepository.save(child);
    }
}
