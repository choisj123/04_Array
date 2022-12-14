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
				arr[i] =arr.length - i; 
			
			if (i % 2 == 1) {
				sum += arr[i];
			}		
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("홀수 번째 인덱스 합: " + sum);
	
		
		
		
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
		
		
		
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) {
				count++;
				System.out.println(input + "에 " + ch + "가 존재하는 위치(인덱스): " + i);
			}
			int index[] = new int[count + 1];
			if(arr[i] == ch) {
				index[i] = i;
				//System.out.println(index[i]);
				
			}
			
		}
		
		
		//System.out.println(Arrays.toString(index));
			
		
		
		if(count > 0) {
			System.out.println(ch + " 개수: " + count);
		}
		
		
		
		
		
		
		
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
	
	

}
