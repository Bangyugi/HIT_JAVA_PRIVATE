package buoi5.bai_tap_tren_lop;

public class SanPham {
    private String ten;
    private int sl;
    private int gia;

    public SanPham() {
    }

    public SanPham(String ten, int sl, int gia) {
        this.ten = ten;
        this.sl = sl;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "BaiTapTrenLop.SanPham{" +
                "ten='" + ten + '\'' +
                ", sl=" + sl +
                ", gia=" + gia +
                '}';
    }
}
