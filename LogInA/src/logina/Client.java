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
@Table(name="Client")
public class Client implements Serializable{
     @Id
     @Column(name="ClientyID ");
    private int ClientyID;
    
    @Column(name=" FullName");
   private String FullName;
   
   @Column(name=" Email");
   private String Email;
 
   @Column(name=" PhoneNo");
   private String PhoneNo;
   
   @Column(name=" UserName");
   private String UserName;
   
   @Column(name=" Pasaword");
   private String Pasaword;

    public Client( ) {
        
    }

    public Client( int ClientyID, String FullName, String Email, String PhoneNo , String UserNam, String Pasaword) {
       
        this.ClientyID = ClientyID;
       
        this.FullName = FullName;
      
        this.Email = Email;
   
        this.PhoneNo = PhoneNo;
    
        this.UserName = UserName;
  
        this.Pasaword = Pasaword;
    }

    public int getClientyID() {
        return ClientyID;
    }

    public void setClientyID(int ClientyID) {
        this.ClientyID = ClientyID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPasaword() {
        return Pasaword;
    }

    public void setPasaword(String Pasaword) {
        this.Pasaword = Pasaword;
    }
    
    
   
   
}
