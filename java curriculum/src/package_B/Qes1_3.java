package package_B;

import java.util.Scanner;


public class Qes1_3 {
		public static void main(String[] args) {
			
			do {
			Scanner scanner = new Scanner(System.in);
			String name = scanner.nextLine();		
			if(name.length() == 0) {
				System.out.print("名前を入力してください。");
			}
			else if(name.length()>10) {
				System.out.print("10文字いないにしてください。");
			}
			else {
				System.out.print("入力した「"+name+"」を登録しました。");
				break;
			}}
			
			while(true);
			
		}
		
		
		

		
}