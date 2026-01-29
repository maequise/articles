package com.maequise.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "relation")
@Getter
@Setter
public class RelationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @Column(name = "type")
    private String type;

    @ManyToOne(targetEntity = SubChildOne.class)
    @JoinColumn(name = "sub_child_one_id")
    private SubChildOne subChildOne;

    @ManyToOne(targetEntity = SubChildTwo.class)
    @JoinColumn(name = "sub_child_two_id")
    private SubChildTwo subChildTwo;
}
