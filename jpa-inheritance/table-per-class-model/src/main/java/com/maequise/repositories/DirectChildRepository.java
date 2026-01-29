package com.maequise.repositories;

import com.maequise.entities.DirectChildOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectChildRepository extends JpaRepository<DirectChildOne, Long> {
}
