/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address;

import java.util.Scanner;

public class ADDRESSMain {
    static Address[] adddata = new Address[3];

 //adddata[1]= {"makkah ","sudi","iskan",  32 ,16 };

   public static void AddAddress() {

        Scanner user2 = new Scanner(System.in);
        System.out.println(" ##########################\n");
        
        for (int i = 0; i < adddata.length; i++) {//loop to make user wrie the data of array
            System.out.println(" do you want add Address? (y/n)");
            char choice = user2.next().charAt(0);// y/n
//start of array
System.out.println(" ##########################\n");
            if (choice == 'y') {
                System.out.println(" enter the data of: City & Country & Street &  Zip & BuildingNO \n"
                        + "example: \n"
                        + "makah sudi iskan 12  948 \n =====================");
                adddata[i] = new Address(user2.next(), user2.next(), user2.next(), user2.nextInt(), user2.nextInt());
            } else {
                adddata[i] = new Address();
            }
        }
        
System.out.println(" ##########################\n");
//display the data in array
        System.out.println(" Addres data:\n"
                + "(0) City = Country = Street = Zip = BuildingNO ");
        for (int k = 0; k < adddata.length; k++) {
            System.out.println(" (" + (k + 1) + ") " + adddata[k].getCity() + " = " + adddata[k].getCountry() + " = " + adddata[k].getStreet()
                    + " = " + adddata[k].getZip() + " = " + adddata[k].getBuildingNO());
        }
        System.out.println(" ##########################\n");
    
    }
///////////////////////////////////////////////
   public  static void EditAddress() {
        Scanner user4 = new Scanner(System.in);
        System.out.println(" ##########################\n");
        // print the array after method add adress
  System.out.println(" Addres data:\n"
                + "(0) City = Country = Street = Zip = BuildingNO ");
        for (int k = 0; k < adddata.length; k++) {
            System.out.println(" (" + (k + 1) + ") " + adddata[k].getCity() + " = " + adddata[k].getCountry() + " = " + adddata[k].getStreet()
                    + " = " + adddata[k].getZip() + " = " + adddata[k].getBuildingNO());
        }
        System.out.println(" ##########################\n");
        //start the ubdite data in array
        // user enter the index
         System.out.println(" Enter the index number");
         int i=user4.nextInt();
         
         //??????????????
         //shange the array  <<error>> 
           System.out.println(" enter the data of: City & Country & Street &  Zip & BuildingNO \n"
                        + "example: \n"
                        + "makah sudi iskan 12  948 \n =====================");
                adddata[i] = new Address(user4.next(), user4.next(), user4.next(), user4.nextInt(), user4.nextInt());
                
                 System.out.println(" \n ##########################\n");
                 System.out.println(" Addres data:\n"
                + "(0) City = Country = Street = Zip = BuildingNO ");
        for (int k = 0; k < adddata.length; k++) {
            System.out.println(" (" + (k + 1) + ") " + adddata[k].getCity() + " = " + adddata[k].getCountry() + " = " + adddata[k].getStreet()
                    + " = " + adddata[k].getZip() + " = " + adddata[k].getBuildingNO());
        } 
   }
   
   //////////////////////////////////////////////////
   //parition testin 
   public  static void PrintTeast() {
    Scanner user3 = new Scanner(System.in);
    System.out.println(" ##########################\n");
    
    System.out.println(" Enter a number ");
   int M=user3.nextInt();
   System.out.println(" ##########################\n");
    if(0>M){
       System.out.println("error ");
   }else if(0<M){
        System.out.println(" Addres data:\n"
                + "(0) City = Country = Street = Zip = BuildingNO ");
        for (int k = 0; k < adddata.length; k++) {
            System.out.println(" (" + (k + 1) + ") " + adddata[k].getCity() + " = " + adddata[k].getCountry() + " = " + adddata[k].getStreet()
                    + " = " + adddata[k].getZip() + " = " + adddata[k].getBuildingNO());
        }
   }else{
   System.out.println("error");
   }
   
   
   }
   
   /////////////////////////////////////////////////
   // Guid line based testing
   public  static void SearchRouting() {
   Scanner user5 = new Scanner(System.in);
   System.out.println(" ##########################\n");
   System.out.println(" chose :\n 1) first number \n 2) midel number \n 3)final numer \n 4)any number");
   int i=user5.nextInt();
   
  switch (i) {
      // print the data in the endex 
            case 1://print first index
                System.out.println(" ##########################\n");
                System.out.println(" 1) first index");
                System.out.println(" (" + (1) + ") " + adddata[1].getCity() + " = " + adddata[1].getCountry() + " = " + adddata[1].getStreet()
                    + " = " + adddata[1].getZip() + " = " + adddata[1].getBuildingNO());
                break;
            case 2://prin the midele index<<error>>
                System.out.println(" ##########################\n");
                System.out.println(" 2) midel index");
                 System.out.println(adddata[ adddata.length/2]);
                break;
                case 3://print the final index data <<error>
                    System.out.println(" ##########################\n");
                System.out.println(" 3)final index");
               System.out.println(" (" + (adddata.length) + ") " 
                       + adddata[adddata.length].getCity() + " = " 
                       + adddata[adddata.length].getCountry() + " = " 
                       + adddata[adddata.length].getStreet()
                    + " = " + adddata[adddata.length].getZip() + " = " 
                       + adddata[adddata.length].getBuildingNO());
                break;
                case 4://print any data of index user put <<error>
                    System.out.println(" ##########################\n");
                System.out.println(" 4)any number\n ");
               System.out.println(" Enter the number of index ");
                int s=user5.nextInt();
                for(int b=0;b<adddata.length;b++){
                if(b==s){
                System.out.println(adddata[ b]);
                }
                else{
                System.out.println(" not found");
                }
                }
                break;
            default:
                System.out.println(" ##########################\n");
                System.out.println(" error");
                
        }
   
   }
   
   //////////////////////////////////////////////////
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
       System.out.println(" ##########################");
        System.out.println(" chose What you want by enter the number\n:0)close \n 1)  AddAddress  \n 2)EditAddress\n 3)print test \n4)search  ");
        int chose = user.nextInt();
         while(chose!=0){
        switch (chose) {
            case 1:
                System.out.println(" ##########################");
                System.out.println(" 1)  AddAddress ");
                AddAddress();
                break;
            case 2:
                System.out.println(" ##########################");
                System.out.println(" 2)EditAddress ");
                EditAddress();
                break;
                case 3:
                    System.out.println(" ##########################");
                System.out.println(" 3)print test ");
                PrintTeast();
                break;
                case 4:
                    System.out.println(" ##########################");
                System.out.println(" 4)search ");
                SearchRouting();
                break;
            default:
                System.out.println(" ##########################");
                System.out.println(" error");
                
        }
        System.out.println(" chose What you want by enter the number:\n 0)close \n 1)  AddAddress  \n 2)EditAddress \n 3)print test \n4)search");
         chose = user.nextInt();
        }
         System.out.println(" ##########################\n");
         System.out.println(" thenk you for use this system\n ");
         System.out.println(" ##########################\n");
    }
    //////////////////////////////////
  
    }

