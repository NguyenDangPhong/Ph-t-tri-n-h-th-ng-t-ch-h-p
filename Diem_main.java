package Phan2;

public class Diem_main {
    public static void main(String[] args) {
        Diem a = new Diem(0,0);
        System.out.println("Nhap vao cac toa do cua diem A: ");
        a.NhapDiem();
        a.HienThi();
        a.KhoangCach();
        System.out.println("Khoang cach tu Diem A den O(0,0) la: " + a.KhoangCach());
    }
}
