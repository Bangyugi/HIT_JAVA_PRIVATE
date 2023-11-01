package buoi3.study_in_class;

public class Sinhvien {

  private String ID;
  private String name;

  

  public String getID() {
    return this.ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

 

  // ID và name là những thuộc tính trong class sinh viên
  // Hàm hay còn được gọi là các phương thức
  public void diHoc() {
    System.out.println(name + " dang di hoc");
  }

  // public void input() {
  // Scanner scan = new Scanner(System.in);
  // ID = scan.nextLine();
  // name = scan.nextLine();
  // scan.close();
  // }
  public Sinhvien() {
  }

  public Sinhvien(String ID, String name) {
    this.ID = ID;
    this.name = name;
  }

  public void display() {
    System.out.println("MSV: " + ID);
    System.out.println("Ten: " + name);
  }

  public Sinhvien(Sinhvien a) {
    this.ID = a.ID;
    this.name = a.name;
  }

  // public String getName()
  // {
  // return name;
  // }

  // public String getID()
  // {
  // return ID;
  // }

  // public void setName(String name)
  // {
  // this.name = name;
  // }

  // public void setID(String ID)
  // {
  // this.ID = ID;
  // }

}
