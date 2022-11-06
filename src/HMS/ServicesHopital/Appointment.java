package HMS.ServicesHopital;

import java.util.Scanner;

import HMS.Interfaces.SerivceHopital;

public class Appointment implements SerivceHopital {
    private String ServiceName="APPOINTMENT";
    private  int Apid;
    private int pid;
    private String Problem;
    private int Doctor_id;
    private String Doctor_Name;
    private String Doctor_Type;
    private int Cost;
    private String Appointment_Status="Pending";

    Scanner sc=new Scanner(System.in);
 public String getServiceName(){
     return ServiceName;
 }
}

