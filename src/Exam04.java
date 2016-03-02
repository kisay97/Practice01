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
			if(myNum > n){
				System.out.println("더 낮게");
				turn++;
			}
			else if(myNum < n){
				System.out.println("더 높게");
				turn++;
			}
			else{
				System.out.println("맞았습니다");
				System.out.println("다시하시겠습니까(y/n)");
				String str = sc.nextLine();
				if(str == "y") continueGame = 
			}
		}while(continueGame);
	}
}