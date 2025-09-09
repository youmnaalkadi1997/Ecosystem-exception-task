public class Main {

    public static void main(String[] args) {
        StudentRepo studentRepo = new StudentRepo();


        Student student = new Student("1", "Youmna" , "ert");

        studentRepo.save(student);

        try {
            Student student1 =  studentRepo.findById("1");
            System.out.println("Student found: " + student1);
        }catch (Exception e){
            System.out.println("Student not found");
        }
    }
}
