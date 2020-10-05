package pl.sdacademy.domain.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
public class Car {

    private Integer id;
    private String color;
    private String productionYear;
    private String mileage;



    private BigDecimal rentPriceByDay;

    private CarStatus carStatus;

    private CarType carType;



}
