import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int MULTIPLENUM = 3;
		System.out.print("���� �Է��Ͻÿ� : ");
		int enteredNumber = sc.nextInt();
		if(enteredNumber % MULTIPLENUM == 0){
			System.out.print(MULTIPLENUM+"�� ����Դϴ�.");
		}
		else{
			System.out.print(MULTIPLENUM+"�� ����� �ƴմϴ�.");
		}
	}

}
