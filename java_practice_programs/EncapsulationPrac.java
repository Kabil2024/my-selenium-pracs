package java_practice_programs;

public class EncapsulationPrac {
    private String name;
    private int age;
    private float height;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }


    public void setName(String name1) {
        name = name1;
    }

    public String getname() {
        return name;
    }
    public void setAge(int newAge){
        age =  newAge;
    }
    public int getAge(){
        return age;
    }

}