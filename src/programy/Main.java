package programy;

import javax.xml.transform.Result;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection polaczenie = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "");
            Statement stm = polaczenie.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM film");
            while (rs.next()){
                System.out.println(rs.getInt(1) + "; " + rs.getString(2) + "; " + rs.getString(3));
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
