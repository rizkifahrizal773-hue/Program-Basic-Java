public class Graduatestudent extends Student {
    private String thesisTitle;

    public String getThesisTitle(){
        return thesisTitle;
    }
    
    public void setThesisTitle(String thesisTitle){
        this.thesisTitle=thesisTitle;
    }
    @override
    public void setDisplayInfo(){
        super.displayInfo();
        System.out.println("Graduate Student with thesis:"+thesisTitle);
    }
}
