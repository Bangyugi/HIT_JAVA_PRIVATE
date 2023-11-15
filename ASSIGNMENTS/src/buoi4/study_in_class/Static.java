package buoi4.study_in_class;

public class Static {
    public static void main(String[] args) {
        // cho phép ghi đè
        // được truy suất đến mà không cần khởi tạo hay khai báo

        // biến static dùng làm thuộc tính chung và dùng chung dữ liệu | tiết kiệm bộ
        // nhớ
        SinhVien a = new SinhVien("Bang");
        SinhVien b = new SinhVien("Nam");
        System.out.println(a);
        System.out.println(b);

        // phương thức static
        System.out.println(Math.max(3, 5));

        // khối static

        // lớp static = nested class

    }

}
