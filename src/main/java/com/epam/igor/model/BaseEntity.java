package com.epam.igor.model;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @SequenceGenerator(name = "SEQ", sequenceName = "STRUTS_SEQ", allocationSize = 1)
    @GeneratedValue(generator = "SEQ", strategy = GenerationType.SEQUENCE)
    private int id;

    public BaseEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
