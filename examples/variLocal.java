public class variLocal {
    int age = 20; // instance variable age, created inside class
    String name = "Rahul"; // instance variable name, created inside class
    static String classVar = "Class variable Test"; // class variable classVar
    public static void main(String[] args) {
         int var = 10; // Local variable
    System.out.println("Local Variable: " + var);

    //object refrence 
    variLocal vi=new variLocal();
    System.out.println(vi.age);
    System.out.println(vi.name);
    System.out.println(variLocal.classVar);
    }
}
