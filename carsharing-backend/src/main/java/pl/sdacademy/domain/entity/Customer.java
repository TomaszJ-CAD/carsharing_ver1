package pl.sdacademy.domain.entity;


import javax.persistence.Embedded;


public class Customer {

    private Integer id;
    private String name;
    private String surname;

    private String phoneNum;
    private String email;

    private Address address;
}
