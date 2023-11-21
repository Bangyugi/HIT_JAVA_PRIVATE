package buoi5.bai_tap_tren_lop;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        HoaDon x = new HoaDon();
        x.setTen("HOA DON BAN HANG");
        x.setKhachHang(new KhachHang("Kien", "0969992581", "Ha Noi"));
        ArrayList<SanPham> listSp = new ArrayList<>();
        listSp.add(new SanPham("Banh mi", 2, 15000));
        listSp.add(new SanPham("Xoi", 1, 20000));
        x.setListSp(listSp);
        x.setShip(30000);

        x.display();
    }
}