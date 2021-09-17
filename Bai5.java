import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int i=0;
       float tong = 0;
       System.out.println("Nhập vao các sô thưc chuong trinh dung lai khi bạn chon so 0");
       while (i==0) {
           System.out.println("Nhap vao so thuc: ");
           float a = sc.nextFloat();
           if (a>0) {
               tong = tong +a;
           }else{
               if (a==0) {
                   i=1;
               }
           }
       }
       System.out.println("Tong cac so duong la:"+tong);
    }
}
