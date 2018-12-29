package msumedical; 
import java.util.Scanner;

class patient
    {
        int patientId, patientIC, patientWard, patientBed;
        String patientName,patientBlood;
      
       
        void GetPatientData()           // Defining Patient GetData()
        {

            Scanner pt = new Scanner(System.in);

            System.out.print("\n\t Enter Patient Id : ");
            patientId = Integer.parseInt(pt.nextLine());

            System.out.print("\n\t Enter Patient Name : ");
            patientName = pt.nextLine();

            System.out.print("\n\t Enter Identification Card Number : ");
            patientIC = Integer.parseInt(pt.nextLine());
            
            System.out.print("\n\t Enter Ward Number : ");
            patientWard = Integer.parseInt(pt.nextLine());
            
            System.out.print("\n\t Enter Bed Number : ");
            patientBed = Integer.parseInt(pt.nextLine());
            
            System.out.print("\n\t Enter Blood Type : ");
            patientBlood = pt.nextLine();
            
       
        }

        void savePatientData()           // Defining patient PutData()
        {
            System.out.print("\n\t" + patientId + "\t" + patientName + "\t\t" + patientIC + "\t\t" + patientWard + "\t\t" + patientBed + "\t\t" + patientBlood + "\n");
        }

        public void listPatient()
        {

            patient[] Emp = new patient[2];
            int i;

            for(i=0;i<2;i++)
                Emp[i] =  new patient();   // Allocating memory to each object

            for(i=0;i<2;i++)
            {
                System.out.print("\nEnter details of "+ (i+1) +" Patient\n");
                Emp[i].GetPatientData();
            }

            System.out.print("\nDetails of Patient\n");
            System.out.print("\nPatient id" + "\tPatient name" + "\tIC" + "\tWard number" + "\tBed number" + "\tBlood type");
            for(i=0;i<2;i++)
                Emp[i].savePatientData();

        }
    }
