package com.example.rkinabhi.merchack;


import com.firebase.geofire.GeoFire;
import com.firebase.geofire.GeoLocation;

public class Car {

    GeoFire geoFire;
    GeoLocation curLocation;
    GeoLocation originLocation;
    GeoLocation destLocation;
    double curBattery;
    double maxBattery;
    double mileage;
    Role role;

    Car(){}

}
