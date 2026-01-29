package com.maequise.repositories;

import com.maequise.entities.SubParent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubParentRepository extends JpaRepository<SubParent, Long> {
    @Query("select e from SubParent e left join fetch e.subChildOnes")
    List<SubParent> fetchAll();

   /* @Query("select e from SubParent e left join fetch e.subChildTwos ee where (e.subChildTwos in :subChildOnes or e" +
            ".subChildOnes in :subChildTwos)")
    List<SubParent> fetchWithAllAssocations(@Param("subChildOnes") List<SubChildOne> subChildOnes, @Param("subChildTwos") List<SubChildTwo> subChildTwos);*/
}
