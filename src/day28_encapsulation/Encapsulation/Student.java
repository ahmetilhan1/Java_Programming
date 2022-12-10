package day28_encapsulation.Encapsulation;

public class Student {

    private int age;

    private String name;


    public String getName() {
        if(name == null){
            System.err.println("Name has not been set");
            System.exit(1);
        }

        return name;
    }

    public void setName(String name) {
        boolean hasDigit = false;

        for (char c : name.toCharArray()) {
            if(Character.isDigit(c)){
                hasDigit = true;
                break;
            }

        }
        if(hasDigit){
            System.err.println("Invalid name = "+name);
            System.exit(1);
        }

        this.name = name;
    }

    public int getAge(){

        if(age==0){
            System.err.println("Age has not been set");
            System.exit(1);
        }
        return age;
    }
    public void setAge(int age){

        if(age<1){
            System.err.println("Invalid Age: "+age);
            //return;
            System.exit(1);
        }
        this.age = age;
    }
}
