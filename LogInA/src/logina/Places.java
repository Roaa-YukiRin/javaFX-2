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
@Table(name="Places")
public class Places implements Serializable {
   
   //PK
   @Id
     @Column(name="PlaceID ");
  private  int PlaceID;
  
   //FK
    @Column(name="CityID ");
   private int CityID;
   
   @Column(name="PlaceType");
  private  String PlaceType;
  
  @Column(name="PlaceName");
 private   String PlaceName;

    public Places() {
    }

    public Places( int CityID,  int PlaceID,  String PlaceType,String PlaceName) {
        
        this.PlaceID = PlaceID;
        
         this.CityID = CityID;
     
        this.PlaceType = PlaceType;
     
        this.PlaceName = PlaceName;
    }

    

    public int getPlaceID() {
        return PlaceID;
    }

    public void setPlaceID(int PlaceID) {
        this.PlaceID = PlaceID;
    }
    public int getCityID() {
        return CityID;
    }

    public void setCityID(int CityID) {
        this.CityID = CityID;
    }

    public String getPlaceType() {
        return PlaceType;
    }

    public void setPlaceType(String PlaceType) {
        this.PlaceType = PlaceType;
    }

    public String getPlaceName() {
        return PlaceName;
    }

    public void setPlaceName(String PlaceName) {
        this.PlaceName = PlaceName;
    }
    
 
}
