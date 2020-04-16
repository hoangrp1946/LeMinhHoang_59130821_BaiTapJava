/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

/**
 *
 * @author Pc
 */
public class BaiTap4Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        QuanLyChuyenXe QLChuyenXe = new QuanLyChuyenXe();
        ChuyenXe XeNgT1 = new XeNoiThanh("001", 400, "01", "Nguyễn Tiến Vinh", "PY1234", 15000000);
        ChuyenXe XeNgT2 = new XeNoiThanh("002", 300, "02", "Lâm Canh Tân", "BT1234", 12000000);
        ChuyenXe XeNgT3 = new XeNoiThanh("003", 200, "03", "Nguyễn Viết Tùng", "HN1234", 9000000);
        ChuyenXe XeNgT4 = new XeNgoaiThanh("Bà Rịa - Vũng Tàu", 3, "04", "Nguyễn Cao Tùng", "SG3249", 8000000);
        ChuyenXe XeNgT5 = new XeNgoaiThanh("Nha Trang", 2, "05", "Nguyễn Việt Minh", "TH6521", 11000000);
        ChuyenXe XeNgT6 = new XeNgoaiThanh("Đà Lạt", 1, "06", "Đinh Ninh", "LC2314", 9000000);
        
        QuanLyChuyenXe quanLyChuyenXe = new QuanLyChuyenXe();
        QLChuyenXe.themChuyenXe(XeNgT1);
        QLChuyenXe.themChuyenXe(XeNgT2);
        QLChuyenXe.themChuyenXe(XeNgT3);
        QLChuyenXe.themChuyenXe(XeNgT4);
        QLChuyenXe.themChuyenXe(XeNgT5);
        QLChuyenXe.themChuyenXe(XeNgT6);
        QLChuyenXe.xuatDS();
        
        System.out.println("Tổng doanh thu xe nội thành: "+QLChuyenXe.tongDoanhThuNoiThanh());
        System.out.println("Tổng doanh thu xe ngoại thành: "+QLChuyenXe.tongDoanhThuNgoaiThanh());
        System.out.println("Tổng doanh thu 2 loại xe: "+(QLChuyenXe.tongDoanhThuNoiThanh()+QLChuyenXe.tongDoanhThuNgoaiThanh()));  
    }
    
}
