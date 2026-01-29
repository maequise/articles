package com.maequise.services;

import com.maequise.entities.SubParent;
import com.maequise.repositories.SubParentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SurParentService {
    private final SubParentRepository subParentRepository;

    //@Transactional(propagation = Propagation.REQUIRES_NEW)
    public List<SubParent> fetchAll(){
        var t = subParentRepository.fetchAll();

        var tt = t.get(0).getSubChildTwos();


        return t;
    }
}
