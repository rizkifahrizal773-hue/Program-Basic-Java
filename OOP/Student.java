public class Student{
    private String nim;
    private String fullname;
    private String email;
    private String phonenumber;
    private String major;

    public String getNIm(){
        return nim;
    }
    public void setNIm(String nim){
        this.nim=nim;
    }

    public String getFullName() {
        return fullname;
    }
    public void setFullName(String fullName) {
        this.fullname=fullName;
    }

    public String getEmail(){
        return email;    
    }
    public void setEmail(String email){
        this.email=email;
    }

    public String getPhoneNumber(){
        return phonenumber;    
    }
    public void setPhoneNumber(String phonenumber){
        this.phonenumber=phonenumber;
    }

    public String getMajor(){
        return major;    
    }
    public void setMajor(String major){
        this.major=major;
    }

    public void displayInfo() {
        System.out.println("NIM: " + nim + "\nName: " + fullname + "\nemail"+ email + "\nphonenumber" + phonenumber + "\nmajor" + major);
    }

    public void register() {
    if (nim == null || nim.isEmpty()) {
        System.out.println("Registration failed");
        return; // langsung keluar dari method
    }

    // Jika NIM diisi, tampilkan pesan sukses dan semua informasi
    System.out.println("Registration Successful!");
    System.out.println("NIM: " + nim);
    System.out.println("Full Name: " + fullname);
    System.out.println("Email: " + email);
    System.out.println("Phone Number: " + phonenumber);
    System.out.println("Major: " + major);
}
}