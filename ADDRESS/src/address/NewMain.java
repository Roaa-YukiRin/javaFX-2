/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address;

import static address.ADDRESS.AddAddress;
import static address.ADDRESS.EditAddress;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println(" chose What you want by enter the number: \n 1)  AddAddress  \n 2)EditAddress ");
        int chose=user.nextInt();
        switch(chose){
            case 1:
          System.out.println(" 1)  AddAddress ");
        AddAddress();
        break;
        case 2:
            System.out.println(" 2)EditAddress ");
       EditAddress();
       break;
        default:
            System.out.println(" error");
        }
     }
}
