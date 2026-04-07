public class App {
    public static void main(String[] args) {
        Student student1 = new Student();
        // NIM tidak diisi
        student1.setNIm("123456");
        student1.setFullName("Budi");
        student1.setEmail("budi@gmail.com");
        student1.setPhoneNumber("098494878746");
        student1.setMajor("Teknik Informatika");

        Graduatestudent student2 = new Graduatestudent();
        student2.setNIm("67890");
        student2.setFullName("Jono");
        student2.setThesisTitle("Machine Learning in Healthcare");

        student1.register();  
    }
}