package Tuan5;

import java.util.Scanner;
public class MainCN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng công nhân: ");
        int soLuongCongNhan = scanner.nextInt();

        DanhSachCongNhan danhSach = new DanhSachCongNhan(soLuongCongNhan);

        for (int i = 0; i < soLuongCongNhan; i++) {
            scanner.nextLine(); 

            System.out.println("Nhập thông tin công nhân thứ " + (i + 1));

            System.out.print("Mã công nhân: ");
            String maCN = scanner.nextLine();

            System.out.print("Họ: ");
            String mHo = scanner.nextLine();

            System.out.print("Tên: ");
            String mTen = scanner.nextLine();

            System.out.print("Số sản phẩm: ");
            int mSoSP = scanner.nextInt();

            CongNhan congNhan = new CongNhan(maCN, mHo, mTen, mSoSP);
            danhSach.themCongNhan(congNhan);
        }

        System.out.println("\nDanh sách công nhân:");
        danhSach.hienThiDanhSachCongNhan();

        System.out.println("\nCông nhân có số sản phẩm >= 200:");
        danhSach.hienThiCongNhanTren200SP();

        System.out.println("\nDanh sách công nhân sau khi sắp xếp theo số sản phẩm:");
        danhSach.sapXepTheoSoSP();
        danhSach.hienThiDanhSachCongNhan();

        scanner.close();
    }
}