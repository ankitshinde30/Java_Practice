public class StudentMarks {
    public static void main(String args[]){
        double sub1= 85.4;
        double sub2= 78.9;
        double sub3= 92.5;
        double sub4= 75.9;
        double sub5= 94.5;

        double totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        double averagemarks = totalMarks/5;
        double percentage = (totalMarks/500) * 100;

        System.out.println("Marks: " + sub1 + ", " + sub2 + ", " + sub3 + ", " + sub4 + ", " + sub5);
        System.out.println("Total Marks     : " + totalMarks);
        System.out.println("Average Marks   : " + averagemarks);
        System.out.println("Percentage      : " + percentage + "%");


    }
}
