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
			System.out.println("���� �����Ͽ����ϴ�. ���߾� ������\n"+MIN+"-"+MAX);
			System.out.print(turn+">>"); myNum = sc.nextInt();
			if(myNum > n){
				System.out.println("�� ����");
				turn++;
			}
			else if(myNum < n){
				System.out.println("�� ����");
				turn++;
			}
			else{
				System.out.println("�¾ҽ��ϴ�");
				System.out.println("�ٽ��Ͻðڽ��ϱ�(y/n)");
				String str = sc.nextLine();
				if(str == "y") continueGame = 
			}
		}while(continueGame);
	}
}