package Damagochi_Game;
import java.util.*;
public class StudentTest {
	
	public static void main(String [] args) {
		Student st01= new Student();
		Scanner scan=new Scanner(System.in);
		int select;
		String exitselect="";
	
				
							
		st01.Start();
		
		st01.identify();
		
		st01.chadata();
		while(true) {
			System.out.println("\n 1. ����(study)     2. ���(play)     3.��Ա�(eat)"
					+ "\n\n       4.���డ��(bank)    5.�Ͻ�����(pause) OR ����\n ");
			System.out.print("  ���� : ");
			select=scan.nextInt();
			System.out.println("========================================================\n");
			if(select==1) {
				System.out.println(" 				\'����(study)\'(��)�� �����Ͽ����ϴ�.\n");
				if(st01.level==1) {
					System.out.println("    1. ���� �̸� �˱�     2. ���� ����      3. ���� �ܾ� ����   \n");
					System.out.print("  ���� : ");
					select=scan.nextInt();
					switch(select) {
					case 1:st01.childmath_study2(); break; 
					case 2:System.out.println("\n	1. ���� ����       2.���� ����\n");
							System.out.print("  ���� : ");
							select=scan.nextInt();
							switch(select) {
							case 1:st01.childmath_study1(); break;
							case 2:st01.math_study2();		break;
							} break;
					case 3:st01.vocabulary_study1();break;
					}
					
				}
				else{
					System.out.println("  1. �������        2. ���а���         3. ���� ����\n");
					System.out.print("  ���� : ");
					select=scan.nextInt();
					switch(select) {
					case 1:st01.lang_study3();break; 
					case 2:st01.math_study2(); break;
					case 3:st01.vocabulary_study1();break;
					}
				}
				st01.chadata();
			}
			
			else if(select==2) {
				System.out.println(" 				\'���(play)\'(��)�� �����Ͽ����ϴ�.\n");
				System.out.println("  1. �ֻ�������(dice)     2. ���� �ܾ� ���߱�          3. ����������");
				System.out.print("  ���� : ");
				select=scan.nextInt();
				switch(select) {
				case 1:st01.dice_play2();break; 
				case 2:st01.piece_play3(); break;
				case 3:st01.rockpapersc_play1();break;
				}
				st01.chadata();
			}
			else if(select==3) {
				System.out.println(" 			\'�� �Ա�(eat)\'(��)�� �����Ͽ����ϴ�.\n");
				st01.eat();
				st01.chadata();
			}
			else if(select==4) {
				System.out.println(" 			\'���� ����(bank)\'(��)�� �����Ͽ����ϴ�.\n");
				st01.bank();
				st01.chadata();
			}
			else if(select==5) {
				System.out.println(" \'�Ͻ�����(pause) OR ����(exit)\'(��)�� �����Ͽ����ϴ�.\n");
				System.out.println("  1. �Ͻ�����   2. ���� ");
				System.out.print("  ���� : ");
				select=scan.nextInt();
				if(select==1) {
					while(true) {
						System.out.println(" \'�Ͻ�����(pause)\'(��)�� �����Ͽ����ϴ�.\n");
						System.out.println("  �Ͻ�����  ����  1�� (YES) / 2�� ���� (NO) ");
						System.out.print("  ���� : ");
						select=scan.nextInt();
						if(select==1) {
							System.out.println(" \'�Ͻ�����(pause) ����\'(��)�� �����Ͽ����ϴ�.\n\n");
							break;
							
						}
						if(select==2) {
							System.out.println(" \'�Ͻ�����(pause) ����\'(��)�� �����Ͽ����ϴ�.\n\n");
							continue;
						}
					}
					st01.chadata();
					continue;
				}
			
				if(select==2) { 
					System.out.println(" \'����(EXIT)\'(��)�� �����Ͽ����ϴ�.\n\n");
					while(true) {
						System.out.print("�ٸ���ġ ���� �� �Է��� ��й�ȣ�� �Է����ּ���.\n �Է� :");
						st01.passcheck=scan.next();
						
						if(st01.pass.equals(st01.passcheck)) {
							System.out.println("\n��й�ȣ�� Ȯ�εǾ����ϴ�.");
							break;
						}
						else {
							System.out.println("				    ��й�ȣ�� ��ġ���� �ʽ��ϴ�. ");
							continue;
						}
					}
					System.out.println(" ������ �����ϸ� ������ �ٸ���ġ�� ������ ��� ������� �˴ϴ�.\n");
					System.out.println(" ����  EXIT(�빮��) // ��� �÷��� PLAY (��)�� �����ּ���.");
					System.out.print("  �Է� : ");
					exitselect=scan.next();
					if(exitselect.equals("EXIT")) {
						System.out.println(" �ٸ� ��ġ�� �̿����ּż� �����մϴ�..\n");
						break;
					}	
					else {
						System.out.println(" ��� �÷��� �մϴ�.\n");
						continue;
					}
				}
				
			}
			
		}	
	}										 
}
