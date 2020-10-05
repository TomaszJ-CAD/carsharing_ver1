package pl.sdacademy.domain.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embedded;

@Getter
@Setter
public class Department {

    private String departmentName;
    private Address address;

}
