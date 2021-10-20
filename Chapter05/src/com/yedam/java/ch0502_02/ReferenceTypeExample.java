package com.yedam.java.ch0502_02;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("값의 수가 부족합니다");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1+num2;
		System.out.println(num1 + "+"+ num2 + "=" + result);
		System.out.println("Quiz====================");
		int max = 0;
		int[] array= {1,5,3,8,2};
		for(int i=0;i<array.length;i++) {
			if(array[i] > max) {
				max= array[i];
			}	
		}
		 System.out.println(max);
		
		 //추가문제 ) 책 161 3번
		 //while문과 Math.random()함수를 이용해서 
		 //2개의 주사위 를 던졌을 때 나오는 숫자를 (숫자1,숫자2) 형태로 출력하고,
		 //숫자의 합이 5가 아니면 계속 주사위를 던지고 , 숫자의 합이 5이면 실행을 멈추는 코드를 작성해보세요.
		 //또한 주사위를 몇번 던졌는지 횟수를 출력하세요
		 //숫자의 합이 5가 되는 조합은 (1,4) (4,1) (2,3) (3,2)
		 int count =0;
		     while(true) {
		    int x = (int)(Math.random()*6)+1;
		    int y = (int)(Math.random()*6)+1;
		    count++;
		    int result1 = x + y;
		    if(result1==5) {
		    	System.out.printf("(%d, %d)\n" , x, y);
		    	break;
		    }
		     }
System.out.println("주사위를 던진 총 횟수는 총 " + count + "번 입니다");			



            
             int[][] scores= new int[2][3];
             int[] scores1 = new int[3];
             int[] scores2 = new int[3];
             //int[] -> 타입 
            // int[][] scoreArray = new int[][2];
             //scoreArray[0] =scores1;
             
             int[][] mathscores = new int[2][3];
             System.out.println(mathscores);
             for(int x=0; x<mathscores.length;x++) {
            	 System.out.println(mathscores[x]);
            	int[] temp = mathscores[x];
            	for(int y=0;y<temp.length;y++) {
            		System.out.println(temp[y]);
                
            	}
             }
             
             System.out.println();
             int[][] englishScores = new int[2][];
             
             englishScores[0] = new int[5];
             englishScores[1] = new int[3];
             System.out.println(englishScores.length);
             for(int x=0;x<englishScores.length;x++) {
            	 System.out.println(englishScores[x].length);
            	 System.out.println();
            	 for(int y=0; y<englishScores[x].length;y++) {
            		 System.out.println(englishScores[x][y]);
            		 
            	 }
             }
             
             System.out.println("===========================");
             int[] temp = {89,90,93};
             int [][] javaScores = { { 95,80}, {92,96,80} };
             // {1차원 배열, 1차원 배열 }
             // { { 95,80}, {92,96,80} }
             //{95,80} / {92,96,80}
             for(int x=0; x<javaScores.length;x++) {
            	 //int[] java = javaScores[x];
            	 for(int y =0; y<javaScores[x].length;y++) {
            		 int ja = javaScores[x][y];
            		 System.out.println(ja);
            	 }
             }
             
             int[] oldIntArray = {1,2,3};
             int[] newIntArray= new int[5];
             for(int i=0;i<oldIntArray.length;i++) {
            	 newIntArray[i] = oldIntArray[i];
             }
             
             for(int i=0;i<newIntArray.length;i++) {
            	 System.out.println(newIntArray[i]);
            	 //System.arraycopy();
             }
             String[] oldStrArray = {"java", "array", "copy"};
             String[] newStrArray = new String[5];
             System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
             System.out.println("==============================");
             int[] scoreList= {95,71,84,93,97};
             int sum = 0;
             for(int score : scoreList) {
            	 System.out.println(score);
            	 sum+= score;
             }
             System.out.println("총 합 : " + sum);
             double avg= (double) sum /scoreList.length;
             System.out.println("평균 : " + avg);
			}
	}


