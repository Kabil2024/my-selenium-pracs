package java_practice_programs;


public class EncapsulationPrac1 {
    public static void main(String[] args) {
        EncapsulationPrac kabil1 = new EncapsulationPrac();
        kabil1.setName("kabil");
        kabil1.setAge(24);
        kabil1.setHeight(23.0f);
        System.out.println(kabil1.getAge());
        System.out.println(kabil1.getname());
        System.out.println(kabil1.getHeight());
        System.out.println(StaticandNonStatic.name);//static variable
        System.out.println(StaticandNonStatic.getnumber());//static method
        StaticandNonStatic kabi = new StaticandNonStatic();//non-static variable so we are crting obj frm the particular cls
        System.out.println(kabi.age);//non static variable
        System.out.println(kabi.phnumber());//non-static method}
        StaticandNonStatic ss = new StaticandNonStatic();
        System.out.println(ss.age);
    }
}
