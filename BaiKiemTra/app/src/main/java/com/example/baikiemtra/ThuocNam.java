package com.example.baikiemtra;

public class ThuocNam {
    int anh;
    String tenkhoahoc, tenthuonggoi, dactinh, congdung, duoctinh;

    public ThuocNam(int anh, String ten, String capBac, String noiCongTac, String quocGia, String soSao) {
        this.anh = anh;
        this.tenkhoahoc = tenkhoahoc;
        this.tenthuonggoi = tenthuonggoi;
        this.dactinh = dactinh;
        this.congdung = congdung;
        this.duoctinh = duoctinh;
    }

    public ThuocNam() {
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public String getTenkhoahoc() {
        return tenkhoahoc;
    }

    public void setTenkhoahoc(String tenkhoahoc) {
        this.tenkhoahoc = tenkhoahoc;
    }

    public String getTenthuonggoi() {
        return tenthuonggoi;
    }

    public void setTenthuonggoi(String tenthuonggoi) {
        this.tenthuonggoi = tenthuonggoi;
    }

    public String getDactinh() {
        return dactinh;
    }

    public void setDactinh(String dactinh) {
        this.dactinh = dactinh;
    }

    public String getCongdung() {
        return congdung;
    }

    public void setCongdung(String congdung) {
        this.congdung = congdung;
    }

    public String getDuoctinh() {
        return duoctinh;
    }

    public void setDuoctinh(String duoctinh) {
        this.duoctinh = duoctinh;
    }
}
