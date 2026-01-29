package com.maequise.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "direct_child_one")
@DiscriminatorValue("CHILD_ONE")
@Setter
@Getter
public class DirectChildOne extends ParentEntity{
    @Column(name = "child_one_name")
    private String childOneName;

    @Column(name = "property_one")
    private String propertyOne;
}
