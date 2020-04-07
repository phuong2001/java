package java2_07;

import java.sql.*;

public class JdbcUpdateTest {
    public static void main(String[] args) throws SQLException {
        try(
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/egift?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root",
                "");
        Statement stmt = conn.createStatement();
        ){
            String strUpdate = "cập nhật giá đặt sách = price*0.7, qty = qty+1, where id = 1001";
            System.out.println("the SQL statement is: " + strUpdate + "\n");
            int countUpdate = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdate + "records affected.\n");

            String strSelect = "select * from book where id = 1001";
            System.out.println("the SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeUpdate(strSelect);

            while (rset.next()){
                System.out.println(rset.getInt("id")+"," + rset.getString("author")+","
                + rset.getString("title")+","
                + rset.getDouble("price")+","
                + rset.getInt("qty"));
            }

        } catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
