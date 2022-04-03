package com.example.lab6_bt4.model;

public class DSNhac {
    private int Hinh;
    private String TenBaiHat;
    private String tenCaSi;
    private String LuotXem;
    private String Thich;
    private String KhongThich;

    public DSNhac() {
    }

    public DSNhac(int hinh, String tenBaiHat, String tenCaSi, String luotXem, String thich, String khongThich) {
        Hinh = hinh;
        TenBaiHat = tenBaiHat;
        this.tenCaSi = tenCaSi;
        LuotXem = luotXem;
        Thich = thich;
        KhongThich = khongThich;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }

    public String getTenBaiHat() {
        return TenBaiHat;
    }

    public void setTenBaiHat(String tenBaiHat) {
        TenBaiHat = tenBaiHat;
    }

    public String getTenCaSi() {
        return tenCaSi;
    }

    public void setTenCaSi(String tenCaSi) {
        this.tenCaSi = tenCaSi;
    }

    public String getLuotXem() {
        return LuotXem;
    }

    public void setLuotXem(String luotXem) {
        LuotXem = luotXem;
    }

    public String getThich() {
        return Thich;
    }

    public void setThich(String thich) {
        Thich = thich;
    }

    public String getKhongThich() {
        return KhongThich;
    }

    public void setKhongThich(String khongThich) {
        KhongThich = khongThich;
    }
}
