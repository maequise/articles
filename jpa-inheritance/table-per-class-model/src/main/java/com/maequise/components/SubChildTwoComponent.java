package com.maequise.components;

import com.maequise.repositories.SubChildTwoRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SubChildTwoComponent {
    private final SubChildTwoRepository subChildOneRepository;

    @PostConstruct
    public void init(){
        var subChildOne = new com.maequise.entities.SubChildTwo();
        //subChildOne.setName("subChildTwo");
        subChildOne.setSubPrice(100.0);
        subChildOneRepository.save(subChildOne);
    }
}
