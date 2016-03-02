import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		final int MAX = 100;
		final int MIN = 1;
		int n = ((int)(Math.random()*MAX)) + MIN;
		Scanner sc = new Scanner(System.in);
		int myNum = 0;
		int turn = 1;
		boolean continueGame = false;
		do{
			System.out.println("수를 결정하였습니다. 맞추어 보세요\n"+MIN+"-"+MAX);
			System.out.print(turn+">>"); myNum = sc.nextInt();
		}while(continueGame);
	}
}