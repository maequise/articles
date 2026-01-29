package com.maequise.repositories;

import com.maequise.entities.SubChildOne;
import com.maequise.entities.SubChildTwo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubChildTwoRepository extends JpaRepository<SubChildTwo, Long> {
    @Query("select e from SubChildTwo e join fetch e.subChildTwos")
    List<SubChildOne> fetchAll();
}
