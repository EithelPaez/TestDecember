package com.example.test1demoproyect1;

public class Store {
    private final String storeId;
    private Integer availability;

    private Integer capacity;

    public Store(String storeId, Integer availability) {
        this.storeId = storeId;
        this.availability = availability;
    }

    public Store(String storeId) {
        this.storeId = storeId;
    }

    public String getStoreId() {
        return storeId;
    }

    public Integer getAvailability() {
        return availability;
    }

    public void setAvailability(Integer availability) {
        this.availability = availability;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
