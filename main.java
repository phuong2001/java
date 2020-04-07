package thuchanh;



import java.sql.SQLException;
import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);
    private static school sinhvienList = new school("B01010","Nguyen Tuan Anh","Ha Noi","0904818238");
    public static void main(String[] args) {
        boolean cc = false;
        printSinhvien();
        while (!cc) {
            int n = scanner.nextInt();
            scanner.nextLine();
            switch (n) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    addsinhvien();
                    break;
                case 2:
                    sinhvienList.printsinhvien();
                    break;
                case 3:
                sinhvienList.savesinhvien();
                    break;
            }
        }
    }
        public static void addsinhvien(){
        String id,name,diachi,phone;
            System.out.println("nhập id");
            id = scanner.nextLine();
            System.out.println("nhập tên sinh viên ");
            name = scanner.nextLine();
            System.out.println("nhập địa chỉ ");
            diachi = scanner.nextLine();
            System.out.println("nhập sdt ");
            phone = scanner.nextLine();
            sinhvien newsinhvien = sinhvien.addsinhvien1(id,name,diachi,phone);
            if (sinhvienList.addNewsinhvien(newsinhvien)){
                System.out.println("sinh viên mới : id ="+id+" name = "+name+" address = "+diachi+" phone = "+phone);
            }else {
                System.out.println("không thể, "+id+"đã có rồi");
            }
        }

        private static void printSinhvien() {
            System.out.println("0.in\n"
                    + "1.thêm sinh viên\n"
                    + "2.in ra sinh viên\n"
                    + "3.lưu\n");
        }
    }
