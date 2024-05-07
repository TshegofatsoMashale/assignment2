/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehicles;

/**
 *
 * @author Tshegofatso Mashale
 */
public class Vehicles {

    public static void main(String[] args) {
        class Vehicle {
private String myBrand, myModel;
public Vehicle() {
myBrand = "unknown";
myModel = "unknown";
}
public Vehicle(String brand, String model) {
setBrand(brand);
setModel(model);
}
public String getBrand() {
return myBrand;
}
public String getModel() {
return myModel;
}
public void setBrand(String brand) {
myBrand = brand;
}
public void setModel(String model) {
myModel = model;
}
public String toString() {
return getBrand() + " " + getModel();
}
}

    }
}
