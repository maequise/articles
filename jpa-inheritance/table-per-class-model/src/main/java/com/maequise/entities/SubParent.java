package com.maequise.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
public abstract class SubParent extends ParentEntity {
    // @OneToMany(mappedBy = "subParent", fetch = FetchType.EAGER)
    @OneToMany(fetch = FetchType.LAZY)
    //@OneToMany
    @JoinTable(name = "relation",
            joinColumns = @JoinColumn(name = "sub_child_one_id"),
            inverseJoinColumns = @JoinColumn(name = "id"))
    private List<RelationEntity> subChildOnes = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY)
    //@OneToMany
    @JoinTable(name = "relation",
            joinColumns = @JoinColumn(name = "sub_child_two_id"),
            inverseJoinColumns = @JoinColumn(name = "id"))
    private List<RelationEntity> subChildTwos = new ArrayList<>();
}
