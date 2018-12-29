/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msumedical;
import java.util.Scanner;

/**
 *
 * @author anaxc
 */
public class medicine {
    
    int medicineID;
    String medicineName;
    int medicineQuantity;
    
    public void GetMedicine()
    {
        Scanner md = new Scanner(System.in);
        System.out.print("Enter medicine id number : ");
        medicineID = Integer.parseInt(md.nextLine());
        
        System.out.print("Enter medicine name : ");
        medicineName = md.nextLine();
        
        System.out.print("Enter medicine Quantity : ");
        medicineQuantity = Integer.parseInt(md.nextLine());
    }
    
    public void saveMedicine()
    {
         System.out.print("\n\t" + medicineID + "\t" + medicineName + "\t   " + medicineQuantity + "\n");
    }
    
    public void listMedicine()
    {
            medicine[] listMedicine = new medicine[2];
            int m;
        
            for(m = 0;m < 2;m++)
            listMedicine[m] = new medicine();
        
            for(m = 0;m < 2;m++)
            {
                System.out.print("Enter medicine details : " + (m+1) + "\n" + " Medicine : ");
                listMedicine[m].GetMedicine();
            }

                System.out.print("\nMedicine details");
                System.out.print("\n  Medicine ID " + "\tMedicine Name " + "\tMedicine quantity");

                for(m = 0; m<2; m++)
                    listMedicine[m].saveMedicine();
    }
    
}
