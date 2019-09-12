public class Grades {
    public static void main(String[] args) {



        Student student1 = new Student("Mary");
        Student student2 = new Student("Mike");

        student1.inputGrades();
        System.out.println(student1.getName() + "'s average is " + student1.getAverage());

        student2.inputGrades();
        System.out.println(student2.getName() + "'s average is " + student2.getAverage());
    }
}
