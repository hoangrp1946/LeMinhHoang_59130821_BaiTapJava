package baitap1;

/**
 *
 * @author Pc
 */
public class BaiTap1Main{
    public static void main(String[] args){
        NhanVien nv1 = new NhanVien("Minh Hiếu", 34, "Lào Cai", 500000, 700);
        NhanVien nv2 = new NhanVien("Trọng Đạt", 27, "Cà Mau", 400000, 600);
        nv1.getThongTin();
        nv2.getThongTin();
    }
}