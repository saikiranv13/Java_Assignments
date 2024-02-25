public class Main {
    public static void main(String[] args) {
       
        int subject1Marks = 78;
        int subject2Marks = 45;
        int subject3Marks = 62;

        int totalMarks = subject1Marks + subject2Marks + subject3Marks;
        double percentageMarks = (totalMarks / 300.00) * 100;

        System.out.println("Robert's total marks: " + totalMarks);
        System.out.printf("Robert's percentage marks: %.2f%n", percentageMarks);
    }
}
