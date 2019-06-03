package datasource;
import java.sql.*;
public class DatabaseExampleOne {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/expense_management","root","");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from canada_expense");
            while (rs.next())
            {
                System.out.println("Id: "+rs.getInt("Cid")+" Amount "+rs.getInt("Amount"));
            }
            con.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
