package com.assignment;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class StuNameComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
}



class StuMarksComparatorDesc implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return Double.compare(o2.getMarks(), o1.getMarks());
	}
}
class StuCityComparatorDesc implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getCity().compareTo(o2.getCity());
	}
}
public class Program {
	public static int menu(Scanner sc) {
		System.out.println("0. EXIT");
		System.out.println("1. Display All Students ");
		System.out.println("2. Display Student Sorted on City(asc)");
		System.out.println("3. Display Student Sorted on marks(desc)");
		System.out.println("4. Display Student Sorted on name(asc");
		System.out.println("5. Display Student Sorted on roll no");
		return sc.nextInt();
	}
	public static void displayAllStudent(Student[] arr) {
		System.out.println("*************************");
		for (Student student : arr)
			System.out.println(student);
		System.out.println("*************************");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[5];
		Comparator<Student> comparator;
		arr[0] = new Student(5, "Mukesh", "Patna" , 75 );
		arr[1] = new Student(1, "Anil", "Pune", 80 );
		arr[2] = new Student(4, "Suresh","Mumbai", 90 );
		arr[3] = new Student(3, "Ramesh", "Kolkata", 60 );
		arr[4] = new Student(2, "Sham","Ranchi", 70 );
		int choice;
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				displayAllStudent(arr);
				break;
			case 2:
				comparator = new StuCityComparatorDesc();
				Arrays.sort(arr,comparator);
				displayAllStudent(arr);
				break;
			case 3:
				comparator = new StuMarksComparatorDesc();
				Arrays.sort(arr, comparator);
				displayAllStudent(arr);
				break;
			case 4:
				comparator = new StuNameComparator();
				Arrays.sort(arr, comparator);
				displayAllStudent(arr);
				break;
			case 5:
				Arrays.sort(arr);
				displayAllStudent(arr);
				break;

			default:
				System.out.println("Wrong choice...");
				break;
			}
		}
	}
}

