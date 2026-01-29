package com.maequise.repositories;

import com.maequise.entities.RelationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelationRepository extends JpaRepository<RelationEntity, Long> {
}
