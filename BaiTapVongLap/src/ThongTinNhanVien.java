import java.util.Scanner;

public class ThongTinNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Id = "";
        String tenHocSinh = "";
        int tuoi = 0;
        boolean sex = true ;
        String email = "";
        int sdt = 0;
        String diachi = "";
        do{
            System.out.println("  ");
            System.out.println("==========MENU=========");
            System.out.println("1: Nhập thông tin sinh viên !");
            System.out.println("2: Hiển thị thông tin nhân viên !");
            System.out.println("3: Tính tuổi nhân viên");
            System.out.println("4: Thoát!");
            int so = Integer.parseInt(sc.nextLine());
            switch (so){
                case 1 :
                    System.out.println("Nhap vao id sinh vien : ");
                     Id = sc.nextLine();

                    System.out.println("Nhập vào tên sinh viên : ");
                     tenHocSinh = sc.nextLine();

                    System.out.println("Nhập vào số tuổi : ");
                    tuoi = Integer.parseInt(sc.nextLine());

                    System.out.println("Nhập vào giới tính : ");
                     sex = Boolean.parseBoolean(sc.nextLine());

                    System.out.println("Nhập vào email : ");
                     email = sc.nextLine();

                    System.out.println("Nhập số điện thoại :");
                     sdt = Integer.parseInt(sc.nextLine());

                    System.out.println(" Địa chỉ ");
                     diachi = sc.nextLine();

                    break;
                case 2:
                    System.out.printf("%10s%5s%25s%10s%20s%5d\n", "ID Hoc Sinh :", Id ,"Ten Hoc Sinh :", tenHocSinh,"Tuoi:",tuoi);
                    System.out.printf("%10s%5s%20s%10s%30s%5d\n", "Giới tính :", sex ,"Email :", email,"So dien thoai :", sdt);
                    System.out.printf("%10s%10s","Dia chi :",diachi);
                    break;
                case 3:
                    System.out.println("Nhập vào số năm nhập học để kiểm tra tuổi sinh viên");
                    int nam = Integer.parseInt(sc.nextLine());
                    int SV = 2022 - nam;
                    System.out.println("Sinh viên năm " + SV);
                    break;
                case 4:
                    break;
            }
        }while (true);

    }
}
