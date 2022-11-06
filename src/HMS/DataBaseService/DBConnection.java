package HMS.DataBaseService;
import java.sql.*;
public class DBConnection {
    private static String user="amine";
    private static String password="amine";
    private static String url="jdbc:mysql://localhost:3306/HosptitalManagementSystem";
    private static String database="HosptitalManagementSystem";
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection(url,user,password);
           System.out.println("connection succed");
           return con;
       }catch (Exception e){
           System.out.println(e.getMessage());
           return null;
       }

    }
    public static void test() throws SQLException, ClassNotFoundException {
        Connection cnx=getConnection();
        Statement stm=cnx.createStatement();
        ResultSet st=stm.executeQuery("select * from Users");

        while (st.next()){
            System.out.println(st.getString(1)+" "+st.getString(2)+" "+st.getString(3));
        }
        cnx.close();
    }
}
