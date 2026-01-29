package com.maequise.components;

import com.maequise.repositories.SubChildOneRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SubChildOneComponent {
    private final SubChildOneRepository subChildOneRepository;

    @PostConstruct
    public void init(){
        var subChildOne = new com.maequise.entities.SubChildOne();
        subChildOne.setName("subChildOne");
        subChildOne.setSubPrice(100.0);
        subChildOneRepository.save(subChildOne);
    }
}
