package com.maequise.repositories;

import com.maequise.entities.ParentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentRepository extends JpaRepository<ParentEntity, Long> {
}
