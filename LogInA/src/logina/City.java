/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logina;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
/**
 *
 * @author HP
 */
@Entity
@Table(name="City")
public class City implements Serializable {
    
    
    //PK
  @Id
     @Column(name="CityID ");
    private int CityID;
  
    @Column(name=" CityName");
     private String CityName;
     
     @Column(name=" PlacesNO");
      private int PlacesNO;
      
    public City() {
    }

    public City(int ClientID,  int CityID,  String CityName, int PlacesNO) {
       
        
      
        this.CityID = CityID;
       
        this.CityName = CityName;
      
        this.PlacesNO = PlacesNO;
    }


    public int getCityID() {
        return CityID;
    }

    public void setCityID(int CityID) {
        this.CityID = CityID;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public int getPlacesNO() {
        return PlacesNO;
    }

    public void setPlacesNO(int PlacesNO) {
        this.PlacesNO = PlacesNO;
    }
    
}
