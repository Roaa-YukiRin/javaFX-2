/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package address;

import java.util.Scanner;

/**
 *
 * @author sara
 */
public class Address {
    
private String City;
private String Country;
private String  Street;
private int Zip;
private int BuildingNO;

 public Address(String City, String Country, String Street, int Zip, int BuildingNO) {
        this.City = City;
        this.Country = City;
        this.Street = Street;
        this.Zip = Zip;
        this.BuildingNO = BuildingNO;
    }
 public Address(){}
    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public int getZip() {
        return Zip;
    }

    public void setZip(int Zip) {
        this.Zip = Zip;
    }

    public int getBuildingNO() {
        return BuildingNO;
    }

    public void setBuildingNO(int BuildingNO) {
        this.BuildingNO = BuildingNO;
    }






    
}
