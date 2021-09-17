import java.util.Scanner;
import java.math.*;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("\n \n Nhap vao so can kiem tra: ");
        a = sc.nextInt();
        if (a<2) {
            System.out.println(a+ "Khong phai so nguyen to");
        }else 
        {
            for(int i = 2; i <= Math.sqrt(a);i++){
                if (a%i==0) {
                    System.out.println(a+" Khong phai la so nguyen to");
                } else{
                    System.out.println(a+" La so nguyen to");
                }
            }
        }





    }
}
