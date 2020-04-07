package thuchanh;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class school {
    private ArrayList<sinhvien> mysinhvien;

    public school(String id, String name, String diachi, String phone) {
        this.mysinhvien = new ArrayList<sinhvien>();
    }

    public boolean addNewsinhvien(sinhvien student) {
        if (findsinhvien(student.getName()) >= 0) {
            System.out.println("Student is already on file");
            return false;
        }
        mysinhvien.add(student);
        return true;
    }

    private int findsinhvien(String sinhvienName) {
        for (int i = 0; i < this.mysinhvien.size(); i++) {
            sinhvien sinhvien = this.mysinhvien.get(i);
            if (sinhvien.getName().equals(sinhvienName)) {
                return i;
            }
        }
        return -1;
    }

    public void printsinhvien() {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adf2?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
        ) {
            ResultSet rset = stmt.executeQuery("select * from sinhvien");
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numColumns = rsetMD.getColumnCount();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= numColumns; ++i) {
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void savesinhvien() {
        try (
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/egift?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                PreparedStatement stmt = conn.prepareStatement("insert into student values (?, ?, ?, ?)");
        ) {
            for (int i = 0; i < this.mysinhvien.size(); i++) {
                stmt.setString(1, mysinhvien.get(i).getId());
                stmt.setString(2, mysinhvien.get(i).getName());
                stmt.setString(3, mysinhvien.get(i).getDiachi());
                stmt.setString(4, mysinhvien.get(i).getPhone());
                stmt.addBatch();
                stmt.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

