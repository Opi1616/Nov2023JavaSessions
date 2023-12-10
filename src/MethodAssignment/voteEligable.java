package MethodAssignment;

import java.util.Scanner;

public class voteEligable {

	public boolean candidateIsEligableForVote(int age) {
		if (age >= 18) {
			System.out.println("candidate Is Eligable For Vote");
			return true;
		} else {
			System.out.println("he/she is not eligable for vote");
		}
		return false;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		

		voteEligable obj = new voteEligable();
		boolean n = obj.candidateIsEligableForVote(age);
		System.out.println(n);

	}

}
