import javax.sql.StatementEvent;
import java.sql.SQLException;
import java.sql.*;

public class JdbcSelectTest {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc.mysql://localhost:3306/ebookshop?allowPublickeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root","");
                Statement stmt = conn.createStatement();
                ){
            String strSelect = "select title,price,qty from books";
            System.out.println("the SQL statements is: "  + strSelect +"\n");

            ResultSet rset = stmt.executeQuery(strSelect);
            System.out.println("the records selected are");
            int rowCount = 0;
            while (rset.next()){
                String title  = rset.getString("title");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(title+","+price+","+qty);
                ++rowCount;
            }
            System.out.println("total number of records ="+ rowCount);

        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
