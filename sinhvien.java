package thuchanh;

public class sinhvien {

    private String id;
    private String name;
    private String diachi;
    private String phone;

    public sinhvien(){

    }
    public sinhvien(String id, String name, String diachi, String phone){
        this.id=id;
        this.name=name;
        this.diachi=diachi;
        this.phone=phone;
    }
    public  String getId(){
        return id;
    }
    public  String getName(){
        return name;
    }
    public  String getDiachi(){
        return diachi;
    }
    public String getPhone(){
        return phone;
    }
    public void setDiachi(String diachi){
        this.diachi = diachi;
    }
    public  void setPhone(String phone){
        this.phone = phone;
    }
    public  void setName(String name){
        this.name = name;
    }
    public static sinhvien addsinhvien1(String id, String name, String diachi, String phone){
        return new  sinhvien(id,name,diachi,phone);
    }
}
