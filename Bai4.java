import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap vao so n can tinh: ");
        int a = sc.nextInt();
        long tong = 0;
        for(int i = 1 ;i<=a; i++){
            tong = tong + i;
        }
        System.out.println("Tong tu 1 den n la: " + tong);


    }
    
}
