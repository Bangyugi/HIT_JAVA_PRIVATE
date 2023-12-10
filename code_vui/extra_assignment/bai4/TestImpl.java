package code_vui.extra_assignment.bai4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TestImpl implements Test{
    public void generateRandomStudents(int numberOfStudents, List<Student> students) {
        String firstName[] = { "Tran", "Pham", "Le", "Nguyen", "Huynh", "Hoang", "Phan", "Vu",
                "Vo", "Dang", "Bui", "Do", "Ho", "Ngo", "Duong", "Ly", "Ha", "Ngo" };
        String lastName[] = { "Van Bang", "Thi Minh Hang", "Ha Phuong", "Minh Tuan", "Duc Kien", "Van Dung",
                "Quoc Anh",
                "Thu Ha", "Van Hien", "Thi Hong", "Quang Huy", "Duy Hung", "Van Huong",
                "Huu Khanh", "Minh Khai", "Thi Loan", "Van Nhan", "Dinh Phuong", "Van Quyen", };
        String address[] = { "Ha Tinh", "Nghe An", "Quang Binh", "Quang Tri", "Thua Thien-Hue", "Da Nang",
                "Quang Nam", "Quang Ngai", "Binh Dinh", "Phu Yen", "Khanh Hoa", "Ninh Thuan",
                "Binh Thuan", "Kon Tum", "Gia Lai", "Dak Lak", "Dak Nong", "Lam Dong",
                "Binh Phuoc", "Tay Ninh", "Binh Duong", "Dong Nai", "Ba Ria-Vung Tau",
                "Ho Chi Minh City", "Long An", "Tien Giang", "Ben Tre", "Tra Vinh",
                "Vinh Long", "Dong Thap", "An Giang", "Kien Giang", "Can Tho", "Hau Giang",
                "Soc Trang", "Bac Lieu", "Ca Mau" };

        String zalo[] = { "0918280056", "0234236824", "0987654321", "0845678901", "0978123456",
                "0922334455", "0888777666", "0865432109", "0890123456", "0934567890",
                "0961234567", "0945678901", "0854321098", "0912345678", "0999888777",
                "0976543210", "0923456789", "0987654321", "0956789012", "0876543210" };

        List<String> temp = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numberOfStudents; i++) {
            String randomMaHocVien = "HV" + (i + 1);
            String randomTenDayDu = firstName[random.nextInt(firstName.length)] + " "
                    + lastName[random.nextInt(lastName.length)];
            String randomDiaChi = address[random.nextInt(address.length)];
            String randomDienThoaiZalo;
            do {
                randomDienThoaiZalo = zalo[random.nextInt(zalo.length)];

            } while (temp.contains(randomDienThoaiZalo));

            temp.add(randomDienThoaiZalo);

            Student student = new Student()
                    .maHocVien(randomMaHocVien)
                    .tenDayDu(randomTenDayDu)
                    .diaChi(randomDiaChi)
                    .dienThoaiZalo(randomDienThoaiZalo);

            students.add(student);
        }

    }

    public  void sortByName(List<Student> students) {
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                if (a.getTenDayDu().compareTo(b.getTenDayDu()) > 0) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }

    public  void searchingByName(List<Student> students) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input name:");
        String name = scan.nextLine();
        for (Student student : students) {
            if (student.getTenDayDu().contains(name)) {
                System.out.println(student.toString());
            }
        }
    }

    public  void danhSachLopHoc(List<Classroom> classrooms, List<Student> students) {
        Random random = new Random();
        int temp = random.nextInt(5) + 5;
        // int temp = 5;
        for (int i = 0; i < Math.ceil((double) students.size() / temp); i++) {
            String randomMaLop = "CNTT" + (i + 1);
            String randomMaKhoaHoc = "K" + (i + 16);
            int randomChiPhi = 9200000;
            String randomNgayTaoLop = random.nextInt(28) + 1 + "/" + random.nextInt(11) + 1 + "/" + "2023";
            int randomSoLuongHocSinhToiDa = temp;
            List<Student> tempList = new ArrayList<>();
            tempList.addAll(students.subList(i * temp, Math.min((i + 1) * temp, students.size())));

            Classroom classroom = new Classroom()
                    .maLop(randomMaLop)
                    .maKhoaHoc(randomMaKhoaHoc)
                    .chiPhi(randomChiPhi)
                    .ngayTaoLop(randomNgayTaoLop)
                    .soLuongHocSinhToiDa(randomSoLuongHocSinhToiDa);

            classroom.setStudentList(tempList);

            classrooms.add(classroom);

        }
        for (Classroom classroom : classrooms) {
            System.out.println(classroom.toString());
        }
    }

    public  void soLuongThongKe(List<Classroom> classrooms) {
        for (Classroom classroom : classrooms) {
            System.out.println(classroom.getStudentList().size());
        }
    }
}
