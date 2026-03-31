public class ActiveStudent extends Student {
    String major;

    void introduce() {
        System.out.println("Saya Mahasiswa Aktif");
    }

    public static void main(String[] args) {
        ActiveStudent s = new ActiveStudent();
        s.name = "Rizki";
        s.age = 20;
        s.major = "Informatika";

        s.introduce();
    }
}