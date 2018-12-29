/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msumedical;
import java.util.*;

/**
 *
 * @author anaxc
 */
public class MsuMedical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("------------------");
       // System.out.println("MSU MEDICAL CENTRE");
        //System.out.println("------------------");
       // System.out.println("Options:");
        
        Scanner ReadConsole = new Scanner(System.in);
        
        int menu = 0;
        
        do
        
        {
        System.out.println("------------------");
        System.out.println("MSU MEDICAL CENTRE");
        System.out.println("------------------");
        System.out.println("Options:");
        System.out.println("1. Staff menu");
        System.out.println("2. Medicine menu");
        System.out.println("3. Patient menu");
        System.out.println("4. Exit");
        
        System.out.print("Select option : ");
        menu = ReadConsole.nextInt();
        
        switch(menu)
        {
            case 1:
                staff listStaff = new staff();
                listStaff.listStaff();
            break;
            case 2:
                medicine listMedicine = new medicine();
                listMedicine.listMedicine();
            break;
            case 3:
                patient listPatient = new patient();
                listPatient.listPatient();
            break;
            default:
                System.out.print("The selection is invalid");
        }
    }
        while(menu != 4);
    }
}
                
        
        

    



        
            
            
            

