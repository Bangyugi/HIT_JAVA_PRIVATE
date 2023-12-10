package code_vui.extra_assignment.bai4;


public class Student extends Classroom {
    private String maHocVien;
    private String tenDayDu;
    private String diaChi;
    private String dienThoaiZalo;

    
    
    public Student() {
    }

    public Student(String maHocVien, String tenDayDu, String diaChi, String dienThoaiZalo) {
        this.maHocVien = maHocVien;
        this.tenDayDu = tenDayDu;
        this.diaChi = diaChi;
        this.dienThoaiZalo = dienThoaiZalo;
    }

    public Student(String maLop, String maKhoaHoc, int chiPhi, String ngayTaoLop, int soLuongHocSinhToiDa,
            String maHocVien, String tenDayDu, String diaChi, String dienThoaiZalo) {
        super(maLop, maKhoaHoc, chiPhi, ngayTaoLop, soLuongHocSinhToiDa);
        this.maHocVien = maHocVien;
        this.tenDayDu = tenDayDu;
        this.diaChi = diaChi;
        this.dienThoaiZalo = dienThoaiZalo;
    }

    public String getMaHocVien() {
        return this.maHocVien;
    }

    public void setMaHocVien(String maHocVien) {
        this.maHocVien = maHocVien;
    }

    public String getTenDayDu() {
        return this.tenDayDu;
    }

    public void setTenDayDu(String tenDayDu) {
        this.tenDayDu = tenDayDu;
    }

    public String getDiaChi() {
        return this.diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoaiZalo() {
        return this.dienThoaiZalo;
    }

    public void setDienThoaiZalo(String dienThoaiZalo) {
        this.dienThoaiZalo = dienThoaiZalo;
    }

    public Student maHocVien(String maHocVien) {
        setMaHocVien(maHocVien);
        return this;
    }

    public Student tenDayDu(String tenDayDu) {
        setTenDayDu(tenDayDu);
        return this;
    }

    public Student diaChi(String diaChi) {
        setDiaChi(diaChi);
        return this;
    }

    public Student dienThoaiZalo(String dienThoaiZalo) {
        setDienThoaiZalo(dienThoaiZalo);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " maHocVien='" + getMaHocVien() + "'" +
            ", tenDayDu='" + getTenDayDu() + "'" +
            ", diaChi='" + getDiaChi() + "'" +
            ", dienThoaiZalo='" + getDienThoaiZalo() + "'" +
            "}";
    }


}
