package Phan2;
import java.util.Scanner;
public class PhanSo {
    private int tu;
    private int ma;
    PhanSo(int tu,int ma){
        this.tu= tu;
        this.ma= ma;
    }
    public int getTu(){
        return tu;
    }
    public void setTu(int tu){
        this.tu = tu;
    }
    public int getMau(){
        return ma;
    }
    public void setMau(int ma ){
        this.ma = ma;
    }

    public void NhapPS(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao tu so");
        tu = sc.nextInt();
        System.out.println("Nhap vao mau so");
        ma = sc.nextInt();
    }
    public void HienThiPS(){
        System.out.println("Phan so phan vua nhap la: " + tu +"/"+ ma);
    }
    public void NghichDaoPS(){
        int a;
        a = tu;
        tu = ma;
        ma = a;
        System.out.println("Phan so sau khi nghich dao la: " +tu+"/"+ma);
    }
    public void NghichDaoPS1(){
        int a;
        a = tu;
        tu = ma;
        ma = a;
    }
    public int timUCLN(int a, int b){
        while(a !=b){
            if(a>b){
                a-=b;
            }else{
                b -= a;
            }
        }
        return a;
    }
    public void toiGian(){
        int i = timUCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu()/i);
        this.setMau(this.getMau()/i);
    }
    public void congPS(PhanSo ps){
        int ts = this.getTu()*ps.getMau() + ps.getTu()*this.getMau();
        int ms = this.getMau()*ps.getMau();
        PhanSo phansoTong = new PhanSo(ts, ms);
        phansoTong.toiGian();
        System.out.println("Tong 2 phan so tren la: "+phansoTong.tu+"/"+phansoTong.ma);
    }
    public void truPS(PhanSo ps){
        int ts = this.getTu()*ps.getMau() - ps.getTu()*this.getMau();
        int ms = this.getMau()*ps.getMau();
        PhanSo phansoHieu = new PhanSo(ts, ms);
        phansoHieu.toiGian();
        System.out.println("Hieu 2 phan so tren la: "+phansoHieu.tu+"/"+phansoHieu.ma);
    }
    public void NhanPS(PhanSo ps){
        int ts = this.getTu()*ps.getTu();
        int ms = this.getMau()*ps.getMau();
        PhanSo phansoTich = new PhanSo(ts, ms);
        phansoTich.toiGian();
        System.out.println("Tich 2 phan so tren la: "+phansoTich.tu+"/"+phansoTich.ma);
    }
    public void chiaPS(PhanSo ps){
        int ts = this.getTu()*ps.getMau();
        int ms = this.getMau()*ps.getTu();
        PhanSo phansoThuong = new PhanSo(ts, ms);
        phansoThuong.toiGian();
        System.out.println("Thuong 2 phan so tren la: "+phansoThuong.tu+"/"+phansoThuong.ma);
    }

}
