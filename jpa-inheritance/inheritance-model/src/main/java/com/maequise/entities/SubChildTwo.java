package com.maequise.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
/*@DiscriminatorValue("SUB_CHILD_two")*/
@Setter
@Getter
public class SubChildTwo extends SubParent{
    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;*/

    @Column(name = "sub_child_two_name")
    private String subChildOneName;

    @Column(name = "sub_price")
    private Double subPrice;
}
