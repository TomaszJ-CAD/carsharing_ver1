package pl.sdacademy.domain.entity;

public class Car {

    private Integer id;
    private String color;
    private String productionYear;
    private String mileage;
    private String rentPriceByDay;

    private CarStatus carStatus;

    private CarType carType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getRentPriceByDay() {
        return rentPriceByDay;
    }

    public void setRentPriceByDay(String rentPriceByDay) {
        this.rentPriceByDay = rentPriceByDay;
    }

    public CarStatus getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(CarStatus carStatus) {
        this.carStatus = carStatus;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }
}
