package studio1;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("name");
		String name = in.nextLine();
		System.out.println("Enter average grade for the assignemts");
		double averageAssignmentGrade = in.nextDouble(); 
		double weightedAssignmentGrade = (averageAssignmentGrade/100.0)*30.0;
		
		System.out.println("Enter the sum of grade for extension 1 and 2");
		int extensionPoints = in.nextInt();
		double weightedExtensionGrade = (extensionPoints/40.0)*10.0;
		
		System.out.println("Enter the number of session attended");
		int studiosAttended = in.nextInt();
		double weightedStudioGrade = (studiosAttended/8.0)*10.0;
		
		System.out.println("Enter the average grade for highest four of all quizzes");
		double averageQuizGrade = in.nextDouble();
		double weightedQuizGrade = (averageQuizGrade/100.0)*2.0;
		
		System.out.println("Enter the number of studio preps completed");
		int studioPrepsCompleted = in.nextInt();
		double weightedStudioPrepGrade = (studioPrepsCompleted/10.0)*2.0;
		
		System.out.println("Enter the average grade for all exams");
		double averageExamGrade = in.nextDouble();
		double weightedExamGrade = (averageExamGrade/100.0)*45.0;
		
		double rand= Math.random();
		boolean courseReview = (0.5 > rand); 
		
		double totalGrade = weightedAssignmentGrade+weightedExtensionGrade+weightedStudioGrade+weightedQuizGrade+weightedStudioPrepGrade+weightedExamGrade;
		
		System.out.println("CSE 131 Grade for: " + name);
		System.out.println("Average Assignment Grade:" + averageAssignmentGrade+"%");
		System.out.println("Weighted Assignment Grade (out of 30):" + Math.round(weightedAssignmentGrade*100.0)/100.0 +"%");
		System.out.println("Number of Extension Points:" + extensionPoints);
		System.out.println("Weighted Extension Grade (out of 10) :" + Math.round(weightedExtensionGrade*100.0)/100.0 +"%");
		System.out.println("Number of studios attended:" + studiosAttended);
		System.out.println("Weighted studio grade (out of 10):" + Math.round(weightedStudioGrade*100.0)/100.0 + "%");
		System.out.println("Average quiz grade:" + averageQuizGrade +"%");
		System.out.println("Weighted quiz grade (out of 2):" + Math.round(weightedQuizGrade*100.0)/100.0+ "%");
		System.out.println("Studio preps completed:" + studioPrepsCompleted);
		System.out.println("Weighted studio prep grade (out of 2):" + Math.round(weightedStudioPrepGrade*100.0)/100.0+ "%");
		System.out.println("Average Exam Grade:" + averageExamGrade +"%");
		System.out.println("Weighted Exam Grade (out of 45):" + (Math.round(weightedExamGrade*100.0)/100.0)+ "%");
		System.out.println("Completed course review: " + courseReview);
		System.out.println("Total Grade:"+ Math.round(totalGrade*100)/100.0+"%");
		
	}

	private static void random() {
		// TODO Auto-generated method stub
		
	}

}
