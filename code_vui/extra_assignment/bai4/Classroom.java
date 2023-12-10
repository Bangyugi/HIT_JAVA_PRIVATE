package code_vui.extra_assignment.bai4;

import java.util.ArrayList;
import java.util.List;


public class Classroom {
    private String maLop;
    private String maKhoaHoc;
    private int chiPhi;
    private String ngayTaoLop;
    private int soLuongHocSinhToiDa;
    private List<Student> studentList = new ArrayList<>();

    public Classroom() {
    }

    public Classroom(String maLop, String maKhoaHoc, int chiPhi, String ngayTaoLop, int soLuongHocSinhToiDa,
            List<Student> studentList) {
        this.maLop = maLop;
        this.maKhoaHoc = maKhoaHoc;
        this.chiPhi = chiPhi;
        this.ngayTaoLop = ngayTaoLop;
        this.soLuongHocSinhToiDa = soLuongHocSinhToiDa;
        this.studentList = studentList;
    }

    public Classroom(String maLop, String maKhoaHoc, int chiPhi, String ngayTaoLop, int soLuongHocSinhToiDa) {
        this.maLop = maLop;
        this.maKhoaHoc = maKhoaHoc;
        this.chiPhi = chiPhi;
        this.ngayTaoLop = ngayTaoLop;
        this.soLuongHocSinhToiDa = soLuongHocSinhToiDa;

    }

    public List<Student> getStudentList() {
        return this.studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public String getMaLop() {
        return this.maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getMaKhoaHoc() {
        return this.maKhoaHoc;
    }

    public void setMaKhoaHoc(String maKhoaHoc) {
        this.maKhoaHoc = maKhoaHoc;
    }

    public int getChiPhi() {
        return this.chiPhi;
    }

    public void setChiPhi(int chiPhi) {
        this.chiPhi = chiPhi;
    }

    public String getNgayTaoLop() {
        return this.ngayTaoLop;
    }

    public void setNgayTaoLop(String ngayTaoLop) {
        this.ngayTaoLop = ngayTaoLop;
    }

    public int getSoLuongHocSinhToiDa() {
        return this.soLuongHocSinhToiDa;
    }

    public void setSoLuongHocSinhToiDa(int soLuongHocSinhToiDa) {
        this.soLuongHocSinhToiDa = soLuongHocSinhToiDa;
    }

    public Classroom maLop(String maLop) {
        setMaLop(maLop);
        return this;
    }

    public Classroom maKhoaHoc(String maKhoaHoc) {
        setMaKhoaHoc(maKhoaHoc);
        return this;
    }

    public Classroom chiPhi(int chiPhi) {
        setChiPhi(chiPhi);
        return this;
    }

    public Classroom ngayTaoLop(String ngayTaoLop) {
        setNgayTaoLop(ngayTaoLop);
        return this;
    }

    public Classroom soLuongHocSinhToiDa(int soLuongHocSinhToiDa) {
        setSoLuongHocSinhToiDa(soLuongHocSinhToiDa);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                " maLop='" + getMaLop() + "'" +
                ", maKhoaHoc='" + getMaKhoaHoc() + "'" +
                ", chiPhi='" + getChiPhi() + "'" +
                ", ngayTaoLop='" + getNgayTaoLop() + "'" +
                ", soLuongHocSinhToiDa='" + getSoLuongHocSinhToiDa() + "'" +
                "}";
    }

}
