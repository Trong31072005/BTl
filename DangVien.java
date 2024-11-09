
package quanlidangviendemo;



public class DangVien{
private String ID;
private String name;
private int age;
private String Dongphi;
private String phongtrao;
private String Khenthuong;
private String kiluat;

    public DangVien(String ID, String name, int age, String Dongphi, String phongtrao, String Khenthuong, String kiluat) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.Dongphi = Dongphi;
        this.phongtrao = phongtrao;
        this.Khenthuong = Khenthuong;
        this.kiluat = kiluat;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDongphi() {
        return Dongphi;
    }

    public String getPhongtrao() {
        return phongtrao;
    }

    public String getKhenthuong() {
        return Khenthuong;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDongphi(String Dongphi) {
        this.Dongphi = Dongphi;
    }

    public void setPhongtrao(String phongtrao) {
        this.phongtrao = phongtrao;
    }

    public void setKhenthuong(String Khenthuong) {
        this.Khenthuong = Khenthuong;
    }

    public void setKiluat(String kiluat) {
        this.kiluat = kiluat;
    }
    

    public String getKiluat() {
        return kiluat;
    }

  

    
}
