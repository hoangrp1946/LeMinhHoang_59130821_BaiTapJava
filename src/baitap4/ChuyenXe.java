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
public class ChuyenXe{
    private String MSChuyen;
    private String hoTenTX;
    private String soXe;
    private double doanhThu;
    ChuyenXe(String MSChuyen, String hoTenTX, String soXe, double doanhThu){
        this.MSChuyen = MSChuyen;
        this.hoTenTX = hoTenTX;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }
    public void xuat(){
        System.out.println("Mã số chuyến: " + MSChuyen+"\n" + "Họ tên tài xế: " +hoTenTX+"\n" + "Số xe: " +soXe+"\n" + "Doanh thu: " +doanhThu);
    }
    public double getdoanhThu() {
        return doanhThu;
    }    

    double getDoanhThu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
