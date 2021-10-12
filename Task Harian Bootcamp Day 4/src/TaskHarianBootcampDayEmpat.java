import java.util.Scanner;

public class TaskHarianBootcampDayEmpat {
	Scanner sn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskHarianBootcampDayEmpat th = new TaskHarianBootcampDayEmpat();
		th.taskHarianSatu();
	}

	public void taskHarianSatu() {
		int ukuran = 10;
		int atasBawah = 5;
		int kiriKanan = 5;
		boolean menang = false;
		
		while (!menang) {
			for (int i = 0; i < ukuran; i++) {
				for (int j = 0; j < ukuran; j++) {
					if (i == atasBawah && j == kiriKanan) {
						System.out.print("@");
					} else if (i == 8 && j == 9) {
						System.out.print(" ");
					} else if (((i == 0) || (i == ukuran - 1)) || ((j == 0) || (j == ukuran - 1))) {					
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
			System.out.print("Masukan input (W A S D) : ");
			String input = sn.next();
			
			if (input.equalsIgnoreCase("w")) {
				atasBawah--;
			} else if (input.equalsIgnoreCase("a")) {
				kiriKanan--;
			} else if (input.equalsIgnoreCase("s")) {
				atasBawah++;
			} else if (input.equalsIgnoreCase("d")) {
				kiriKanan++;
			} else {
				System.out.println("Bukan valid input");
			}
			
			if (atasBawah == 8 && kiriKanan == 9) {
				menang = true;
				System.out.println("Anda menang");
			}
		}
	}
}
