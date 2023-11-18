import java.util.*;
import java.io.*;
public class Student {
    public static void studentGrade(){

    int marks[] = new int[7];
    int subjects=6;
    float total=0,avg;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the marks of Students");
    for(int i=0;i<6;i++){
        System.out.print("Enter Marks of Subject "+(i+1)+":");
        marks[i]=sc.nextInt();
        total = total + marks[i];
    }
    System.out.println("The total marks are :"+total);
     avg= total/6;
    System.out.println("The average percentage obtained by the student :"+ avg +"%");
    System.out.println("The Student Grade is: ");
    if(avg>=80){
        System.out.println("A");
    }
    else if(avg>=60 && avg<=80){
      System.out.println("B");
    }
    else if(avg>=40 && avg<=60){
        System.out.println("C");
    }
    else if(avg>=25 && avg<=40){
        System.out.println("D");
    }
    else
    {
        System.out.println("F");
    }
}
public static void main(String[] args){
   studentGrade();
}
}
