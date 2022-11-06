package HMS.Services;

import HMS.DataBaseService.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login {
    Connection con=null;
    Statement statement=null;

    public void VerifyLogin(String userType,String passwd) throws SQLException, ClassNotFoundException {
        try {
            con = DBConnection.getConnection();
            statement = con.createStatement();
            ResultSet set = statement.executeQuery("select *  from Users where passwd='" + passwd + "'");
            set.next();
            if (set.getString(2).equalsIgnoreCase("patient")) {
                System.out.println("u are loged in as patient");
            }
        }catch (Exception e){
            System.out.println("error occured "+e.getMessage());
        }

    }
}
