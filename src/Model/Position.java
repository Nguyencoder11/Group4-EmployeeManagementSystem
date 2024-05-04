/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ADMIN
 */
public class Position {

    private int idChucVu;   // id chuc vu
    private String maChucVu;    // ma chuc vu
    private String tenChucVu;   // ten chuc vu
    private String ghiChu;  // ghi chu

    public Position(int idChucVu, String maChucVu, String tenChucVu, String ghiChu) {
        this.idChucVu = idChucVu;
        this.maChucVu = maChucVu;
        this.tenChucVu = tenChucVu;
        this.ghiChu = ghiChu;
    }

    public int getIdChucVu() {
        return idChucVu;
    }

    public void setIdChucVu(int idChucVu) {
        this.idChucVu = idChucVu;
    }

    public String getMaChucVu() {
        return maChucVu;
    }

    public void setMaChucVu(String maChucVu) {
        this.maChucVu = maChucVu;
    }

    public String getTenChucVu() {
        return tenChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
