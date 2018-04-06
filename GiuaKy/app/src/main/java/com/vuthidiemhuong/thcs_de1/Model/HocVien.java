package com.vuthidiemhuong.thcs_de1.Model;

/**
 * Created by ASUS on 4/3/2018.
 */

public class HocVien {
    int maHV;
    String noiDung;
    String soTien;
    int hinhThuc;
    String dangKy;

    public HocVien(String noiDung, String soTien, int hinhThuc) {
        this.noiDung = noiDung;
        this.soTien = soTien;
        this.hinhThuc = hinhThuc;

    }

    public String getnoiDung() {
        return noiDung;
    }

    public void setnoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getsoTien() {
        return soTien;
    }

    public void setsoTien(String soTien) {
        this.soTien = soTien;
    }

    public int gethinhThuc() {
        return hinhThuc;
    }

    public void sethinhThuc(int hinhThuc) {
        this.hinhThuc = hinhThuc;
    }


}
