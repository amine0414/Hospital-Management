package HMS.Services;

import HMS.DataBaseService.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Register {
  public static void SavePatient(int pid,String FN,String LN,String Gender,String CN,int age,String Email,String BloodGroup,String Address) throws SQLException, ClassNotFoundException {
      try{
          Connection con= DBConnection.getConnection();
          Statement st=con.createStatement();
          st.executeUpdate("INSERT INTO Patients VALUES ('"+pid+"','"+FN+"','"+LN+"','"+Gender+"','"+CN+"','"+age+"','"+Email+"','"+BloodGroup+"','"+Address+"')");
          System.out.println("Registered Succesfully!!");
          con.close();

      }catch(Exception e){
          System.out.println("Error occured "+e.getMessage());

      }

  }
    public static void SaveDoctor(int docid,String FN,String LN,String Gender,String CN,int age,int cost,String DocType,String Email) throws SQLException, ClassNotFoundException {
        try{
            Connection con= DBConnection.getConnection();
            Statement st=con.createStatement();
            st.executeUpdate("INSERT INTO Doctors VALUES ('"+docid+"','"+FN+"','"+LN+"','"+Gender+"','"+CN+"','"+age+"','"+cost+"','"+DocType+"','"+Email+"')");
            con.close();
            System.out.println("Registered Succesfully!!");


        }catch(Exception e){
            System.out.println("Error occured "+e.getMessage());

        }

    }
    public static void SaveAppointment(int Apid,int pid,String problem,int Did,String DName,String DType,int cost,String AppStatus) throws SQLException, ClassNotFoundException {
        try{
            Connection con= DBConnection.getConnection();
            Statement st=con.createStatement();
            st.executeUpdate("INSERT INTO Appointments VALUES ('"+Apid+"','"+pid+"','"+problem+"','"+Did+"','"+DName+"','"+DType+"','"+cost+"','"+cost+"','"+AppStatus+"')");
            System.out.println("Registered Succesfully!!");
            con.close();
        }catch(Exception e){
            System.out.println("Error occured "+e.getMessage());

        }

    }
}
