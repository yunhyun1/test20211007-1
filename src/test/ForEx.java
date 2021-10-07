package test;

import java.util.Scanner;

public class ForEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= 9; i++) {// ��������� ���� 
			for (int j = 1; j <= 9; j++) { // �ڿ� �������� ���ڸ� ���� 
				System.out.print(i + "x" + j + "=" + (i * j));
				System.out.print("\t"); // tab
			}
//			System.out.println();
			System.out.print("\n"); // new line 
			System.out.println("dd  ");
		}
	}
}
