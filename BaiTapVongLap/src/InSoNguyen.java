import java.util.Scanner;

public class InSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        do {
            System.out.println("  ");
            System.out.println("***********MENU**************");
            System.out.println("1: IN RA SỐ CHẴN VÀ TÍNH TỔNG");
            System.out.println("2: IN RA SỐ LẺ VÀ TÍNH TỔNG");
            System.out.println("3: KIỂM TRA SỐ NGUYÊN TỐ");
            System.out.println("4: KIỂM TRA SỐ HOÀN HẢO");
            System.out.println("5: IN RA SỐ NGUYÊN TỐ TRONG KHOẢNG");
            System.out.println("6: IN RA ƯỚC CỦA N VÀ TÍNH TỔNG");
            System.out.println("7: THOÁT");
            int so = Integer.parseInt(sc.nextLine());
            switch (so) {
                case 1:
                    sum = 0;
                    System.out.print("Nhập vào 1 số : ");
                    int num = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i <= num; i++) {
                        if (i % 2 == 0) {
                            System.out.printf("%-15s%5d\n", "Dãy số chẵn là : ", i);
                            sum += i;
                        }
                    }
                    System.out.println("Tổng của dãy số chẵn là: " + sum);
                    break;
                case 2:
                    int sum2 = 0;
                    System.out.print("Nhập vào 1 số : ");
                    int num2 = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i <= num2; i++) {
                        if (i % 2 != 0) {
                            System.out.printf("%-15s%5d\n", "Dãy số lẻ là : ", i);
                            sum2 += i;
                        }
                    }
                    System.out.println("Tổng của dãy số lẻ là: " + sum2);
                    break;
                case 3:
                    System.out.println("Nhập vào 1 số đi bạn :");
                    int num3 = Integer.parseInt(sc.nextLine());
                    if ( num3 < 2){
                        System.out.printf("Số đó ko phải số nguyên tố !");
                    }else {
                        int i = 2;
                        boolean check = true;
                        while (i<= Math.sqrt(num3)){
                            if( num3 % i == 0){
                                check = false;
                                break;
                            }
                            i++;
                        }
                        if ( check )
                            System.out.println("Đó là số nguyên tố");
                        else System.out.println("Đó không phải là số nguyên tố !");
                    }
                    break;
                case 4:
                    int sum4 = 0;
                    System.out.println("Nhập vào 1 số để kiểm tra : ");
                    int num4 = Integer.parseInt(sc.nextLine());
                    for ( int i= 1; i < num4 ; i++){
                        if( num4%i==0) {
                            sum4 += i;
                        }
                    }
                    if (sum4 == num4){
                        System.out.println("Đó là số hoàn hảo !");
                    }else {
                        System.out.println("Đó ko phải số hoàn hảo !");
                    }
                    break;
                case 5:
                    System.out.println("Nhập vào số đi bạn :");
                    int num5 = Integer.parseInt(sc.nextLine());
                    for ( int N =2; N<= num5; N++ ){
                        boolean check = false;
                        for (int i = 2 ; i<N ; i++){
                            if (N%i==0){
                                 check = true;
                            }
                        }
                        if (!check){
                            System.out.println( N );
                        }
                    }
                    break;
                case 6:
                    int sum6 = 0;
                    System.out.println("Nhập vào 1 số để kiểm tra : ");
                    int num6 = Integer.parseInt(sc.nextLine());
                    System.out.println("Các ước của " + num6 + " là : " );

                    for ( int i= 1; i < num6 ; i++){
                        if( num6%i==0) {
                            sum6 += i;
                            System.out.println(i);
                        }
                    }
                    System.out.println("Tổng của các ước là : " + sum6);
                    break;
                case 7:
                    break;
            }
        } while (true);
    }
}
