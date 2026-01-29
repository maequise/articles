package com.maequise.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
public abstract class SubParent extends ParentEntity {
    @OneToMany(mappedBy = "subParent", fetch = FetchType.EAGER)
    private List<RelationEntity> relations = new ArrayList<>();
}
