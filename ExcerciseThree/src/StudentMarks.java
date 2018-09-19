import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numOfStudents = sc.nextInt();
        System.out.println();
        int[] stuGrades = new int[numOfStudents];

        for (int i=0;i<stuGrades.length;i++){
            System.out.print("Enter grade for student " + (i+1) +": ");
            stuGrades[i] = sc.nextInt();
            System.out.println();
        }

        StudentMarks studentMarks = new StudentMarks();
        studentMarks.checkMarks(stuGrades);
    }

    public boolean checkMarks(int[] stuGrades){

        if(stuGrades == null){
            return false;
        }

        for(int i=0;i<stuGrades.length;i++){
            try{
                if(stuGrades[i]<=100 && stuGrades[i]>=0){
                    System.out.println(stuGrades[i] + " is valid");
                }else{
                    throw new Exception("Grade should be between 0 and 100!");
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
                return false;
            }
        }
        return true;
    }
}
