package Damagochi_Game;
	import java.util.*;
	public class Student {
	
		Scanner scan= new Scanner(System.in);
		String pass, passcheck;   // ��й�ȣ ������ ���� ���� 
							      //- �����ų�� ������ �� ���ư� �׷��� ��й�ȣ�� �Է��� �߸� �����ϴ� ���� ���� ����
		
		String Dama_name="";      //  �̸�  ����
		
		String player="";         // �ٸ���ġ�� Ű��� �÷��̾��� �̸� ����
		
		int hungry = 50;          // ������  
		int hungrycnt=0;          // 0������ ��찡 3�� ����� �����Ű�� ���� ī��Ʈ ���� 
		int hungrymaxcnt=0;  //�������� 100�� �ʰ��ϴ� ��찡 ������ ��� �����Ű�� ���� ī��Ʈ ����
		
		int money = 5000;         //ó�� ������ 
		int bank = 500000;       // ���� �ܰ� 
		
		int happy = 50;           // �ູ��
		int happycnt=0;	          // �ູ���� 20 ���� ��찡 ��� �� ��� ī��Ʈ�ϴ� ���� 
		
		int exp=0;        		  // ����ġ
		
		int level=3;              // ����
		String levelSee[]= {" ( ��ġ���� )"," ( �ʵ��л� )"," ( ���л� )"," ( ����л� )"," ( ���л� )"};
					              // ������ ���� 5�ܰ�� �̸��� ����  ex)���� 1 ��ġ����, ����2 �ʵ��л�
		
		int onlyplaycnt=0;        //��⸦ ���޾Ƽ� �ϰԵǸ� ī��Ʈ�ϴ� ���� 
						
		int chaselect;     		  //���� �� ĳ���� ������ ���� ����   (1�� ����  , 2�� ���� ) 
		
	
	
	
		public void damaimg1() {	   /*      damaimg1, damaimg2 
									    * ĳ���͸� �����ϴ� �κа�, �ٸ���ġ�� �̸��� ���� �� 
									    * ĳ���͸� ���÷� �����ֱ� ���� ���
										*/ 
			System.out.println();
			System.out.println("      ����������󦡦�����");
			System.out.println("    ��   ��         ��  �� ");
			System.out.println(" ��  ��        ��       ��");
			System.out.println("    ������������������������������������");
			System.out.println("   	 ________                         1��(����)"); //1-1                  
			System.out.println(" 	�� ��        ��       �� ��");
			System.out.println("   	������������������");
			System.out.println("   	������������������");
			System.out.println("      	       ��   ��");
			System.out.println();
		}
		
		
		public void damaimg2() {
			System.out.println(); 
			System.out.println("       �����������򦡦���");
			System.out.println("     ��  ��         ��  �� ");
			System.out.println(" ��   ��       ��       ��");
			System.out.println("     ����������������������������������");
			System.out.println("   	 ________                         2��(����)"); //2-1
			System.out.println("	 ����    ��     ����");
			System.out.println("   	/�����\\ ");
			System.out.println("    	      ��   ��");		
			System.out.println();
		}
		
		public void damaimghead1_1() {      				// ��ǥ���� �޸� �ϱ� ���� �Ӹ�ī�� �κи� ǥ��
			System.out.println();           							
			System.out.println("     ����������󦡦�����");
		}
		public void damaimgbody1_1() {      // ������ ���� ��ü ��ȭ�� ǥ�� �� ������ ���� ���� ������ ǥ��
			int showcnt=0;  // �����͸� �������� ǥ�� ��Ű�� ���� ī��Ʈ ���� 
			
			System.out.print("    	________        "+"  �� ��  :");// ĳ������ �����ʿ� �����͸� ǥ���ϱ� ����
			
			while(happy/5!=showcnt) {							 				  
				System.out.print("��");							  //  �����͸� ���� ���� �������� ��Ÿ��	
				showcnt+=1;										
			}
			System.out.println(" "+happy+""); 					   // ������ �ڿ� ��Ȯ�� ��ġ�� ��Ÿ�� 
				showcnt=0;										   // ex) �ູ : ��������� 80
				
			System.out.print("                 �� ��        ��         �� ��"+" 	     ������ :");
			while(hungry/5!=showcnt) {
				System.out.print("��");
				showcnt+=1;
			}
			System.out.println(" "+hungry+""); 
				showcnt=0;
			System.out.print("   	������������������");
			System.out.println(" 	       ��     :" + money+"��" + "(�����ܰ� : " + bank+"��)") ;
			
			if(level>=3)System.out.println("   	��   ��   ��");        // ������ ���� ��ü ��ȭ ǥ��
			
			System.out.println("   	������������������");
			if(level>=2)System.out.println("          |   |");      // ������ ���� ��ü ��ȭ ǥ��
			if(level>=4)System.out.println("          |   |");      // ������ ���� ��ü ��ȭ ǥ��
			System.out.println("      	      ��      ��");	
		}
		
		
		public void damaimghead2_1() {		                  // ��ǥ���� �޸� �ϱ� ���� �Ӹ�ī�� �κи� ǥ�� 
			System.out.println();								
			System.out.println("     �����������򦡦���");  
		}
		
		public void damaimgbody2_1() {                     // ������ ���� ��ü ��ȭ�� ǥ�� �� ������ ���� ���� ������ ǥ��
			int showcnt=0;   // �����͸� �������� ǥ�� ��Ű�� ����  ���� 
			System.out.print("   	________         "+"  �� ��  :");// ĳ������ �����ʿ� �����͸� ǥ���ϱ� ����      
			while(hungry/5!=showcnt) {								
				System.out.print("��");								//  �����͸� ���� ���� �������� ��Ÿ��
				showcnt+=1;
			}
			System.out.println(" "+happy+""); 						// ������ �ڿ� ��Ȯ�� ��ġ�� ��Ÿ��   
			showcnt=0;												// ex) �ູ : ��������� 80
			System.out.print("	����    ��     ����      "+" 	     ������ :");
			while(hungry/5!=showcnt) {
				System.out.print("��");
				showcnt+=1;
			}
			System.out.println(" "+hungry+""); 
				showcnt=0;
			System.out.print("   	/�����\\");
			System.out.println(" 	       ��     :" + money+"��" + "(�����ܰ� : " + bank+"��)") ;
			if(level>=2) {System.out.println("       /������\\ ");} // ������ ���� ��ü ��ȭ ǥ��
			if(level>=3) {System.out.println("      /�������\\ ");}// ������ ���� ��ü ��ȭ ǥ��
			if(level>=4) {System.out.println("    	   | | ");}        // ������ ���� ��ü ��ȭ ǥ��
			System.out.println("    	       ��   ��");		
		}
		
		
		public void damafeel() {             //  ĳ���� ���� �������� ���� ǥ�� ��ȭ ǥ��
			int showcnt=0;						 // ĳ������ �����ʿ� �����͸� ǥ���ϱ� ���ؼ� �̸�Ƽ�� ���� ������ ����.
			if(happy>60 ) {					
				if(hungry>=90) {   //�ູ 60�ʰ� && ������ 90 �̻� ǥ��
					System.out.println("    ��   ��       ��   ��   " +" lv."+ level +""+levelSee[level-1]);
					System.out.println("    ��   )   ��   (   ��     " +" �̸�  : "+ Dama_name);
					System.out.print("    ����������������������������������     " +" EXP :");
					while(exp/5!=showcnt) {
						System.out.print("��");							//  �����͸� ���� ���� �������� ��Ÿ��
						showcnt+=1;
					}
					System.out.println(" "+exp+"");						// ������ �ڿ� ��Ȯ�� ��ġ�� ��Ÿ�� 
																		// ex) ����ġ : ��������� 80
				}
				else if(hungry>60 && hungry<90) {  //�ູ 60�ʰ�  && 60<������<90  ǥ��
									
					System.out.println("    ��   ��        ��  �� ��   " +" lv."+ level +""+levelSee[level-1]);
					System.out.println(" ��  ��       ��       ��     " +" �̸�  : "+ Dama_name);
					System.out.print("    ����������������������������������     " +" EXP :");
									
				    while(exp/5!=showcnt) {
						System.out.print("��");							//  �����͸� ���� ���� �������� ��Ÿ��						
						showcnt+=1;
					}
					System.out.println(" "+exp+"");						// ������ �ڿ� ��Ȯ�� ��ġ�� ��Ÿ��  
																		// ex) ����ġ : ��������� 80					
				}
				else if(hungry<30) {	   //�ູ 60�ʰ�  && ������ 30�̸�  ǥ��
					System.out.println("   ��  @       @    �� ;   " +" lv."+ level +""+levelSee[level-1]);
					System.out.println("   ��       ��             ��     " +" �̸�  : "+ Dama_name);
					System.out.print("   ����������������������������������     " +" EXP :");
					while(exp/5!=showcnt) {
						System.out.print("��");							//  �����͸� ���� ���� �������� ��Ÿ��							
						showcnt+=1;
					}
					System.out.println(" "+exp+"");						// ������ �ڿ� ��Ȯ�� ��ġ�� ��Ÿ��
																		// ex) ����ġ : ��������� 80	
				}
				else {				//�ູ 60�ʰ�  && 30<=������<=60   ǥ��
					System.out.println("    ��   ��        ��  �� ��   " +" lv."+ level +""+levelSee[level-1]);
					System.out.println("    ��       ��             ��     " +" �̸�  : "+ Dama_name);
					System.out.print("    ����������������������������������     " +" EXP :");
					while(exp/5!=showcnt) {
						System.out.print("��");							//  �����͸� ���� ���� �������� ��Ÿ��						
						showcnt+=1;
					}
					System.out.println(" "+exp+"");						// ������ �ڿ� ��Ȯ�� ��ġ�� ��Ÿ�� 
																		// ex) ����ġ : ��������� 80	
				}
			}	
			else if(happy>30){
				if(hungry>=90) {    //30<�ູ<=60 && ������ 90�̻� ǥ��
					System.out.println("    ��   ��       ��   ��   " +" lv."+ level +""+levelSee[level-1]);
					System.out.println("    ��   )   ��   (   ��     " +" �̸�  : "+ Dama_name);
					System.out.print("    ����������������������������������     " +" EXP :");
					while(exp/5!=showcnt) {
						System.out.print("��");							//  �����͸� ���� ���� �������� ��Ÿ��							
						showcnt+=1;
					}
					System.out.println(" "+exp+"");						// ������ �ڿ� ��Ȯ�� ��ġ�� ��Ÿ�� 
																		// ex) ����ġ : ��������� 80	
				}
				else if(hungry<30) {      //30<�ູ<=60 && ������ 30�̸� ǥ��
					System.out.println("    ��  @         @  �� ;   " +" lv."+ level +""+levelSee[level-1]);
					System.out.println("    ��       0       ��     " +" �̸�  : "+ Dama_name);
					System.out.print("    ����������������������������������     " +" EXP :");
					while(exp/5!=showcnt) {
						System.out.print("��");							//  �����͸� ���� ���� �������� ��Ÿ��						
						showcnt+=1;
					}
					System.out.println(" "+exp+"");						// ������ �ڿ� ��Ȯ�� ��ġ�� ��Ÿ�� 
																		// ex) ����ġ : ��������� 80	
				}
				else {			//30<�ູ<=60 && 30<=������<90 ǥ��
					System.out.println("    ��   ��        ��  �� ��   " +" lv."+ level +""+levelSee[level-1]);
					System.out.println("    ��       ��             ��     " +" �̸�  : "+ Dama_name);
					System.out.print("    ����������������������������������     " +" EXP :");
					while(exp/5!=showcnt) {
						System.out.print("��");							//  �����͸� ���� ���� �������� ��Ÿ��
						showcnt+=1;
					}
					System.out.println(" "+exp+"");						// ������ �ڿ� ��Ȯ�� ��ġ�� ��Ÿ�� 
																		// ex) ����ġ : ��������� 80	
				}
			}
			
			else if(happy<=30){  //  �ູ 30�����϶� ǥ��        �谡 ������ �谡 �θ��� ���� �� ����� ǥ��
					System.out.println("    ��   ��             ��     ��"    +" lv."+ level +""+levelSee[level-1]);
					System.out.println("    ��   u   -   u   ��     " +" �̸�  : "+ Dama_name);
					System.out.print("    ����������������������������������     " +" EXP :");
					while(exp/5!=showcnt) {
						System.out.print("��");							//  �����͸� ���� ���� �������� ��Ÿ��
						showcnt+=1;
					}
					System.out.println(" "+exp+"");						// ������ �ڿ� ��Ȯ�� ��ġ�� ��Ÿ�� 
																		// ex) ����ġ : ��������� 80	
			}
			
			
		}
		
		public void Start() {				// �ٸ���ġ�� ������ �� sleep�� ����Ͽ� �ε��κ��� ���� 
		
			System.out.println(" [java] 10��_������ �ٸ���ġ");
			System.out.println("                                                                      2017�л�ver ");
			System.out.println(" �츮 �ٸ���ġ �� ��Ź�帳�ϴ�");
			System.out.println(" �����ϰ� �� Ű���ּ���");
			System.out.println("=========================================================");
			System.out.println(" ");
			System.out.print("  �ٸ���ġ �ε��� ");
			for(int road=0;road<4;road++) {      // for�� �ȿ� sleep�� �־� ...�� 1�� �ð��� ���� �ξ� 4�� �ݺ����
				System.out.print(" .");
				 try {Thread.sleep(1000); } catch (InterruptedException e){ }; //thread.sleep���� 1���� ������ �־���. 1000 == 1�� 
			}
			System.out.print("\n\n				            �ٸ���ġ�� �����մϴ�."
								+"\n\n========================================================="
								+ "\n\n 			            �ٸ���ġ ��й�ȣ�� �������ּ���.\n\n ��й�ȣ �Է� : ");	
		
				pass=scan.next();  // pass(��й�ȣ)�� ���α׷���  ������ �� ��й�ȣ�� ������ �ϱ� ���� ���.
				
				while(true) {   // passcheck(��й�ȣ Ȯ��)�� ���� pass�� ��ġ�Ѵٸ� while���� �������´�.
					System.out.print("				    �ٽ� �ѹ� �Է����ּ���.\n\n ��й�ȣ Ȯ�� : ");
					passcheck=scan.next();
					if(pass.equals(passcheck)) break;
				else {
					System.out.println("				    ��й�ȣ�� ��ġ���� �ʽ��ϴ�. ");
					continue;
				}
			}
			System.out.println("\n=========================================================\n");
		}
		
		
		public void identify() {    // ĳ���͸� ���ð� �⺻���� ���������� ���� �޼���
		
			damaimg1();				//damaimg1 �޼���� �ٸ���ġ�� ĳ���� ǥ�� 
			damaimg2();				//damaimg2 �޼���� �ٸ���ġ�� ĳ���� ǥ�� 
			
			while(true) {
				System.out.print(" ĳ���� ���� : ");
				chaselect = scan.nextInt();   //chaselect�� ĳ���� ���� �Է� �� ���� 
				
				switch(chaselect){		//chaselect�� 1 or 2 �� ���� ���ð� ��ȯ
				case 1 : System.out.println("\n 1��(����) ĳ���͸� �����Ͽ����ϴ�."); damaimg1(); break;
				case 2 : System.out.println("\n 2��(����) ĳ���͸� �����Ͽ����ϴ�."); damaimg2(); break;
				default : System.out.print("�ٽ� �Է� �Ͻÿ�.");break;  
				}
				
				if(chaselect==1 || chaselect==2) break;  // chaselect 1 or 2  ���� �Է��Ͽ��� ��� while�� �������´�.
			
				else continue;    // chaselect 1,2 �� ���� ���� �Է��Ͽ��� ��� while�� ù��°�� �ö󰣴�.
					
			}
				
			
			System.out.print("\n�ٸ������� �̸� : ");
			Dama_name=scan.next();								//�ٸ���ġ�̸� �Է� 
			System.out.println();
			System.out.print(Dama_name+"�� ����(player)�� �̸� : ");
			player=scan.next();									// �ٸ���ġ�� Ű��� �����̸� �Է�
						
		}
				
		
		public void chadata() {		// (�Ա�, ��� , �����ϱ�)�ൿ�� ���� �ٸ���ġ�� ������ ǥ�� 
 		

			
 			if(happy>100)
 				happy=100;  // �ູ�� ��ġ �ִ� 100 ���� ����
 			else if(happy<0) 
				happy=0;	  //�ູ�� ��ġ �ּ� 0���� ����
			

 			
 			if(happy<20) {  // �ູ�� 20 �̸��� �ɶ����� happycnt++, �׸��� switch�� �Ͻø� �ִ� ������ �ְ� happycnt==4�� �Ǹ� 
 				happycnt+=1;// ���� ������Ų��.
 				switch(happycnt) {
					case 1 : System.out.println(" �����.. ��� �;�!"); break;
					case 2 : System.out.println("�����......"); hungry+=40; break;
					case 3 : System.out.println("................"); hungry+=40; break;
					default: System.out.println(Dama_name+"�� ����Ͽ����ϴ�..."); 
							System.out.println("  ,ad8888ba,         db         88           88  8888888");
							System.out.println(" d8'     ` 8b       d88b        888         888  88     ");
							System.out.println("d8'                d8'`8b       88`8       8'88  88     ");
							System.out.println("88                d8'  `8b      88 `8     8' 88  88aaaaa");
							System.out.println("88      88888    d8YaaaaY8b     88  `8   8'  88  88aaaaa");
							System.out.println("Y8,        88   d8''''''''8b    88   `8 8'   88  88     ");
							System.out.println(" Y8a.    .a88  d8'        `8b   88    `8'    88  88     ");
							System.out.println("  `'Y88888P'  d8'          `8b  88           88  8888888");
							System.out.println();
							System.out.println("  ,ad8888ba,  8b           d8  88888888888  88888888ba ");
							System.out.println(" d8''    ''8b `8b         d8'  88           88      '8b ");
							System.out.println("d8'        `8b `8b       d8'   88           88      ,8P	");
							System.out.println("88          88  `8b     d8'    88aaaaa      88aaaaaa8P'	");
							System.out.println("88          88   `8b   d8'     88'''''      88''''88'  	");
							System.out.println("Y8,        ,8P    `8b d8'      88           88    `8b  	");
							System.out.println(" Y8a.    .a8P      `888'       88           88     `8b 	");
							System.out.println("  `'Y8888Y''        `8'        88888888888  88      `8b	");
							System.exit(0); break; // ���ӿ����� System.exit();�� ��� ()�ȿ��� 0 �̿ܿ��� ����� �����ϳ�
												   // ���� 0�� ���� ����Ѵ�.
				}
 			}
 			if(hungry>100) // ������ ��ġ �ִ� 100���� ����
 				hungry=100;
 			if( hungry<=0) // ������ ��ġ �ּ� 0���� ����
				 hungry=0;
 			
 			switch(hungrymaxcnt) {  // �������� 100�� �ʰ��ϴ� ��츦 ī��Ʈ�Ͽ� Ƚ���� ���� ��� 3��°�� ���  
 				case 1 :System.out.println(" �谡 �ʹ� �θ���...");break;
 				case 2 :System.out.println(" ��ҷ� ������ ����..���� ���� ���԰ھ�....");break;
 				case 3: System.out.println(Dama_name+"�� ����Ͽ����ϴ�..."); 
				System.out.println("  ,ad8888ba,         db         88           88  8888888");
				System.out.println(" d8'     ` 8b       d88b        888         888  88     ");
				System.out.println("d8'                d8'`8b       88`8       8'88  88     ");
				System.out.println("88                d8'  `8b      88 `8     8' 88  88aaaaa");
				System.out.println("88      88888    d8YaaaaY8b     88  `8   8'  88  88aaaaa");
				System.out.println("Y8,        88   d8''''''''8b    88   `8 8'   88  88     ");
				System.out.println(" Y8a.    .a88  d8'        `8b   88    `8'    88  88     ");
				System.out.println("  `'Y88888P'  d8'          `8b  88           88  8888888");
				System.out.println();
				System.out.println("  ,ad8888ba,  8b           d8  88888888888  88888888ba ");
				System.out.println(" d8''    ''8b `8b         d8'  88           88      '8b ");
				System.out.println("d8'        `8b `8b       d8'   88           88      ,8P	");
				System.out.println("88          88  `8b     d8'    88aaaaa      88aaaaaa8P'	");
				System.out.println("88          88   `8b   d8'     88'''''      88''''88'  	");
				System.out.println("Y8,        ,8P    `8b d8'      88           88    `8b  	");
				System.out.println(" Y8a.    .a8P      `888'       88           88     `8b 	");
				System.out.println("  `'Y8888Y''        `8'        88888888888  88      `8b	");
				System.exit(0); break; // ���ӿ����� System.exit();�� ��� ()�ȿ��� 0 �̿ܿ��� ����� �����ϳ�
									   // ���� 0�� ���� ����Ѵ�
 			}
 			
 			
 			if(hungry<20) {		// ����� 20�̸� 
 				happy=(20-hungry)/2;   //(20-������)/2 ��ġ��ŭ �ູ�� (-) ��Ų��.
 				if(hungry<=0) {
 					hungrycnt++;     // �������� 0�� ��찡 ���涧 ���� hungrycnt�� ī��Ʈ�Ѵ�. (���� ����)
 					switch(hungrycnt) {  //switch�� 0�� �ɶ����� ǥ���Ѵ�.
 					case 1 : System.out.println(" ��Ӵϰ� ���� �԰� �ٴϷ��µ�... ");
 							System.out.println(Dama_name+"�� �ʹ� �谡 ���� �������� �߽��ϴ�. \n ��  -5000��/"
 									+ "  ������ +25 /  ��� (1ȸ)");
 							money-=5000;
 							hungry+=25;break;
 					case 2 : System.out.println(" ��Ӵϰ� ���ö��� �̴ּ�. �̹��� �������̾�..��  \n" + 
 							"  ������ +25 /  ��� (2ȸ) %������% ");
 							hungry+=40; break;
 					default : 
 					System.out.println(Dama_name+"�� ����Ͽ����ϴ�..."); 	
 					System.out.println("  ,ad8888ba,         db         88           88  8888888");
 					System.out.println(" d8'     ` 8b       d88b        888         888  88     ");
 					System.out.println("d8'                d8'`8b       88`8       8'88  88     ");
 					System.out.println("88                d8'  `8b      88 `8     8' 88  88aaaaa");
 					System.out.println("88      88888    d8YaaaaY8b     88  `8   8'  88  88aaaaa");
 					System.out.println("Y8,        88   d8''''''''8b    88   `8 8'   88  88     ");
 					System.out.println(" Y8a.    .a88  d8'        `8b   88    `8'    88  88     ");
 					System.out.println("  `'Y88888P'  d8'          `8b  88           88  8888888");
 					System.out.println();
 					System.out.println("  ,ad8888ba,  8b           d8  88888888888  88888888ba ");
 					System.out.println(" d8''    ''8b `8b         d8'  88           88      '8b ");
 					System.out.println("d8'        `8b `8b       d8'   88           88      ,8P	");
 					System.out.println("88          88  `8b     d8'    88aaaaa      88aaaaaa8P'	");
 					System.out.println("88          88   `8b   d8'     88'''''      88''''88'  	");
 					System.out.println("Y8,        ,8P    `8b d8'      88           88    `8b  	");
 					System.out.println(" Y8a.    .a8P      `888'       88           88     `8b 	");
 					System.out.println("  `'Y8888Y''        `8'        88888888888  88      `8b	");	
 					System.exit(0); break;  // ���ӿ����� System.exit(0);�� ���
 					
 					}
 				}	
 			}
 			if( exp>=100) { 	// ����ġ ��ġ �ִ� 100���� ����
 				level+=1;	 		// ����ġ �ִ�ġ ���� �� ���� ����
 				bank += 30;
				exp=0;				// ���� ���� �� ����ġ �ʱ�ȭ
 			}
 			else if( exp<0) exp=0; //����ġ�� ������ ��� �ּҸ� 0���� 
 						
 			switch(chaselect){ 	// chaselect�� �ʱ� ĳ���� ���ý� 1�� ���� , 2�� ���� ������ ����
 													// switch�� ĳ���Ϳ� ��ȭ�� ��ġ ��� 
			case 1 :  damaimghead1_1();damafeel();damaimgbody1_1(); break;			
			case 2 :  damaimghead2_1();damafeel();damaimgbody2_1(); break;		

 			}
			
		}
		
		public void vocabulary_study1() { 	//���� �ܾ� ���߱� ���� ������ ���� ���̵� ���� 
			hungrymaxcnt=0; 								//��Ա� �̿��� �ൿ�� �ϸ� hungrymaxcnt �ʱ�ȭ
			String word[][]=									//������ ���� ���� ���̵��� �����Ͽ���. 
		//word[0]~word[9] ���� 1  //word[10]~word[19] ���� 2  // word[20]~word[29] ���� 3  // word[30]~word[39] ���� 4
		/*���� 1 ����*/	{{"���","play"},{"�ڴ�","sleep"},{"����","pencle"},         
						{"å","book"},{"����","picture"},{"����","snack"},
						{"(����)��","horse"},{"�߱�","baseball"},{"�ǾƳ�","piano"},{"����","number"},
		
						
		/*���� 2 ����*/	{"�����ϴ�","begin"},{"��ȥ�ϴ�","merry"},{"����Ʈ","apartment"},
		{"������","famous"},{"�ݺ��ϴ�","repeat"},{"~�� ���Ͽ�","through"},
		{"����ϴ�","remember"},{"��û��","stupid"},{"ä��","vegetable"},{"��������","throw"},
		
		
		/*���� 3 ����*/ 	{"ȯ��","environment"}, {"���̵���","amusementpark"},
		{"����","suggestion"},{"��ȸ","opportunity"},{"��Ư��, �δ�����","distinctive"},
		{"�ո�����","reasonable"},{"����","accomplishment"},{"����Ȯ��","inaccurate"},{"������","leadership"},
		{"����","transportation"},
		
		
		/*���� 4 ���� */	{"�����ϴ�","withdraw"},{"�޷�","paycheck"},{"������","complimentary"},
		{"ȥ����, ����������","clueless"},{"����","conjunction"},{"�ÿ�ȸ","demonstration"},
		{"�ӽ���","tentative"},{"�ŷڼ�","credibility"},{"��ȸ","conference"},{"����","regulation"}};
			
			char hint[]=new char[20];  	// ����ܾ� ��Ʈ �ֱ� ���� ���� �ܾ �� ö�ڽ� hint�迭�� ����.	
			int  hintran[]=new int[20]; 	// hintran[]�� �ش翵��ܾ��� ���̸� �ִ���� hint random.
			int random=0; 							// random�� exam[]�� �������� ���� �������� ����
			int	wcnt=0;								// wcnt�� answer�� ���ĺ�[word]�� �ϳ������� �� ���
			int x=0;											// x�� Ʋ�������� ī��Ʈ�ϴ� ���� 
			int hcnt=0;									// hint[]�� ���ĺ� ������ ���� ����
			int hintselect;								// hintselect ��Ʈ�� �߰��� �� ������ �����ϴ� ����
			int hintrandom=0; 					// hintrandom ��Ʈ�� ���� ������ ������ ���� ��� 
			int examcnt=0;							// examcnt ���� 3�� ����Ҷ� ���
			int score=0;									// scroe�� ���� ����
			int exam[] =new int[3] ;  		//exam[]�� ���� ��ȣ 3�� �����Ͽ� ����
			int	 judgecnt=0;  						// ������ Ʋ�ȴ��� Ȯ���ϱ� ���� ī��Ʈ�ϴ� ���� 
			String dap="", answer="";  	// dap�� ���� �Է�  , answer�� ������ �־�δ� ���� 
			boolean judge=true;  				// judgecnt�� �Բ� ���̴� ���� 
			System.out.println("\n========================================================\n");
			System.out.println("	    (vocabulary) ���ܾ� ���� \n ");
			System.out.println(" 	        -3���� ����- ");
			System.out.println("\n========================================================\n\n");
			
		
		while(true) {
			
			exam[examcnt]=(int)(Math.random()*(10)+((level-1)*10));     // ���� 1: 0~9  /  ���� 2 :10~19 /  ����3:20~29 / ����4: 30~39�߿��� ������ ���
			
			judgecnt=0;   // ������ ��µ� �� ���� 0���� ������ش�.
			while(examcnt>judgecnt) {	// ������ 3�� �����ϴµ� �������� �ߺ��� �ִ��� ������ Ȯ�� 
				
				if(exam[examcnt]==exam[judgecnt]) {
					judge=false;  // �������� �ߺ��� �ȴٸ� false �Է� 
				}
				judgecnt++;
			}
			
			if(judge==false) {  				//judge�� false�� �Էµ��ִٸ� judge=true�� �Է�, while�� ó������ �ٽ� �ö󰣴�.
				judge=true;     
				continue;
			}
				examcnt++; 						// Ʋ�� ���� ���ٸ� ���� ī��Ʈ�� �÷��ش�.
				
			if(examcnt==3) break; 	 	// �ߺ����� ���� ������ 3�� ����ϰ��� while�� �������´�.
		}
		
			examcnt=0;  							// ������ ù��°���� �ٽ� ��� �ϱ� ������ examcnt�� �ٽ� 0���� ������ش�.
		while(examcnt<3) {				 	//3���� ����Ŀ� while�� ��������
			System.out.println("\n========================================================");
			System.out.println(" "+(examcnt+1)+" �� ����  ===============================================");
			System.out.println("========================================================\n");					
			random=exam[examcnt]; 						// random������ �������� ������ ������ȣ�� ���� exam[examcnt]�� �־��ش�.
			answer=word[random][1];				 	// answer�������� ������ �Է��Ѵ�.
			hcnt=0; 														// hint[]�� ���ĺ� ������ ���� ����
			
			while(hcnt<answer.length()) {   		// hint[]�迭�� ������ ���ĺ��� �ϳ��� ������� �Է��Ѵ�. - ���߿� ��Ʈ�� �ٶ� ���
				hint[hcnt]=answer.charAt(hcnt);  	// chaAt(); �� ���ĺ��� �ϳ��� �̱����� ��� (0)�� ���� ù��° ���ĺ� ~
				hcnt++;
			}
			
			while(true) {    
				
				System.out.println(word[random][0]+" ���� ����ܾ�� ??\n");
				wcnt=0;  													// wcnt������ answer�� ����(word)�� �ϳ��� ���ĺ��̳� '_'�� ǥ���ϱ� ���� ���
				 while(wcnt<answer.length() ) {	// while�� ���� ���̸�ŭ �ݺ�
					 										
					 if(wcnt<x) {			// x(Ʋ�� Ƚ��) - 1�� Ʋ���� ������ ù��° ���ĺ����� �����ְ� 2�� Ʋ���� �ι�° ���ĺ����� �����ش�...
						System.out.print(" "+answer.charAt(wcnt)+" "); 
					 }
					 
					 else {					// ������ �κ��� _�� ǥ���ȴ�.
					 System.out.print(" _ ");
					 }
					
					wcnt+=1;
				 }	 
				 System.out.println(" " + answer.length()+"����\n"); // ���ĺ��� ��ü ��������� ǥ������
				 System.out.print(" �� :  ");
				 dap=(scan.next());				//�� �Է� 
				
				
				 
				 if(dap.equals(answer)) {				// ������ ��� ǥ��   String String �񱳴� .equals()�� ��� 
					 System.out.println("	 		���� : [ "+answer+" ]");
					 System.out.println("				�����Դϴ�.!");
					 score++;											//���Ḹŭ ���� ����
					 break;
				 }
				 	 
				 
				 else {
					 System.out.println(" 				      Ʋ�Ƚ��ϴ�.\n\n========================================================\n");
					
					 x+=1;  // Ʋ���� ��� x++; 
					 
					 if(x==level+2) { // ������ ���� �ܾ��� ���� ���̰� �־� ������ ���������� �˹ٺ� ��Ʈ�� �ִ� Ƚ���� ���� ����.
						
						 	System.out.print( " 1.���ĺ� ���� ��Ʈ ���   2.���� �� ��       ���� : 	" ); 
						 	hintselect=scan.nextInt();
						 	
						 	
						 	if(hintselect==1) {  // ���� ��Ʈ ���
						 		System.out.println("\n\n  		       ���ĺ� ���� ��Ʈ�� �����Ͽ����ϴ�.\n\n");  //
						 		System.out.println(word[random][0]+" ���� �ܾ�� ??\n");  // ������ �ٽ� ������ 
						 		
						 		hcnt=0;
						 		while(hcnt<answer.length()){  	// ������ ��Ʈ�� ���ĺ���Ʈ�� ������ �κ� ������ �����ְ���
						 			if(hcnt<x-1) { 								//x-1�� �� ������ �������� Ʋ�� �Ŀ� x�� �ѹ��� (+)�� ���� �׷���(-)�־� ��Ʈ�� ����κ��� �����ϰ� ���� 		
						 				System.out.print(" "+answer.charAt(hcnt)+" ");
						 			}
						 			else {
						 				System.out.print(" _ ");
						 			}		
						 			hcnt++;
						 		}
						 		System.out.println("\n");
						 		System.out.println(" 	    -��Ʈ :  �Ʒ��� ���ĺ��� ��� ���� �Է��Ͻÿ�. \n");
						 		
						 		hcnt=0;   
						 		while(true) {
						 			
						 			hintrandom=(int)(Math.random()*(answer.length()-(level+1))+(level+1)); // hintrandom�� ��Ʈ���� �����κ����� ���� ����.
						 		
						 			hintran[hcnt]=hintrandom;  //hintran[]�� �������� ���� ���ڸ� ���� 
						 			
						 			int cnt=0;  
						 			
						 			while(cnt<hcnt ) {  					// �ߺ��Ǵ� �������� ������ �˻��Ѵ�.
						 				if(hintran[hcnt]==hintran[cnt]) {
						 					judge=false;
						 				}
						 				cnt++;
						 			}
						 			
						 			
						 			if(judge==false) {
						 				judge=true;
						 				continue;
						 			}
						 			
						 			hcnt++;
						 			System.out.print( " "+hint[hintrandom]+ " /");
						 		
						 			if((hcnt+level+1)==answer.length()){	// ��Ʈ�� Ʋ�������� ���ĺ��� �ϳ��� �����ϴ� �κ��� �ִ���Ʈ�� (level+1) 
						 																						// �� ���� ���ĺ� ������Ʈ������  �����Ǵ� ��Ʈ ����  hcnt 
						 																						// �� �κ��� ���� ������ ���̿� ������ break�� �������´�. 
						 				break;
						 			}
						 					
						 		}
						 		
						 		System.out.print("\n\n �� : ");
						 		dap=scan.next();					// �� �Է� 
						 		 System.out.println("	 		���� : [ "+word[random][1]+" ]");
						 		 if(dap.equals(answer)) {   // ������ ���  ���
						 			 
									 
									 System.out.println("				�����Դϴ�.!");
									 score++;
									 break;
						 		 }
						 		 
						 		 else {										 //������ �ƴ� ����  ���
							 		System.out.println(" 			     �ƽ��׿�� Ʋ�Ƚ��ϴ�.  ");
							 		break;
							 	}
						 		 
						 	} 
						 	
						 	if(hintselect==2) { 			 // 1�� ���ĺ� ���� ��Ʈ�� ������� �ʾ��� ���  ��� 
						 		System.out.println("\n\n  		  	  ���亸�⸦ �����Ͽ����ϴ�.\n");
						 		System.out.println("	 		���� : [ "+word[random][1]+" ]");
						 		System.out.println("");
						 		System.out.println("===========================================================\n");
						 		break;
						 	}
								
						 } 	 
					 }				 
				 }
				 wcnt=0; x=0; hcnt=0; 
				
				examcnt++;						//���� ī��Ʈ �÷���
			} 												//while�� ��������
			
			System.out.println("===========================================================\n");
			System.out.println("		 	  ���� ���� : " +score);
			if(score==2  || score==3) {
				System.out.println("						�� ���߽��ϴ�~!!");
			}
			System.out.println("\n===========================================================\n");
			System.out.println();
			System.out.println("===========================================================");
			System.out.println("                  	���� ��!!   ");
			System.out.println("===========================================================\n");
			
			
			//��ġ ��ȭ�� ���� ����
			happy-=3;
			System.out.print("\n �ູ -3 / ");
	
			hungry-=5;
			System.out.print(" ������ -5 / ");
			
			exp+=10+score;
			System.out.print(" ����ġ  +10 + ���ʽ�(+"+score+")\n\n"); // ���� ������ ���� ���ʽ� ���� �߰� 
						
		}
	
			
		
		public void piece_play3(){			// ���� �ܾ� ���߱� ���� 
			hungrymaxcnt=0;
			Scanner scan= new Scanner(System.in);  
			
			String squareMenu[] = {"���","��","�ڵ�","������","����","���ξ���","��纣��","���"};  // �ܾ �־���� �迭 
			
			int randomNum[]= new int[16];  														// 1~16���� �������� ���ڸ� ���� �迭 
			String squareBox[] = new String[16];  												// �������� �ܾ ���� �迭 - play�Ҷ� ó���� �������� �迭�̴�. 
			
			String squareBlind[] = {" ( 1 ) "," ( 2 ) "," ( 3 ) "," ( 4 ) ",				// ������ Ǯ�� �������� �迭 
									" ( 5 ) "," ( 6 ) "," ( 7 ) "," ( 8 ) ",										// ���⶧���� �� �ڸ��� �ܾ�� �ٽ� ä������ .
									" ( 9 ) "," ( 10) "," ( 11) "," ( 12) ",
									" ( 13) "," ( 14) "," ( 15) "," ( 16) "};
			int boxCnt=0;	         			//  �ڽ��� ���õǾ� ���� �� 
			int menuCnt=0; 				//  �迭�� menu�� ���� �� ���
			int judgeCnt=0;		  			//  �ߺ��Ǵ� ���� �ִ��� �Ǵ��Ҷ� ���Ǵ� ī��Ʈ ���� 
			int menuleng=0;			  	//  �迭�� �����Ͽ� ��Ÿ�� �� ĭ�� ���߱� ����
			boolean judge=true;      //  �ߺ��Ǵ� ���� �ִ��� �Ǵ��Ҷ� ���
			int dap1,dap2;					//  dap1 , dap2 �� �� ���� ����
			int select;								// select ������ �� ���
			int hint;								// hint�� ���
			int hintcnt=5;						// hintcnt�� ��Ʈ ���� Ƚ��
			int score=0;							// score�� ����
			int endcnt=20; 					// ���� �� �Է� ���� Ƚ�� 
			String pause="";  				// ������ ������ ������ �غ� �Ǿ����� Ȯ���ϱ� ���� ����
			String dapfruit="";			// ���Է� 
			
			
			
			System.out.println("========================================================\n");
			System.out.println("	    	( brain ) �γ� �ߴ�  \n ");
			System.out.println(" 	    	  - ���� �ܾ� ã�� - "
					+ "\n		-��Ʈ: �� (5ȸ), ���� ���� �Է±�ȸ�� �پ���.   ");
			System.out.println("\n========================================================\n");

			System.out.println("\n========================================================");
			System.out.println(" "+(int)(40/level)+ " �� �� ī�� ������ ======================================="); // ������ ���� ������ �� �� �ִ� �ð��� ª��.
			System.out.println("========================================================\n\n");
			
			
			
			while(true){		// ���� ���ڸ� 16�� ������ randomNum[]�� ���� �ִ´�.
				
				randomNum[boxCnt]=(int)(Math.random()*squareBox.length); // �迭�� ���� ��ŭ ������ �̴´�.
				judgeCnt=0;		// �ߺ��� Ȯ���ϱ� ���� ����ϴ� ī��Ʈ 
				
				
				while(judgeCnt<boxCnt) { // �ݺ��� �ߺ��� ���´ٸ� judge=false�Ѵ�.
			
					if(randomNum[judgeCnt]==randomNum[boxCnt]) 	judge=false; 	
						
					judgeCnt+=1;
				}
					
				if(judge==false) {  // judge=false��� true�� �ٽ� �Է� �� while�� ó������ �ö󰣴�.
					judge=true;
					continue;
				}
				
				squareBox[randomNum[boxCnt]] = squareMenu[menuCnt] ; // ������ �迭�� �ߺ��� ���� ���  squermenu[]�� �޴����� ������� �Է����ش�.
																	 // menucnt�� 0���� �����Ͽ� menu���� ���, �� , �ڵ� .. ������� �Է½�Ų��.
				boxCnt+=1;
				if(boxCnt==16) break; // �� �Է� �Ǹ� break�� �������´�.
				if(boxCnt%2==0 && boxCnt>0) {menuCnt+=1; }  // �ΰ��� �Է��ϰ� menucnt++�Ͽ� ���� �޴��� �Է��Ѵ�.
				
				
			}
			
			
			boxCnt=0;
			
			while(boxCnt<=15) {  						//  ���ȭ�鳻�� ��Ÿ���� ����� �����ϰ� �ϱ� ����
				menuleng=(int)(squareBox[boxCnt].length());     
				System.out.print(" ||   "+squareBox[boxCnt]+"  " );   // �ܾ��� ���̰� ���� ����� 4�����̹Ƿ� 4���ڸ� �������� 
				
				if(menuleng<4) {								      //����� �����ϰ� ��Ҵ�.
					
					while(true) {
						System.out.print("   ");
						
						menuleng+=1;
						
						if(menuleng==4) break;			// ����� ��� ���� �ܾ�� �Ѿ𰣴� .
					}
					
				}		
				
				boxCnt+=1;
				if(boxCnt%4==0) {					// �ܾ 4���� �ϰ� ����  \n\n\n���� ���� ����ش�.
					System.out.println(" || \n\n\n");
				}
			}
			System.out.println((20/level)+" �� �Ŀ� ī�带 �޸����� �������ϴ�. �� ���� �ܾ Ȯ�����ּ���.\n"); // ������ ���� ���� �ð� �� �ٸ��� �Ͽ���
			
			for(int examtime=20/level;examtime>0; examtime--) {	   // ������ �ϱ��� �� �ִ� �ð� ǥ��        
				System.out.print(" "+(examtime-1));  
				try {Thread.sleep(1000); } catch (InterruptedException e){ }; //thread.sleep���� 1���� ������ �־���. 1000 == 1�� 
				if(examtime%21==0) { System.out.println(); } // ���ٷ� ��� �����Ǵ� ���� ���� ���Ͽ� ���.
			}
										
			
			System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"		// for����  �����ϰ� ���� ���� 
						+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n " 
						+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n "
						+ "\n  �����ϰڽ��ϱ�??\n"
						+ "  �����ϰ����Ѵٸ�   \'�ƹ� ����\'�� ģ ��  enterŰ�� �����ּ���.\n  �Է� : ");
			pause = scan.next(); //������ ������ ������ �غ� �Ǿ����� Ȯ���ϱ� ���� ���		
			
			while(true) { 	   		// Sqareblind[] �������  ������ش� .
				
				boxCnt=0;
				System.out.println(
						"========================================================\n"
						+ "���� �ܾ���\'��ȣ\'�� \'����\'�� �����ÿ� ==============================\n"
						+"========================================================\n\n"
						+ "ex) ��ȣ �Է�1 : ����    |  " 
						+ "��ȣ �Է� 2 : ����   |  "
						+ "���� �̸�  : ����   \n\n");
				while(boxCnt<=15) {						  // 1�� ����ε� �ڽ����� ������� ��� 
					
					System.out.print(" ||  ");						
					menuleng=(squareBlind[boxCnt]).length();
					
					if(menuleng<=3) {						// �ܾ� ���� ���̰� �ٸ��� �����Ͽ��� �ݺ��� ����� ���̸� �����ϰ� ����� Ʋ ����� �ݵ��ϰ� �������� �ߴ�.
												
						while(true) {						
							System.out.print(" ");			
							menuleng+=1;					
							if(menuleng==4) break;			
						}
					}	
					
					System.out.print(squareBlind[boxCnt]);
					
					menuleng=(squareBlind[boxCnt]).length();
					if(menuleng<=3) {
						
						while(true) {
							System.out.print(" ");
							menuleng+=1;
							if(menuleng==4) break;
						}
					}		
					
					boxCnt+=1;
					if(boxCnt%4==0) {
						System.out.println("  || \n\n\n");
					}
				}
				System.out.println("========================================================");
				System.out.println("  1��. ���� �Է��ϱ�   / 2��. ��Ʈ ��� ("+hintcnt+"ȸ ) / 3��. �׸��ϱ� \n");	// ���� �Է� ��� 
				System.out.print(" ����  : ");
				select=scan.nextInt();
				System.out.println();
				
				
				
				if(select==1) {					// ���� �Է� �κ� 
					System.out.println(" \'1��. ���� �Է��ϱ�\'�� �����Ͽ����ϴ�.\n");
					System.out.print(" ��ȣ �Է�1 : ");
					dap1=scan.nextInt();
					System.out.println();
					System.out.print(" ��ȣ �Է�2 : ");
					dap2=scan.nextInt();
					System.out.println();
					System.out.print(" ���� �̸�    : ");
					dapfruit=scan.next();
					System.out.println();	
					endcnt--;
					
					if(squareBox[dap1-1].equals(squareBox[dap2-1]) &&		// ����� ���Է°� ���� �� Ȯ�� �Ͽ� ������ ��� ��� 
					    squareBox[dap1-1].equals(dapfruit))   {
						score++;										
						squareBlind[dap1-1]=dapfruit;
						squareBlind[dap2-1]=dapfruit;
						System.out.println("					�����Դϴ�.!!!");
						System.out.println("	 				���� : [ "+ squareBox[dap1-1]+" ]");
						System.out.println("					���� ���� : " +score+" ��");
						System.out.println("				         ���� Ƚ��    : " + endcnt+" ȸ");
					}
					else {													// ������ �ƴ� ��� ��� 
						System.out.println("				          ��!.. Ʋ�Ƚ��ϴ�..!");
						System.out.println("					���� ���� : " +score+" ��");
						System.out.println("				          ���� Ƚ��    : " + endcnt+" ȸ");
					}
				
				}
				else if(select==2) {			// ��Ʈ��� �κ� 
					endcnt--;
					System.out.println(" \'2��. ��Ʈ ���\'�� �����Ͽ����ϴ�.\n");
					if(hintcnt>0) {
						System.out.print(" �˰� ���� ��ȣ�� �Է�  : ");	
						hint=scan.nextInt();
						System.out.println(
											"				       "
											+hint+"�� �ܾ��  ["+squareBox[hint-1]+"]");
						hintcnt--;
						System.out.println("				               ���� ��Ʈ    : " + hintcnt+" ȸ");		// ��Ʈ ���ÿ��� ���� Ƚ���� ���� �پ���.
						System.out.println("				               ���� Ƚ��    : " + endcnt+" ȸ");
						
					}
					else System.out.println("��Ʈ�� �� ����Ͽ����ϴ�. ");
				}
				
				if( endcnt==0 || score==8 || select==3 ) {
					System.out.println("					�� ���� ���� : " +score+" ��");
					if(score>=7) {	
						System.out.println("���� ���߽��ϴ�!~~");	
					}
					System.out.println("				               ���� Ƚ��    : " + endcnt+" ȸ");
					System.out.println("				               ���� ��Ʈ    : " + hintcnt+" ȸ");
					System.out.println("\n");
				   
					break;
				}
				
			}	
			System.out.println("========================================================");
			System.out.println("                  	���� ��!!   ");
			System.out.println("========================================================\n");
			onlyplaycnt++;
			
			happy+=5;
			System.out.print("\n  �ູ +5 / ");			// ��ȭ ���� ǥ��
			
			 hungry-=5;
			 System.out.print(" ������ -5 / ");			// ��ȭ ���� ǥ��
			
			
			if(onlyplaycnt<3) {
				exp+=10;
			System.out.print(" ����ġ  +10 \n\n");			// ��ȭ ���� ǥ��
			}
			
			else if( onlyplaycnt>=3) {
				exp-=10;	
				System.out.println("��⸸ �ؼ� ����ġ�� ���������ϴ�.-10");
				System.out.println(" "+Dama_name+" : ���� ������ϱ� ���� �����ؾ���..! ");
			}/*������ 3�������ϸ� ����ġ ��ġ ���� */
		
	}
	
		
		
		
		
		
		
		
		
		
		public void math_study2() {  /*������ ����  ������ ���� ���̵� �ø��� */
			hungrymaxcnt=0;
			int randNumber1, randNumber2, input, answer,select,moncnt=0, score=0;
			
			int randNumber; 				// ���� ��ȯ �� ���ڸ�  �������� �̴� ���� 
			String changeanswer="";			// ���� ��ȯ    ������ ����  ����
			String changedap="";			// ���� ��ȯ    ���� ���� ���� 
			String change[]=new String[8];
			int changecnt=7,changesel=0; 
			int length=0;
			
			System.out.println("========================================================\n");
			System.out.println("	    	( Math ) ���� ���� ����  \n ");
			System.out.println("    		 - ������(Ȱ��) ,  ���� ��ȯ  - \n\n"
							 + "		      - 5����  - ");
			System.out.println("\n========================================================\n\n");
			 
				System.out.println("            1��.  ������(Ȱ��)    ");
				if(level>=2) {System.out.print("/  2��.  ���� ��ȯ  \n");}	
				
		while(true) {				
			System.out.print("    ���� : ");
			select=scan.nextInt();				// ������ ���� or ������ȣ�� ���� ������
			switch(select) {
			
			case 1: 							// ������ ���� 
					System.out.println("========================================================");
					System.out.println("\n   	    LV."+level+"        ���̵�   :  "+(1)
										+"  ��    ~  "+((level*5)-1)+"   ��\n");						//������ ����  ���̵� ���� 
					System.out.println("========================================================");
					while (true) {
						
						randNumber1 = (int)(Math.random()*((level*5)-1))+1;						//������ ����  ���̵� ���� 
						randNumber2 = (int)(Math.random()*9)+1;
		
						System.out.println("\n  		 "+randNumber1 + "  x  " + randNumber2 + "  = ?? ");
						System.out.print(" �� : ");
						input = scan.nextInt();				
						answer = randNumber1 * randNumber2;
		
						if (input == answer) {
							System.out.println("					�����Դϴ�");
							System.out.println("					���� : ["+answer+"]");
							score++;															// ������ ��� score++
						} 
						else {
							System.out.println("					Ʋ�Ƚ��ϴ�");
							System.out.println("					���� : ["+answer+"]");	
						}
						System.out.println("\n========================================================");
						moncnt++;				
						if(moncnt==5) {															// 5���� ��½� break
							break;
						}
					}
					break;
				
				
			case 2 :
					System.out.println("========================================================");
					System.out.println("\n 					���� ��ȯ \n");
					System.out.println("========================================================");
					while(true) {
						
						changecnt=7;					// ������ ��ȯ�ϱ� ���� ���Ǵ� ī��Ʈ (7���� 0���� �ִ� 8ĭ�� ����Ͽ�  ��ȯ�� �������ڸ�  ǥ���ϱ� ����  7�� ���� ) 
						changedap="";					// ���� ��ȯ�� �� �Է� ���� 
						changeanswer="";				// ������ ���� ���� 
						
						randNumber=(int)(Math.random()*(16*(level+1)));							// �������� ���� 10������ ����
						System.out.println();
						System.out.println( " 		       ����  : "+randNumber);
						System.out.println("\n					 ��ȯ�� ������ ����");					// ���� ��ȯ ���� 
						System.out.println("  1��  (2���� )  /  2��  (8���� )   / 3��  (16����)   \n");	// ����
						System.out.print("   ����: ");
						changesel=scan.nextInt();
						
						
						switch(changesel) {
						case 1: changesel=2; length=0; ;break;		//  1�� 2����     length�� �������� ��ȯ�� �� ���ڸ��� ��Ÿ���� �����ϱ� ���� ���� 
																	//	ex ) length=0�̸� (0~ 7���� 8�ڸ�)  �� �� �� �� �� �� �� ��  
						
						case 2: changesel=8; length=5; ;break;		//	2�� 8����   
																	//	ex ) length=5�̸� (5~ 7���� 3�ڸ�)  �� �� ��    
						
						case 3: changesel=16; length=6; ;break;		//	3�� 16����\
																	//	ex ) length=5�̸� (6~ 7���� 2�ڸ�)  �� ��
						}
						System.out.print("\n\n    "+ changesel+" ����    :   ");
						
						while(changecnt>=length) {					// ���� case�� ���� length�� �������� �ݺ�Ƚ�� ���� 
						
							if((int)(randNumber/changesel)>=0) {
								
								switch((int)(randNumber%changesel)) {				// 16������ ���� ��ȯ�� ���� ��� ���� 15 =F 14=E ��...
								case 15:change[changecnt]="F" ; break;
								case 14:change[changecnt]="E" ; break;
								case 13:change[changecnt]="D" ; break;
								case 12:change[changecnt]="C" ; break;
								case 11:change[changecnt]="B" ; break;
								case 10:change[changecnt]="A" ; break;
								default:change[changecnt]=Integer.toString(randNumber%changesel);	// String �迭������ �ڷ��� ������.
								}
								
							}
							randNumber=(int)(randNumber/changesel);
							
							changecnt--;
						}
						changecnt+=1;				// ������ changecnt-- �ϸ鼭 ������ȯ �Ѱ��� change[changcnt]�� �־��� �� 
													// �ٽ� changecnt�� +1������ ��
						while(changecnt<=7) {		// while������   changecnt++ �Ͽ�  _  _ �� ǥ�� �ǵ��� �Ѵ�.
							System.out.print("  _  " );
							changeanswer+=change[changecnt];	// �ݺ��� �����鼭 ������ ��ȯ�� chang[]�迭�� ���ڸ� �ϳ��� ���� ������ �־� �����ش�.
							changecnt++;
						}
						System.out.print("\n\n  �� : ");
						changedap=scan.next();			
						if(changeanswer.equals(changedap)) {	// ����� �� �� ��� 
							System.out.println("					�����Դϴ�~!");
							System.out.println("					���� : ["+changeanswer+"]");
							score++;
						}
						else {
							System.out.println("					Ʋ�Ƚ��ϴ٤Ф�");
							System.out.println("					���� : ["+changeanswer+"]");
						}
						System.out.println("\n========================================================");
						moncnt++;
						if(moncnt==5) {							//������ 5�� ��� �Ǹ� ���� 
							break;
						}
					}
					
				
				System.out.println("\n					���� ���� : "+ score);		// ���� ���� Ȯ�� 
				System.out.println("\n\n");
			    
				break;
				default :				// ���� �� ���ý� 1���� 2�� �ܿ� ������ ��� �ٽ� �Է��� �޵��� �Ѵ�.
					System.out.println(" 									�ٽ� �Է��ϼ���.");
					continue;
			}
			break;
		}
		
			System.out.println("========================================================");
			System.out.println("                  	���� ��!!   ");
			System.out.println("========================================================\n");
			onlyplaycnt=0;
			
			happy-=3;
			System.out.print("\n �ູ -3 / ");							// ��ȭ ���� ǥ��
			
			 hungry-=5;
			 System.out.print(" ������ -5 / ");							// ��ȭ ���� ǥ��
			
			
			exp+=10+score;
			System.out.print(" ����ġ  +10 + ���ʽ�(+"+score+")\n\n");		// ��ȭ ���� ǥ��
			
		}
		
		public void lang_study3() { /*���� �а� �� ã�� ���� */
		    hungrymaxcnt=0;
		    					
		    int judgecnt,insmon; 					// judgecnt : ���� �ߺ� �ִ� �� ������ �Ǵ��ϴ� ���� ,
		    										// insmon: �ߺ��� ���ٸ� instant������ ��� �Ｎ���� ���� ��ȣ�� �־� ���� ���� 
		     int moncnt=0, ocnt=0, recnt=0, xcnt=0 ;// moncnt�� ���� 10���� ����ϱ� ���ؼ� ����ϴ� ���� 
		     										//  ocnt: �´¼� , recnt: Ʋ������ ��ȸ , xcnt: Ʋ����
		     int mon[] = new int[10];    			// �ߺ����� �ʰԼ��ڸ� �޾Ƽ� ���� �迭���� ����ְ� Ȯ���Ѵ�.
		     boolean overlap=false;      			// overlap�� ���� ������ false  �Ǿ����� true ��ȯ�Ͽ� �ߺ��� �Ǵ� ��
		     String input;      					// ���� ���� ����    
		     String answer;   						// ������ �־� ���� ����              
		     String Exam[][]=new String[][]         // ������ �־� ���� ����        
		               {
		               {"'����� ��� ������ ���Ǿ� �ѷ����� ����'��� ���� ���� ���ڼ����? " ,"����ʰ�"},
		               {" dama�� ���� ��� �������̿� ������ ��ħ�� �Ծ��� \n ���ɿ��� ������ ���ð� ���Ƕ��̽��� �Ծ��� \n ���ῡ�� ������⸦ �԰� �Ľ����� ���̽�ũ���� �Ծ���\n �������� ���� ���ھ ã�� ���ÿ�.  ","����"},
		               {" ���Ƹ��� �߾�߾� \n �������� �۸�  \n �������� ��¦ \n ȣ���̴� ���� \n �������� ���¾ ã�ƾ��ÿ�","��¦"},               
		               {" dama�� ������ ���. ( ? ) dama�� ������ �ߴ� \n ��ĭ�� �˸´� ���Ӿ��� ���ּ��� \n �׸��� �׷��� �ֳ��ϸ� ����" ,"�׷���"},
		               {"'�ڱ��� ���� ����Ͽ� ���� ������ ���Ѵ�'��� ���� ���� ���ڼ����? ","��ż���"},
		               {" [���� ���� �������� ����] ������ ���� �Ӵ��� ���纸����(����X)","������������������"},
		               {" ������ �ܷ�� �ƴѰ���? \n ��� ���� ��Ÿ�� �������̽� ","���"},              
		               {" ������ �����̿����� ���ڴ�. �׷��� ������ �ݿ����� �ٵ�.. ���⼭ ������ ���� �����ϱ�?","�Ͽ���"},
		               {" [������ ���� ���� ������ ���� ������] ������ ���� �Ӵ��� ���纸����(����X)","�������������㸻���㰡��´�"},
		               {" [�������̤�������] �� ������ ����ٸ� ������ �ɱ��? /n [����] �ٶ���, ���� û��, ���","�ٶ���"},
		               {" [��Hx2] ���ڸ� ���ġ�Ͽ� �ϳ��� �ܾ ��������","����"},
		               {" '��� ���� ���� ��'�̶�� ���� ���� ���ڼ����?","��翩��"},
		               {" [������ ( ? )�� �� ũ��] ��ĭ�� �� ���� �˸��� ����?","���"},
		               {" [( ? ) ������ ( ? )���� �ȴ�] ��ĭ�� �� ���� ���ʴ�� �Է����ּ���.(����X)","�ٴ�,��"},
		               {" ������ ���� ���ϸ� �ְ� �ǰ�, �ϳ��� ���� ���� �ʺ��� �Ϸ� �پ���, ���ڸ� �߸� ���� ��谡 �ȴ�. ���� �����ϱ�? (����X) ","����"},
		               {" '[1.�����ݰ�, 2.�����ݰ�] �����̳� �ϴ� �༮�� [3.������, 4.��� ���] ū�Ҹ���'��� ������ ������� �´� ��ȣ�� �Է��ּ���(����X)","24"},
		               {" '[1.��������, 2.��������] ���� [3.�����ݰ�, 4.��������] �����ߴ� ����� �쿬�� ������'��� ������ ������� �´� ��ȣ�� �Է��ּ���(����X)","13"},
		               {" '�׳�� ���� [1.������, 2.���׽�] ���� ���ߴ�. �� �ڸ��� [3.����, 4.����] ����帱 ���� �ֽ��ϴ�'��� ������ ������� �´� ��ȣ�� �Է��ּ���(����X)","23"}
		               };

		     
		     Scanner scan = new Scanner(System.in);
		     
		     System.out.println("");
		     
		     while(true) {                      
		        
		        mon[moncnt]=(int)(Math.random()*Exam.length ); /*���� �κ��� mon�迭�� random���� �ְ� �ߺ��Ǵ� ���� �ִ��� 
		                                            			*�迭���� ���� ���Ѵ�. �׷��� ���� ���� ���� ���� �迭���� �ִٸ� 
		                                            			*overlap�� false�� �ٲ۴� . while �ݺ��� �� ���ư��� if����
		                                            			*overlap�� false��� overlap�� true�ٽ� �����ϰ� continue��
		                                            			*while(true)������ ���� ���� ���� �ٽ� �迭�� ���� ���ڸ� �޾� �ִ´�.
		                                            			*/ 
		        judgecnt=0;                                             
		        while(judgecnt<moncnt) {                                        
		           if(mon[judgecnt]==mon[moncnt]) {
		              overlap=true;    
		           }  
		           judgecnt++;
		        }
		        
		        if(overlap==true) {
		         overlap=false;
		         continue;
		        }
		        insmon=mon[moncnt];
		        answer=Exam[insmon][1];
		        System.out.println((moncnt+1)+"�� \n"+Exam[insmon][0]);
		        System.out.print("��: ");
		        moncnt++;
		        input=scan.next();   
		        												/*�׷��� ������ ���ٸ� overlap�� false�� �ٲ��� �ʾ� ����ϰ� �ǰ� 
		        												 *insmon���� �ߺ����� ���� ���� random��ȣ�� �ְ�  
		        												 *answer���� �� �迭�� ������ �ִ´�.
		        												 *�׸��� ������ ����ϰ� while�κп��� ����� Ʋ���κ��� üũ�Ѵ�. 
		        												 */
		           
		        while(true) {
		           if ( answer.equals(input) ) { 
		              System.out.println("");
		              System.out.println("�����Դϴ�");
		              System.out.println("");
		              ocnt++;
		              break;
		           }
		           else {
		              if(recnt<4) {
		                 System.out.print("�ٽ��Է�: ");
		                 input=scan.next();   
		                 recnt++;
		                 continue;
		              }
		              else {
		                 System.out.println("");
		                 System.out.println("Ʋ�Ƚ��ϴ�");
		                 System.out.println("");
		                 xcnt++;
		                 recnt=0;
		                 break;
		              }
		           } 
		        }
		        
		        System.out.println("����:  \'"+ answer +" \' ");
		       
		        if(moncnt>=3)break;        // ����� ������ 10������ ����� �Ǹ� ���ü� �ֵ��� break�� �ɾ�ξ���.
		     }
		     
		     System.out.println("�� �´°���: "+ocnt+" , Ʋ������: "+xcnt);
		     


		     System.out.println("========================================================");
		    System.out.println("                     ���� ��!!   ");
		    System.out.println("========================================================\n");
		    onlyplaycnt=0;
		    
		    happy-=3;
		    System.out.print("\n  �ູ -3 / ");
		    
		     hungry-=5;
		     System.out.print(" ������ -5 / ");
		       
		    exp+=10;
		    System.out.print(" ����ġ  +10 \n\n");

		 }
		
		public void rockpapersc_play1(){   				 // ���� ������ ����   ���� �̸� �ټ��� 
			hungrymaxcnt=0;								 // �Դ� �� �̿��� �ٸ� ������ �� ��� 0���� ������ش�.
			Scanner scan=new Scanner(System.in);		 // �Է°��� �ޱ� ���� ��� 
			int com=(int)(Math.random()*3)+1;			 // ���������� 3������ �ϳ������� 1~3���� ����
			int user;									 // ������ ���� ���� ���� ���� 
			String com_text="";						     // ���ð���  �� , �� , �� �� �Ѱ��� ��ȯ�Ͽ� �ִ� ����
			String user_text="";						 // ���ð���  �� , �� , �� �� �Ѱ��� ��ȯ�Ͽ� �ִ� ����
			int cntuser=0;								 // �̱� �� ī��Ʈ 
			int cntcom=0;								 // �̱� �� ī��Ʈ
			
		
			System.out.println("========================================================\n");
			System.out.println("	      ( play ) ���������� ����  \n ");
			System.out.println(" 	      	  -  3���� ��  -  ");
			System.out.println("\n========================================================");
			while(true){
				com=(int)(Math.random()*3+1);
				System.out.println("========================================================");
				System.out.println(" 1.���� 2.���� 3.�� �߿��� �Է��Ͻÿ� . \n");
				System.out.print("���� : ");
				user=Integer.parseInt(scan.next());
				
				if(user==2)							// user �� �ٸ���ġ�� �� ���ڸ�  �� �� �� �� ��ȯ�Ͽ� ������ ����
					user_text="��";
				else if(user==1)
					user_text="��";
				else if(user==3)
					user_text="��";
				if(com==2)
					com_text="��";
				else if(com==1)
					com_text="��";
				else if(com==3)
					com_text="��";
				
				if(com-user==0)						// ���� ���� �� ��� 
				{
					System.out.print("       "+Dama_name+" : "+ com_text+"  		 V S   " );
					System.out.println("  	  "+player+" : "+  user_text );
					System.out.println("\n			�����ϴ�. \n" );
				}
				else if(com-user==1|| com-user==-2)
				{
					cntcom=cntcom+1;				// �ٸ���ġ�� �̱� ���
					System.out.print("       "+Dama_name+" : "+ com_text+"  		 V S   " );
					System.out.println("  	  "+player+" : "+  user_text );
					System.out.println("\n			"+Dama_name+"  ��!! \n" );
				}
				else if(com-user==2|| com-user==-1)
				{
					cntuser=cntuser+1;				// player�� �̱� ��� 
					System.out.print("       "+Dama_name+" : "+ com_text+"  		 V S   " );
					System.out.println("  	  "+player+" : "+  user_text );
					System.out.println("\n			"+player+"  �� !! \n");
				}
				
				if(cntcom==3 || cntuser==3) 
				{	System.out.println("========================================================\n");
					if(cntuser==3)
					System.out.println("		     "+player+"�� �¸�! \n " );
					
					if(cntcom==3)
					System.out.println("		     "+Dama_name+"�� �¸�! \n " );

					System.out.println("========================================================");
					break;
					
				}
			
			
			}
			
			System.out.println("========================================================");
			System.out.println("                  	���� ��!!   ");
			System.out.println("========================================================\n");	
			
			onlyplaycnt++;
			happy+=5;
			System.out.print("\n  �ູ +5 / ");		   // ���� �� ��ȭ ��ġ ǥ��
			
			hungry-=5;
			System.out.print(" ������ -5 / ");			   // ���� �� ��ȭ ��ġ ǥ��
			
			if(onlyplaycnt<3) {
				exp+=10;
				System.out.print(" ����ġ  +"+10+" \n\n");// ���� �� ��ȭ ��ġ ǥ��
			
			}
				
			else if( onlyplaycnt>=3) {
				 exp-=10;
		
				System.out.println("��⸸ �ؼ� ����ġ�� ���������ϴ�.-10");
				System.out.println(" "+Dama_name+" : ���� ������ϱ� ���� �����ؾ���..! ");
				}/*������ 3�������ϸ� ����ġ ��ġ ���� */
			
		}
		
		
		public void dice_play2() {  // �ֻ��� ���� (2�� �� ��1 �Ͽ� ���� ���� )  
									// 1. �ֻ��� ���� ���� �� ����� ����� ����  
									// 2. �ֻ��� ���� ū ���� �¸��ϴ� ����
			hungrymaxcnt=0;
			int playerdice=0,damadice=0, dicecnt=0;		// 
			int playerhap=0;							// player�� �ֻ��� Ȯ���Ͽ� ���� ���� ���Ͽ� �ִ� ����
			int damahap=0;								// �ٸ���ġ�� �ֻ��� Ȯ���Ͽ� ���� ���� ���Ͽ� �ִ� ����
			int hapcnt=0;								// �ֻ��� ���� Ȯ���Ͽ� ���� Ƚ�� 
			int select=0;								// �ֻ����� ������ , �ֻ����� Ȯ�� ���� ������ ���� �ִ� ���� 
			int monselect;								// ���� 2���� �߿��� ������ ���� �ִ� ���� 
			int multiplesel=0;							// �� 2��° �ֻ��� ���� n����� ����� ���� ������ ��  - n ����� ���Ͽ� �ִ� ���� 
		
			System.out.println("");
			System.out.println("========================================================\n");
			System.out.println("	      ( play ) �ֻ��� ����  \n ");
			System.out.println(" 	      	  -  �ֻ��� ��   - \n\n"
				 + "		 * ¦�� �� °�� ���  "+ player
				 + "\n		 * Ȧ�� �� °�� ���  " + Dama_name
				 + "\n	 *�ֻ����� �� ���� ������ ���� Ȯ�� ���� ���� "
				 + "\n *�ֻ��� ���� ū ���� ��� �����Ͽ��� �� "
				 + "4�� ���� Ȯ���ϰ� ���и� �����Ѵ�.  ");
			System.out.println("\n========================================================");
			
			System.out.println("		!���� ��Ģ ���� !\n");
			System.out.println(" 1�� �ֻ��� ���� �� ū�� (��)  /  2�� �ֻ��� ���� n����� ����� ��(��)");
			System.out.print("\n\n  ����  : ");
			monselect=scan.nextInt();					// 2���� �� 1���� ���� ���� 
		
			if(monselect==1) System.out.println(" 1�� �ֻ��� ���� �� ū�� (��) �� �����Ͽ����ϴ�. ");
		
			if(monselect==2) {
				System.out.println(" 2�� �ֻ��� ���� n����� ����� ��(��) �� �����Ͽ����ϴ�.");
				while(true) {
					System.out.print("�� ��� ���� ( 7 ��� �̻� ~ 11��� ����  ): ");
					multiplesel=scan.nextInt();
		
					if(multiplesel<7 || multiplesel>11) {
						System.out.print("\n �ٽ� �������ּ���( 7 ��� �̻� ~ 11��� ����  ) "); 
						continue;
					}
					else { break;}
				}
			}
			System.out.println("\n========================================================");
			while(true) {
				
				System.out.println("\n   		"+(hapcnt+1)+"  ��   °  \n\n");
		
				System.out.print(" 1�� �ֻ��� ������  ");					 // �ֻ����� ������ ���� ��ŭ ���� �� �ֻ��� ���� Ȯ�� 
				if(dicecnt>=1) {
					System.out.print("  /   2�� �ֻ��� �� Ȯ��   ");		 // �ֻ����� �ѹ� �̻� �� �� �Ŀ� �ֻ��� ���� Ȯ�� �ϴ� ���� ��µ�
				}
		
		
				if(hapcnt%2==0) {
		
					if(dicecnt==0) { select=1; }
		
					else { select=(int)(Math.random()*2)+1;}
		
					System.out.print("\n\n\n \'"+Dama_name + "\'(��)�� ");
				}
		
				else if(hapcnt%2==1) { 
					System.out.print("\n\n\'"+player+"\'��  ����  : ");
					
					select=scan.nextInt();
		
					System.out.print("\n\n \'"+player+"\'(��)�� ");
				}
				switch(select) {									
					case 1:System.out.println(" "+select+" ��  '�ֻ��� ������'�� �����߽��ϴ�.\n "); break;
					case 2:System.out.println(" "+select+" ��  '�ֻ��� Ȯ���ϱ�'�� �����Ͽ����ϴ�.\n"); break;
				}
		
				if(select==1) {
					playerdice =(int)((Math.random()*6)+1);		// �ֻ��� ���ڰ� �ִ� 6������ 1~6���� ���� ���� �� 
					damadice = (int)((Math.random()*6)+1);		// �ֻ��� ���ڰ� �ִ� 6������ 1~6���� ���� ���� �� 
					dicecnt++;
				}
		
				else if(select==2) {							// �ֻ��� ���� Ȯ���ϱ⸦ �����Ͽ��� �� ��� 
											
					System.out.print(player+" �� �ֻ��� �� : "+ playerdice+"     " );
					System.out.print(Dama_name+" �� �ֻ��� �� : "+ damadice+"\n\n" );
			
					playerhap+=playerdice;
					damahap+=damadice;
					hapcnt++;
					System.out.print(player+" �� �ֻ��� �� : "+ playerhap+"     " );
					System.out.print(Dama_name+" �� �ֻ��� �� : "+ damahap+"\n\n"  );
					dicecnt=0;
				}
				System.out.println("========================================================");
				if(monselect==1 && hapcnt==4) {
					if(playerhap>damahap) { System.out.println("					"+playerhap+" \n	 	         "+player+" �� �¸�!!");}
					else if(playerhap==damahap) { System.out.println("				���º� !!");}
					else { System.out.println(damahap+" \n	    	      "+Dama_name+" �� �¸�!!");} 
					break;
				}	
			
				if(monselect==2 && playerhap!=0 && damahap!=0 
				&&(playerhap%multiplesel==0 || damahap%multiplesel==0)) {
					System.out.print("  		     "+multiplesel+" �� ��� : ");
					if(playerhap%multiplesel==0) {System.out.println(playerhap+" \n	 	         "+player+" �� �¸�!!");}
					else if(damahap%multiplesel==0) {System.out.println(damahap+" \n	    	      "+Dama_name+" �� �¸�!!");}
					else { System.out.println("				���º� !!");}
					break;
				}
			}
			
			System.out.println("========================================================");
			System.out.println("                  	���� ��!!   ");
			System.out.println("========================================================\n");
			
			onlyplaycnt++;
			happy+=5;
			System.out.print("\n  �ູ +5 / ");				// ���� �� ��ȭ ��ġ ǥ��
			
			hungry-=5;
			System.out.print(" ������ -5 / ");					// ���� �� ��ȭ ��ġ ǥ��
			
			if(onlyplaycnt<3) {
				exp+=10;
				System.out.print(" ����ġ  +"+10+" \n\n");		// ���� �� ��ȭ ��ġ ǥ��
			}
			
			else if( onlyplaycnt>=3) {
				exp-=10;
			
				System.out.println("��⸸ �ؼ� ����ġ�� ���������ϴ�.-10");
				System.out.println(" "+Dama_name+" : ���� ������ϱ� ���� �����ؾ���..! ");
			}												//������ 3�������ϸ� ����ġ ��ġ ���� 
			
		}
		
	     public void eat() {
	         
	         String food[][]=new String[][]    				// �޴������� ���� ������ �� ����ִ�  �迭 
	               {
	               {"���񰥺�","4000","35"},{"���� �ҹ��","3000","30"},
	               {"�� �Ұ��","3500","30"},{"����","5000","35"},{"�˹�","2800","30"},
	               {"���","3200","31"},{"���ö�","3000","30"},{"������Į����","4500","33"},
	               {"�����ʹ�","6000","30"},{"�Ľ�Ÿ","5500","35"},{"���","2000","20"},
	               {"���,��","2500","25"},{"�쵿","3000","25"},{"�ֵ���","1500","15"}
	               };
	               
	               
	               Scanner scan = new Scanner(System.in);
	               int sample[] = new int[5];
	               int scnt=0; //scnt�� sample[] ���� ������ ���ؼ�, �ߺ� ������ ���ؼ�
	               int foodnum, seecnt;
	               boolean truth=true;
	               System.out.println("========================================================\n");
	               System.out.println("		    !! �ٸ���ġ �Ĵ�  !!	"	);
	               System.out.println("\n========================================================\n");
	               while(true) {
	                  sample[scnt]=(int)(Math.random()*food.length);
	                  seecnt=0;
	                  while(seecnt<scnt) {					//�������� �޴� ���
	                     if (sample[seecnt]==sample[scnt])
	                    	 truth=false;
	                     seecnt+=1;
	                  }
	                  if(truth==false) {
	                     truth=true; continue;			//�޴��� �ߺ��� ��� �����
	                  }
	                  foodnum=sample[scnt];
	                 
	                  System.out.println(" "+((scnt)+1)+"�� "+food[foodnum][0]+" ("+food[foodnum][1]+"��)\n");
	                  
	                  scnt+=1;
	                  
	                  if(scnt==4) {									//�޴��� 4�� ���� ��µǾ��� ���
	                     System.out.println(" 5�� �ٸ� �޴� ���� \n\n 6�� �߽� �޴� \n");
	                     System.out.print(" ���� : ");
	                     sample[4]=Integer.parseInt(scan.next());
	                     
	                  }
	                  
	                  if(5==sample[4]) {						//5���� �����ϸ� �޴��� �ʱ�ȭ �Ŀ� �����
	                     scnt=0;
	                     sample[4]=0;
	                  }
	                  else if(scnt==4 && sample[4]!=6) {			//1~4���� �����ϸ� ���Ŀ� ���� ���� �������� ��ȭ
	                     foodnum=sample[ sample[4]-1];
	                     int Price=Integer.parseInt(food[foodnum][1]);
	                     int eat=Integer.parseInt(food[foodnum][2]);
	                     money -= Price;
	                     System.out.println();
	                     System.out.println("				 \'"+food[foodnum][0]+"\'�� �����Ͽ����ϴ�.");
	                     System.out.println("====================================================\n");
	                     System.out.print(" �� -"+Price+"��");
	                     
	                     if(hungry<=99) {						// ������ 99������ ��� ��ȭ ���� ǥ�� 
	                    	 hungry += eat;
	                    	 System.out.print(" /  ������ +"+eat);
	                    	 happy+=eat/2;
	                    	 System.out.println(" /  �ູ  +"+(eat/2));
	                    	 
	                     }
	                     else {
	                    	hungry += eat;
	          				happy-=(hungry-100)/5;   			// �������� �ִ� 100���� 100�� �ʰ��� ��  (�ູ���� �ʰ��� ��ġ)/5��ŭ  (-)��Ų��. 
	          				System.out.print("/ �ູ  -"+(hungry-100)/5);
	          				hungry=100;  
	          				System.out.println(" /   ������ +"+0);// ������  Max 100���� ����
	          				hungrymaxcnt++;			 			// �������� 100�ʰ��� ��� �ɶ� hungrymaxcnt++;
	          			}	
	                    
	                     if(money < 0) { 						// ������ 0�� �̸��� ��� ���� 5���� ���࿡�� ������
	                        money += 50000;
	                        bank -= 50000;
	                        System.out.println("������ �����ؼ� 5������ ���´�.");
	                     }
	                     break;
	                  }
	                  
	                  
	                  if(6==sample[4]) {        						//6�� ���ý� �߽� �޴��� �̵�
	                	  System.out.println("====================================================\n");
	                	 System.out.println("\n 				\'�߽�\'�� �����Ͽ����ϴ�.");
	                     Scanner night = new Scanner (System.in);
	                     System.out.println(" 1�� ġŲ (����õ��)\n\n 2�� ���� (2����)\n\n 3�� ���� (3����)\n\n"
	                     		+ " 4�� ����Ƣ (2����)\n\n ");
	                     System.out.print(" ���� : ");
	                     sample[4]=night.nextInt();			// �߽� �޴� ���� 
	                     
	                     switch (sample[4]) {				// ������ �޴��� ���� switch������ ��� 
	                     case 1 :								
	                    	
	                    	 
	                    	 System.out.println("				\'ġŲ\'(��)��  �����Ͽ����ϴ�.");
	                        System.out.println("\" ġŲ�� �� ���ǿ�. ���� ���� �ǿ�\"");
	                        if (money < 15000 ) {
	                           bank -= 15000;
	                           System.out.println("				������ �����Ͽ� ī�����Ͽ����ϴ�. ");	// ������ ������ ��� 
	                        } else {															// ī���� - ���࿡�� ��ݵ�
	                           money -= 15000;
	                        }                     
	                        
	                    	System.out.println("  ��  -"+15000+"\n");
	                     break;
	                     case 2 :
	                    	
	                    	 System.out.println("				\'����\'(��)��  �����Ͽ����ϴ�.");
	                        System.out.println("\"�� �λ��� ����\"");
	                        if (money < 20000 ) {
	                           bank -= 20000;
	                           System.out.println("				������ �����Ͽ� ī�����Ͽ����ϴ�.");
	                        } else {
	                           money -= 20000;
	                        }
	                        
	                    	System.out.println("  ��  -"+20000+"\n");
	                     break;
	                     case 3 :
	                    	 
	                    	 System.out.println("				\'����\'(��)��  �����Ͽ����ϴ�.");
	                    	 System.out.println("\"�߽��ϸ� ��������.!\"");
	                        if (money < 25000 ) {
	                           bank -= 25000;
	                           System.out.println("				������ �����Ͽ� ī�����Ͽ����ϴ�.");
	                        } else {
	                           money -= 25000;
	                        }
	                     
	                    	System.out.println("  ��  -"+25000+"\n");
	                     break;
	                     case 4 :
	                    	
	                    	 System.out.println("				\'������\'(��)�� �����Ͽ����ϴ�.");
	                        if (money < 10000 ) {
	                           bank -= 10000;
	                           System.out.println("				������ �����Ͽ� ī�����Ͽ����ϴ�.");
	                        } else {
	                           money -= 10000;
	                        }
	                       
	                    	 System.out.println("  ��  -"+10000+"\n");
	                     break;
	                     default :
	                        System.out.println("������ �԰� ������ ���� ..��������..");
	                     break;
	                     }
	                     if(hungry<=99) {				//  ������ 99������ ��� ��ȭ ���� ǥ��
		                        hungry += 30;
		                        happy += 15;
		                        System.out.println("====================================================\n");
		                        System.out.print(" �ູ  +"+15);
		                    	System.out.print(" /  ������  +"+30+"\n");
	                        }
	                     else {							//  ������ 100�̻��� ��� ��ȭ ���� ǥ��
	                        	hungry += 30;
		                        happy -= (hungry-100)/5;
		                        System.out.println("====================================================\n");
		                        System.out.print(" �ູ  -"+(hungry-100)/5);
		                    	System.out.print(" /  ������  +"+0+"\n");
		                    	hungrymaxcnt++;
	                     }
	                  
	                     if(money < 0) { 				// ���� 0�� �̸��� ��� 5���� ��� 
	                        money += 50000;
	                        bank -= 50000;
	                        System.out.println("������ �����ؼ� 5������ ���´�.");
	                     }
	                     
	                     break;
	                  }
	                  
	               }            
	      }
		      
		      
		   public void bank () {
		         
		      int num;
		      int take; //����ݾ�
		            
		      Scanner in = new Scanner (System.in);
		      
		      System.out.print("1. ����    2. ���         \n\n ���� : ");
		      num=in.nextInt();
		      switch (num) {
		      case 1 :
		          	Scanner Test = new Scanner(System.in);  
		            System.out.println("�ܰ� : "+bank+"��");
		            System.out.print("����ݾ� : ");
		            take=Test.nextInt();
		            money += take;
		            bank -= take;
		            System.out.println(take+"�� ����");
		            System.out.print("������ : "+money+"��");
		            System.out.println(",   �ܰ� : "+bank+"��");
		       break;
		       default :
		            System.out.println("���");
		            System.out.println("�ܰ� : "+bank+"��");
		       break;
		            
		         }
		      
		    
		  }
		   public void childmath_study1() {		  	// ���� 1 ����  �� �� �ִ� study �޼��� 
				hungrymaxcnt=0;
				System.out.println("");
				System.out.println("====================================================\n");
				System.out.println("	      ( study ) ���� ����  \n "
						+ "			- ���� -");
				System.out.println("\n====================================================");
				
			   Scanner cal = new Scanner(System.in);
			      int dap, answer=0;

			      int cnt=0, moncnt=0,score=0;
			      
			      while (true) {
			    	 
			    	  while(true) {										// ��ġ���� ���̵��� �����ϱ� ���� 
					    int exam1 = (int)(Math.random()*5+1);			// ������ 1~5 ���̿��� �̴���
					    int exam2 = (int)(Math.random()*5+1);			
			    		System.out.println("\n===================================================");
			  			System.out.println(" "+(moncnt+1)+" �� ����  ===========================================");
			  			System.out.println("===================================================\n");			
				        System.out.println("\n		 "+exam1+"  +  "+exam2+" ��   ???\n");
				        System.out.print(" 	        �� : ");
				         dap= cal.nextInt();
				         answer=exam1+exam2;
				         if ( dap == answer ) {
				            System.out.println("					�����Դϴ�.");
				            score++;
				            break;
				         }
				         else { 
				            System.out.println("					�����Դϴ�");
				            cnt++;
				            if (cnt >= 5) {
				               System.out.println("			���� : "+answer);
				               break;
				            }
				            continue;
				         }
			    	  }
			    	  moncnt++;
			    	  if(moncnt==5) break;
				         else continue;
			     }
			    System.out.println("					���� ���� : "+ score+"\n");
			    System.out.println("========================================================");
				System.out.println("                  	���� ��!!   ");
				System.out.println("========================================================\n");
				
				onlyplaycnt=0;
				
				happy-=3;
				System.out.print("\n  �ູ -3 / ");          // ��ȭ ��ġ ǥ��
				
				 hungry-=5;
				 System.out.print(" ������ -5 / ");			// ��ȭ ��ġ ǥ��
				
				exp+=10;
				System.out.print(" ����ġ  +10 \n\n");			// ��ȭ ��ġ ǥ��

			}
			
		
		 public void childmath_study2() {
		     hungrymaxcnt=0;
		     int   cnt=0,randNumber=0;//  ���� ���ȸ 4-cnt /5�� ��ȸ�ش� / randNumber �������� ������ �̱����� ����
		     String input, answer1="����" , answer2="���Ƹ�",answer3="����", answer4="����", answer5="å";// input �� �Է� 
		     System.out.println("");
		     System.out.println("====================================================\n");
		     System.out.println("         ( study ) ���� �̸� �˱�   \n "
		           + "         - 1������ Ǯ�� -");
		     System.out.println("\n====================================================");
		     
		     
		        
		        
		     System.out.println("\n===================================================");
		       System.out.println(" =================     ����            =====================");
		       System.out.println("===================================================\n");
		       randNumber=(int)(Math.random()*5+1);
		     
		       if(randNumber==1||randNumber==2||randNumber==3||randNumber==4||randNumber==5) {
		        System.out.println("���� ���� �����ϱ��?");
		        System.out.println("");   
		        System.out.print("    ��");  // ���� "���� ���� ���ڸ� ���� �־��."��¹��ڸ� �ֱ� ���ؼ� print�� ����Ͽ� ���� �ٲ��� �ʾҴ�
		        System.out.println("     ���� ���� ���ڸ� ���� �־��.");
		        System.out.print("  �ۡۡۡۡ� "); 
		        System.out.println("  ���� ����� ���� �԰� �־��.");
		        System.out.println("   �ۡۡ� "); 
		        System.out.println("    ��"); 
		        System.out.println("");
		           
		        while(true) {
		           System.out.print("��: ");
		           input= scan.next(); //���Է��� �ޱ����ؼ� scan.next();�� ����ߴ�
		           
		           if(answer1.equals(input)) { // input���� answer1�� ������ ���̸� if���� �����Ѵ�
		              System.out.println("               �����Դϴ�");
		           }
		           else {
		              System.out.println("            Ʋ�Ƚ��ϴ�  ���� ��ȸ : "+(4-cnt)); //cnt(0)���� 1�� Ŀ���鼭 ������ȸ�� 4321�� �پ���
		              cnt++;
		              if(cnt>=5) break; // cnt�� 5�̻��̵ɰ�� if���� ����Ǿ� break�۵�, ���� �ߴܵ�
		              continue; // cnt�� 5�̸��ϰ�� ���� �ö󰡼� else���� �ٽ� �����Ų��
		           }   
		           System.out.println("               ������ "+answer1+"�̾����ϴ�.");
		           break; // ������ ���ϰ� �ߴ�
		        }
		     }   
		              

		            
		     if(randNumber==1||randNumber==2||randNumber==3||randNumber==4||randNumber==5) {
		        System.out.println("���� ���� �����ϱ��?");
		        System.out.println("");
		        System.out.println("        ��� "); 
		        System.out.print  ("    ����������������");  // ���� "���� ������̿���."��¹��ڸ� �ֱ� ���ؼ� print�� ����Ͽ� ���� �ٲ��� �ʾҴ�
		        System.out.println("     ���� ������̿���.");
		        System.out.print  ("    �� ��  �� ��");
		        System.out.println("     ���� ������ �������ڸ� ���� �־��.");
		        System.out.print("  ##��  ��   ��##  ");
		        System.out.println(" ���� ũ�� ���� ���ƿ�.");
		        System.out.println("    ����������������");
		        System.out.println("      |   |");
		        System.out.println("      3   3");            
		           
		        while(true) {
		           System.out.print("��: ");
		           input= scan.next();//���Է��� �ޱ����ؼ� scan.next();�� ����ߴ�
		           
		           if(answer2.equals(input)) {
		              System.out.println("               �����Դϴ�");
		           }
		           else {
		              System.out.println("            Ʋ�Ƚ��ϴ�  ���� ��ȸ : "+(4-cnt));//cnt(0)���� 1�� Ŀ���鼭 ������ȸ�� 4321�� �پ���
		              cnt++;
		              if(cnt>=5) break;// cnt�� 5�̻��̵ɰ�� if���� ����Ǿ� break�۵�, ���� �ߴܵ�
		              continue; // cnt�� 5�̸��ϰ�� ���� �ö󰡼� else���� �ٽ� �����Ų��
		           }   
		           System.out.println("               ������ "+answer2+"�̾����ϴ�.");
		           break;// ������ ���ϰ� �ߴ�
		        }
		     }
		            
		            
		     if(randNumber==1||randNumber==2||randNumber==3||randNumber==4||randNumber==5) {
		        System.out.println("���� ���� �繰�ϱ��?");
		        System.out.println("");
		              
		        System.out.print  ("������  ������");
		        System.out.println("  ���� �α����̿���.");
		        System.out.print  ("�� ��  �� ��");
		        System.out.println("  ���� ���𰡸� �ڸ� �� �־��");
		        System.out.println("������  ������");
		        System.out.println("  \\  /");
		        System.out.println("      ��");
		        System.out.println("  /  \\");
		        System.out.println(" /    \\");
		        System.out.println("");

		        while(true) {
		           System.out.print("��: ");
		           input= scan.next();//���Է��� �ޱ����ؼ� scan.next();�� ����ߴ�
		           
		           if(answer3.equals(input)) {
		              System.out.println("               �����Դϴ�");
		           }
		           else {
		              System.out.println("            Ʋ�Ƚ��ϴ�  ���� ��ȸ : "+(4-cnt));//cnt(0)���� 1�� Ŀ���鼭 ������ȸ�� 4321�� �پ���
		              cnt++;
		              if(cnt>=5) break;// cnt�� 5�̻��̵ɰ�� if���� ����Ǿ� break�۵�, ���� �ߴܵ�
		              continue; // cnt�� 5�̸��ϰ�� ���� �ö󰡼� else���� �ٽ� �����Ų��
		           }   
		           System.out.println("               ������ "+answer3+"�̾����ϴ�.");
		           break;   // ������ ���ϰ� �ߴ�
		        }
		     }   
		           
		     if(randNumber==1||randNumber==2||randNumber==3||randNumber==4||randNumber==5) {
		        System.out.println("���� ���� �繰�ϱ��?");
		        System.out.println("");            
		              
		        System.out.print("   ������������");
		        System.out.println("  ���� �α����̿���.");
		        System.out.print("   ������������");
		        System.out.println("  ���� �۾��� �� �� �־��.");
		        System.out.println("   ������������");
		        System.out.println("   ������������");
		        System.out.println("   ������������");
		        System.out.println("�� ��  �� �� ��");
		        System.out.println("����  ��   �� ");
		        System.out.println("");
		              
		        while(true) {
		           System.out.print("��: ");
		           input= scan.next();//���Է��� �ޱ����ؼ� scan.next();�� ����ߴ�
		           
		           if(answer4.equals(input)) {
		              System.out.println("               �����Դϴ�");
		           }
		           else {
		              System.out.println("            Ʋ�Ƚ��ϴ�  ���� ��ȸ : "+(4-cnt));//cnt(0)���� 1�� Ŀ���鼭 ������ȸ�� 4321�� �پ���
		              cnt++;
		              if(cnt>=5) break;// cnt�� 5�̻��̵ɰ�� if���� ����Ǿ� break�۵�, ���� �ߴܵ�
		              continue; // cnt�� 5�̸��ϰ�� ���� �ö󰡼� else���� �ٽ� �����Ų��
		           }   
		           System.out.println("               ������ "+answer4+"�̾����ϴ�.");
		           break;// ������ ���ϰ� �ߴ�
		        }
		     }
		     if(randNumber==1||randNumber==2||randNumber==3||randNumber==4||randNumber==5) {
		        System.out.println("���� ���� �繰�ϱ��?");
		        System.out.println("");
		              
		        System.out.print  ("�������������������������� ��������������������������");
		        System.out.println("  ���� �ѱ����̿���.");
		        System.out.print  ("��           ������           ��");
		        System.out.println("  ���� �д°��� '�����Ѵ�'��� �ؿ�.");
		        System.out.println("����~~~~~~~~~~   ~~~~~~~~  ��");
		        System.out.println("����~~~~~~       ~~~~~~    ��");
		        System.out.println("����~~~~~~~~     ~~~~~~~   ��");
		        System.out.println("����~~~~~~       ~~~~      ��");
		        System.out.println("����~~~~~~~~~~   ~~~~~~    ��");
		        System.out.println("����~~~~~~~~  �� ~~~       ��");
		        System.out.println("����~~~~~~       ~~~~~~~~  ��");
		        System.out.println("��           ������           ��");
		        System.out.println("�������������������������� ��������������������������");
		        System.out.println("");

		        while(true) {
		           System.out.print("��: ");
		           input= scan.next();//���Է��� �ޱ����ؼ� scan.next();�� ����ߴ�.
		           
		           if(answer5.equals(input)) {
		              System.out.println("               �����Դϴ�");
		           }
		           else {
		              System.out.println("            Ʋ�Ƚ��ϴ�  ���� ��ȸ : "+(4-cnt));//cnt(0)���� 1�� Ŀ���鼭 ������ȸ�� 4, 3, 2, 1�� �پ���.
		              cnt++;
		              if(cnt>=5) break;// cnt�� 5�̻��̵ɰ�� if���� ����Ǿ� break�۵�, ���� �ߴܵ�
		              continue; // cnt�� 5�̸��ϰ�� ���� �ö󰡼� else���� �ٽ� �����Ų��
		           }   
		           System.out.println("               ������ "+answer5+"�̾����ϴ�.");
		           break;// ������ ���ϰ� �ߴ�
		        }      
		     }
		     System.out.println("========================================================");
		     System.out.println("                     ���� ��!!   ");
		     System.out.println("========================================================\n");
		     onlyplaycnt=0;
		           
		     happy-=3;
		     System.out.print("\n  �ູ -3 / ");			// ��ȭ ���� ǥ��
		           
		     hungry-=5;
		     System.out.print(" ������ -5 / ");			// ��ȭ ���� ǥ��
		              
		     exp+=10;
		     System.out.print(" ����ġ  +10 \n\n");		// ��ȭ ���� ǥ��
		  
		  }
		  
	}
