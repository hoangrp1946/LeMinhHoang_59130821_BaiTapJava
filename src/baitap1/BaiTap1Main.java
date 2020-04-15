package baitap1;

/**
 *
 * @author Pc
 */
public class BaiTap1Main {
    public static void main(String[] args){
        NhanVien nv1 = new NhanVien("Hiếu", 34, "Lào Cai", 500, 700);
        NhanVien nv2 = new NhanVien("Đạt", 27, "Cà Mau", 400, 600);
        System.out.println("Thong tin Nhan vien 1: "); nv1.getThongTin();
        System.out.println("Thong tin Nhan vien 2: "); nv2.getThongTin();
    }
}