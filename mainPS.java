package Phan2;

public class mainPS {
   public static void main(String[] args) {
       PhanSo ps1 = new PhanSo(1, 1);
       PhanSo ps2 = new PhanSo(5, 6);
       System.out.println("Nhap vao phan so thu nhat: ");
       ps1.NhapPS();
       ps1.HienThiPS();
       ps1.NghichDaoPS();
       ps1.NghichDaoPS1();
       System.out.println("Nhap vao phan so thu 2: ");
       ps2.NhapPS();
       ps2.HienThiPS();
       ps2.NghichDaoPS();
       ps2.NghichDaoPS1();
       System.out.println("----------------------------");
       ps1.congPS(ps2);
       ps1.truPS(ps2);
       ps1.NhanPS(ps2);
       ps1.chiaPS(ps2);
   }
}
