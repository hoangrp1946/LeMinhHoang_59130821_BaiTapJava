/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author Pc
 */
import baitap1.NhanVien;
public class BaiTap2Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        IQuanLy QLNV = new QuanLyNhanVien();
        NhanVien nv3 = new NhanVien("Vỹ", 25, "Hà Nội", 900000, 800);
        NhanVien nv4 = new NhanVien("Long", 28, "Vinh", 500000, 300);
        NhanVien nv5 = new NhanVien("Thành", 34, "Cà Mau", 700000, 600);
        NhanVien nv6 = new NhanVien("Minh", 31, "Thanh Hóa", 800000, 800);
        NhanVien nv7 = new NhanVien("Dũng", 29, "Huế", 700000, 800);
        QLNV.them(nv3);
        QLNV.them(nv4);
        QLNV.them(nv5);
        QLNV.them(nv6);
        QLNV.them(nv7);
        QLNV.inDS();
    } 
}
