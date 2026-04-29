package BaiTest4;

import java.util.Scanner;

public class Bai4_2 {
	static void ifElse() {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.println("moi ban nhap so a: ");
		a = sc.nextInt();
		System.out.println("moi ban nhap so b: ");
		b = sc.nextInt();
		if (a > b) {
			System.out.println("tot");
		} else {
			System.out.println("xui");
		}
		sc.close();
	}

	static void vongLapWhile() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("moi ban nhap 1 so: ");
		int a = sc.nextInt();
		while (true) {
			a++;
//			hàm chạy theo mili giây
			Thread.sleep(500);
			System.out.println("ban sap thanh cong: " + a);
			if (a == 15) {
				System.out.println("ban gioi vcl");
				break;
			}
		}
		sc.close();
	}

	static void Vonglapfor() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int tien;
		System.out.println("So tien cua ban: ");
		tien = sc.nextInt();

		for (int i = 0; i < 10000000; i++) {
			tien++;
			Thread.sleep(300);
			System.out.println(tien);
		}
		sc.close();

	}

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("moi ban chon: ");
		int c = sc.nextInt();

		switch (c) {
		case 1:
			Vonglapfor();
			break;
		case 2:
			vongLapWhile();
			break;
		case 3:
			ifElse();
			break;
		default:
			System.out.println("ban nhap k dung");
			break;
		}

		sc.close();

	}
}
