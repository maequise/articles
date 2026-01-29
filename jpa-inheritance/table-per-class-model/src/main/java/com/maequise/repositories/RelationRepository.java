package com.maequise.repositories;

import com.maequise.entities.RelationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RelationRepository extends JpaRepository<com.maequise.entities.RelationEntity, Long> {
    @Query("select e from com.maequise.entities.RelationEntity e left join fetch e.subChildOne" +
            " left join e.subChildTwo")
    List<RelationEntity> fetchAll();
}
