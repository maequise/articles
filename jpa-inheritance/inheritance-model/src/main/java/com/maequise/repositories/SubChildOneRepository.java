package com.maequise.repositories;

import com.maequise.entities.SubChildOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubChildOneRepository extends JpaRepository<SubChildOne, Long> {
    @Query("select e from SubChildOne e join fetch e.relations")
    List<SubChildOne> fetchAll();
}
