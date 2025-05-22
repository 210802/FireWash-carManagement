package carmanagementservice.entity;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("userId")
    private Long userId;

    @JsonProperty("carModel")
    private String carModel;

    @JsonProperty("licensePlate")
    private String licensePlate;

    // ✅ Constructors
    public Car() {
    }

    public Car(Long userId, String carModel, String licensePlate) {
        this.userId = userId;
        this.carModel = carModel;
        this.licensePlate = licensePlate;
    }

    // ✅ Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
