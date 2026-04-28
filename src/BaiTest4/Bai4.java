package BaiTest4;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double toan;
		double van;
		double anh;
		System.out.println("----------chuong trinh tinh tinh so hoc sinh truot---------------\n");
		System.out.print("moi ban nhap diem toan: ");
		toan = sc.nextDouble();
		System.out.print("moi ban nhap diem van: ");
		van = sc.nextDouble();
		System.out.println("moi ban nhap diem tieng anh: ");
		anh = sc.nextDouble();
		double tb = (van + toan + anh) / 3;
		if (tb >= 8.5) {
			System.out.println("ban da dat hoc sinh gioi");
		} else if (tb >= 7) {
			System.out.println("ban da dat hoc sinh kha");
		} else if (tb >= 5) {
			System.out.println("ban da dat hoc sinh tb");
		} else if (tb < 5) {
			System.out.println("ban da truot mon");
		} else {
			System.out.println("moi ban nhap lai");
		}

	}

}
