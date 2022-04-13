public class LearnConstructor {

 String name="james";
 int age;
 String address;
    public LearnConstructor(){

        //this is constructor.
        //this is called default constructor, because any constructor without any parameter is called default.
        System.out.println("hellow");
    }

    //parameterization
    public LearnConstructor(String name){
    //Single parameterized Constructor.
        this.name=name;
        System.out.println(this.name);
    }

    //Multi Parameterized Constructor
    public LearnConstructor(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("student name is "+this.name+" age is "+this.age);

    }

    public static void main(String[] args) {
        //Constructor helps us to create objects.
        //Constructor name should be same as class name.
        //Constructor has no return type.
        //Constructor is used to initialize objects.
        //Constructor syntax : AccessModifier ClassName/ConstructorName() {}

        LearnConstructor obj=new LearnConstructor(); // default constructor.

        LearnConstructor wasee = new LearnConstructor("Ahmed"); // Argument passing.
        LearnConstructor tajWar= new LearnConstructor("Naina", 25);
    }
}