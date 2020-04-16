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
public abstract class SinhVienPoly{
    public String hoTen;
    public String nganh;
    public SinhVienPoly(String hoTen, String nganh){
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    public abstract double getDiem();
    public String getHocLuc(){
        if(getDiem() <5)
            return "Yếu";
        if(getDiem() <6.5)
            return "Trung bình";
        if(getDiem() <7.5) 
            return "Khá";      
        else if(getDiem() <9)
            return "Giỏi";
            return "Xuất sắc";       
    }
    public void xuat(){
        System.out.println("Họ tên: "+hoTen+"\n"+"Ngành học: "+nganh);
    }   
}
