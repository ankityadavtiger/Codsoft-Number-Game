//Student grade calculator

import java.util.*;

class Grade {
    public void GradeCalc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Enter Your marks one by one!");
        System.out.println();
        System.out.println("English: ");
        int E = sc.nextInt();
        System.out.println("Physics: ");
        int H = sc.nextInt();
        System.out.println("Maths: ");
        int M = sc.nextInt();
        System.out.println("Computer: ");
        int C = sc.nextInt();
        System.out.println("Chemistry: ");
        int S = sc.nextInt();
        System.out.println();
        // total marks;
        int T = (E + H + M + C + S);
        int avg = T / 5;
        int per = (T * 100) / 500;

        char grade;
        if (avg >= 90)
            grade = 'A';
        else if (avg >= 80)
            grade = 'B';
        else if (avg >= 70)
            grade = 'C';
        else if (avg >= 60)
            grade = 'D';
        else if (avg >= 50)
            grade = 'E';
        else
            grade = 'F';

        System.out.println("Your Total Marks: " + T);
        System.out.println(name + " You score: " + per + " %");
        System.out.println("Grade: " + grade);
        System.out.println();
        if (avg >= 90)
            System.out.println("excellent " + name + " keep it up!");
        else if (avg >= 70)
            System.out.println("Good " + name);
        else
            System.out.println(name + " you need to study hard!");

    }
}

class Main {
    public static void main(String args[]) {
        Grade ob = new Grade();
        ob.GradeCalc();
    }
}