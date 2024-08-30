package com.Student.Grade.Calculator;
import java.util.*;

public class StudentGrade {
	
	private static String calculate(double percentage)
	{
		if(percentage > 90)
			return "A";
		else if(percentage >75)
			return "B";
		else if(percentage > 60)
			return "C";
		else if(percentage > 50)
			return "D";
		else if(percentage >35)
			return "E";
		else
			return "F";
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Total number of subjects..");
		int subjects = s.nextInt();
		int[] marks = new int[subjects];
		int total=0;
		
		for(int i=0;i<subjects;i++)
		{
			System.out.println("Enter the marks of subject "+(i+1));
			marks[i]=s.nextInt();
			total+=marks[i];
		}
		
		double percentage = total/(double)subjects;
		String formatPercentage = String.format("%.2f",percentage);
		System.out.println("\n\n");
		System.out.println("Total marks of the student is: "+ total);
		System.out.println("Average percentage of student is: " + formatPercentage + "%");
		System.out.println("The grade is : " + calculate(percentage));
		
		
	}

}
