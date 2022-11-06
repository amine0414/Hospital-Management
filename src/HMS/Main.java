package HMS;

import HMS.DataBaseService.DBConnection;
import HMS.Interfaces.HopitalFactoryCreator;
import HMS.Interfaces.SerivceHopital;
import HMS.Model.Patient;
import HMS.Model.Person;
import HMS.Services.Login;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        HopitalFactoryCreator exemple=new HopitalFactoryCreator();
        Person pat= exemple.getFactory("Person").getPerson("patient");
        SerivceHopital service=exemple.getFactory("ServiceHopital").getService("Report");
        String srv=service.getServiceName();
        String pt=pat.getPersonType();
        System.out.println(pt);
        //va afficher PATIENT
        System.out.println(srv);
        //va afficher REPORT
        System.out.println("login as \n 1-Patient\n 2-Doctor\n 3-Admin");
        Scanner sc=new Scanner(System.in);
        String choice=sc.next();
        System.out.println("enter password");
        String pass=sc.next();
        Login log=new Login();
        try{
            log.VerifyLogin(choice,pass);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
