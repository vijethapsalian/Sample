package Practise;

import java.util.Random;
import java.util.Scanner;

public class Random_Number {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int maxno = sc.nextInt();
	Random r=new Random();
	System.out.println(r.nextInt(maxno));
}
}
