package Hus;

/**
 *
 * @author LeVan
 */
public class Monhoc implements java.io.Serializable{
    String maMon;
    String tenMon;
    String giangVien;
    int soTinChi;

    public Monhoc(String maMon, String tenMon, int soTinChi, String giangVien) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTinChi = soTinChi;
        this.giangVien = giangVien;
    }

    public Monhoc() {
    }

    public String getGiangVien() {
        return giangVien;
    }

    public void setGiangVien(String giangVien) {
        this.giangVien = giangVien;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getSoTinChi() {
        return soTinChi;
    }
    public String soTinChiToString() {
        return ""+soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }
    public String toMonHoc(){
        return this.getMaMon()+","+this.getTenMon()+","+this.getSoTinChi()+","+this.getGiangVien();
    }
    public Object[] toArray(){
        return new Object[]{maMon,tenMon,soTinChi,giangVien};
    }
}
