/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author Pc
 */
public class BaiTap3Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        SinhVienPoly Poly = new SinhVienIT("Ngô Văn Duy", "IT", 7, 7, 5);
        SinhVienIT IT = new SinhVienIT("Phan Đình Lâm", "IT", 5, 8, 7);
        SinhVienBiz Biz = new SinhVienBiz("Trương Văn Sơn", "Biz", 8, 9);
        Poly.xuat();
        System.out.println("Điểm: " + Poly.getDiem());
        System.out.println("Học lực: " + Poly.getHocLuc());    
        IT.xuat();
        System.out.println("Điểm: " + IT.getDiem());
        System.out.println("Học lực: " + IT.getHocLuc());      
        Biz.xuat();
        System.out.println("Điểm: " + Biz.getDiem());
        System.out.println("Học lực: " + Biz.getHocLuc());
    }   
}
