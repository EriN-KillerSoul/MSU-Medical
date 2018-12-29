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
public class staff {
    int staffID;
    String staffName;
    String staffDepartment;
    
    public void GetStaffData()
    {
        Scanner staffDetails = new Scanner(System.in);
        
        System.out.print("Enter staff id number : ");
        staffID = Integer.parseInt(staffDetails.nextLine());
        
        System.out.print("Enter staff name : ");
        staffName = staffDetails.nextLine();
        
        System.out.print("Enter staff department : ");
        staffDepartment = staffDetails.nextLine();
        
    }
    
    public void saveStaffData()
    {
        System.out.print("\n\t" + staffID + "\t" + staffName + "\t" + staffDepartment + "\n");
    }
    
    public void listStaff()
    {
        staff[] listStaff = new staff[2];
        int s;
        
        for(s= 0;s<2;s++)
            listStaff[s] = new staff();
        
        for(s = 0;s<2;s++)
        {
            System.out.print("Enter staff details : " + (s+1) + "\n" + " Staff : ");
            listStaff[s].GetStaffData();
        }
        
            System.out.print("\nStaff details");
            System.out.print("\n  Staff ID" + "\tStaff Name " + "\tStaff Department");

            for(s = 0; s<2; s++)
                listStaff[s].saveStaffData();
    }
    
}
