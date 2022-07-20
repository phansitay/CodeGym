package ss5_access_modifier_static_method_static_property;

public class TestStudent {
    private String name="John";
    private String classes="C02";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public TestStudent()
    {
        this.name=getName();
        this.classes=getClasses();
    }
    public static void main(String[] args) {
        TestStudent ts=new TestStudent();
        System.out.printf("Name : "+ts.name+"\n");
        System.out.printf("Clas : "+ts.classes);
    }
}
