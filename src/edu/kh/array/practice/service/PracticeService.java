package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

	public void practice1() {
		int[] arr = new int[9];
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = i+1;
			
			if (i % 2 == 0) {
				sum += arr[i];
			}
					
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("짝수 번째 인덱스 합: " + sum);
	
		
		
		
	}

	public void practice2() {
		int arr[] = new int[9];
		
		int sum = 0;
		
		// 9 8 7 6 5 4 3 2 1
	// arr[0 1 2 3 4 5 6 7 8]
		
							//9				
		for(int i = 0; i < arr.length; i++) {
				arr[i] = arr.length - i; 
				System.out.print(arr[i] + " ");
			
				if (i % 2 == 1) {
				sum += arr[i];
			}		
		}
		//System.out.println(Arrays.toString(arr));
		System.out.println("\n홀수 번째 인덱스 합: " + sum);
	
		
		
		
	}
	
	public void practice3() {	
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수: ");
		int input = sc.nextInt();
		
		int arr[] = new int [input];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}	
		//System.out.println(Arrays.toString(arr));
	}

	public void practice4() {
		
		int arr[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 0: ");
		arr[0] = sc.nextInt();
		
		System.out.print("입력 1: ");
		arr[1] = sc.nextInt();
		
		System.out.print("입력 2: ");
		arr[2] = sc.nextInt();
		
		System.out.print("입력 3: ");
		arr[3] = sc.nextInt();
		
		System.out.print("입력 4: ");
		arr[4] = sc.nextInt();
		
		//System.out.println(Arrays.toString(arr));
		
		System.out.print("검색할 값: ");
		int search = sc.nextInt();
		
		boolean index = false;
		
		for(int i = 0; i < arr.length; i++) {
			 if (arr[i] == search) {
				 index = true;
				 System.out.println("인덱스: " + i);
			 } 
		 }
		if (index != true ) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		 }
				 	 
		
		
	}

	public void practice5() { //다시 풀기
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열: ");
		String input = sc.nextLine();
		
		char arr[] = new char[input.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
		}
		//System.out.println(Arrays.toString(arr));
		System.out.print("문자: ");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		
		System.out.print(input + "에 " + ch + "가 존재하는 위치(인덱스): ");
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) {
				System.out.print(i +" ");
				
				count++;
			}
		}
		System.out.println();
		System.out.println(ch + "개수: " + count);
		
		
		
		
		
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수: ");
		int input = sc.nextInt();
		
		int arr[] = new int[input];
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값: ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		
		}
		System.out.println(Arrays.toString(arr));
		System.out.print("총 합: " + sum);
		
	}
	
	public void practice7() {
		//8번째 자리 arr[7]
		
		char arr[] = new char[14];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함): ");
		String input = sc.nextLine();
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
		
		//System.out.println(Arrays.toString(arr));
			if (arr[7] =='1' || arr[7] =='2') {
				arr[8] = '*';
				arr[9] = '*';
				arr[10] = '*';
				arr[11] = '*';
				arr[12] = '*';
				arr[13] = '*';	
			}
			System.out.print(arr[i]);
		}		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("정수: ");
			int input = sc.nextInt();
			
			if (input < 3 || input % 2 ==0) {
				System.out.println("다시 입력하세요.");
				
			} else {
				int arr[] = new int[input];
				
				int num = 0;
			
				for (int i = 0; i < arr.length; i++) {
					if ( i <= arr.length / 2) {
						arr[i] = ++num;
					
					} else {
						arr[i] = --num;
					}
					
					// 출력 시, 추가 (단, 마지막 제외)
					if (i == arr.length - 1) {
						System.out.print(arr[i]);
					}else {
						System.out.print(arr[i] + ",");
					}
				} 
				break;
			}
			
		}	
	}
	
	public void practice9() {
	/* 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
	1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.

	[실행 화면]
	발생한 난수 : 9 7 6 2 5 10 7 2 9 6 */
	
		int arr[] = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 +1);		
		}
	
		System.out.print("발생한 난수: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	
	
	
	}	

	public void practice10() {
		/*
		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
		1~10 사이의 난수를 발생시켜 배열에 초기화 후
		배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.			
		[실행 화면]
		발생한 난수 : 5 3 2 7 4 8 6 10 9 10	 			
		최대값 : 10
		최소값 : 2
		 */
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		System.out.print("발생한 난수: ");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int max = 1;
		int min = 10;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}
			
		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
		
	}

	public void practice11() {
		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
			1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
			
			[실행 화면]
			4 1 3 6 9 5 8 10 7 2
		 */
		int arr[] = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i]= (int)(Math.random() * 10 + 1);
			
			for(int x = 0; x < i; x++) {
				if (arr[i] == arr[x]) {
					i--;
					break;
				}
			}
	
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}	
	}

	public void practice12() {
		
		int lotto[] = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			for (int x = 0; x < i; x++) {
				if(lotto[i] == lotto[x]) {
					i--;
					break;
				}		
			}			
		}
		
		for (int i = 0; i < lotto.length - 1; i++) {
			for(int x = i + 1; x < lotto.length; x++) {
				if(lotto[i] > lotto[x]) {
					int temp = lotto[i];
					lotto[i] = lotto[x];
					lotto[x] = temp;
				}
			}
		}
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열: ");
		String str = sc.nextLine();
		
		char arr[] = new char[str.length()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);		
		}
		
		int count = 0;
		System.out.print("문자열에 있는 문자: ");
		
		for (int i = 0; i < arr.length; i++) {
			
			boolean flag = true;
			
			for (int x = 0; x < i; x++) {
				if (arr[i] == arr[x]) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				if(i == 0) {
					System.out.print(arr[i]);
				}else {
					System.out.print(", " + arr[i]);
				}
				
				count++;
			}
			
		}
		System.out.println();
		System.out.println("문자 개수: " + count);
	}

	public void practice14() {
		         
	
	}
}
