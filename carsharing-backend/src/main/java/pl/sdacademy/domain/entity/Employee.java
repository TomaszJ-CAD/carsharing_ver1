package pl.sdacademy.domain.entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {

    private Integer id;
    private String name;
    private String surname;

    private Department department;
}
