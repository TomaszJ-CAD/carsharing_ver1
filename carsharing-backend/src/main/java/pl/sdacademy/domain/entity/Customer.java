package pl.sdacademy.domain.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embedded;

@Getter
@Setter
public class Customer {

    private Integer id;
    private String name;
    private String surname;

    private String phoneNum;
    private String email;

    private Address address;
}
