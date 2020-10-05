package pl.sdacademy.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;


@Getter
@Setter
public class Address {

    private Integer id;
    private String city;
    private String postCode;
    private String street;

}
