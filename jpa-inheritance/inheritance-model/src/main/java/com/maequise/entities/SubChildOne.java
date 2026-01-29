package com.maequise.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("SUB_CHILD_ONE")
@Setter
@Getter
public class SubChildOne extends SubParent{
    @Column(name = "sub_child_one_name")
    private String subChildOneName;

    @Column(name = "sub_price")
    private Double subPrice;
}
