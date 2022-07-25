package com.quest2;

import java.util.Scanner;

import com.quest2.sumBST.SumBST;

public class SumBSTApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumBST sumBST=new SumBST();
		System.out.println("Enter the sum");
		Scanner myScan = new Scanner(System.in); 
		sumBST.setSum( myScan.nextInt());
		sumBST.checkSum();

	}	
}
