package BaiTest4;

import java.util.Scanner;

public class Bai4_1 {
	static void phepchia() {
		System.out.println("ban chon phep chia");
	}

	static void phepcong() {
		System.out.println("phepcong\n");

	}

	static void pheptru() {
		System.out.println("phep tru");
	}

	static void phepnhan() {
		System.out.println("phep nhan");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("chuong trinh tinh");
		System.out.println("1.phep cong");
		System.out.println("2.phep tru");
		System.out.println("3.phep nhan");
		System.out.println("4. phep chia");
		System.out.println("moi ban nhap: ");
		int nhap = sc.nextInt();
		while (nhap < 1 || nhap > 4) {
			System.out.println("ban khong chon dung moi ban nhap lai");
			nhap = sc.nextInt();
			switch (nhap) {
			case 1: {
				phepcong();
				break;
			}
			case 2:
				pheptru();
				break;
			case 3:
				phepnhan();
				break;
			case 4:
				phepchia();
				break;
			default:
				System.out.println("bạn không nhập đúng tôi đã thoát chương trính");
				System.exit(0);
			}
		}
		sc.close();
	}

}
