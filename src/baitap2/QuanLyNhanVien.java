/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import baitap1.NhanVien;
import java.util.ArrayList;
/**
 *
 * @author Pc
 */
public class QuanLyNhanVien implements IQuanLy{
     ArrayList<NhanVien> dsNhanVien = new ArrayList<>();
     
     @Override
    public void them(NhanVien nv){
     dsNhanVien.add(nv);
    }
    @Override
    public void inDS(){
        for(NhanVien nv: dsNhanVien){
        System.out.println(nv); nv.getThongTin();
        }
    }
}
