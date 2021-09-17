
package Phan2;
import java.util.Scanner;
public class Diem{
    private int x;
    private int y;
    Diem(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void NhapDiem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao hoanh do diem A: ");
        x = sc.nextInt();
        System.out.println("Nhap vao tung do diem A");
        y = sc.nextInt();
    }
    public void HienThi(){
        System.out.println("Toa do diem A ban vua nhap la: ("+x+","+y+")");
    }
    public float KhoangCach(){
        return (float)Math.sqrt(x*x + y*y);
    }
    
}
