public class MethodOverloading {
    public static void main(String[] args) {
        sayHello("Indra",21);
        sayHello(21);
        sayHello("Yasya");
    }
    static void sayHello(String name, int age){
        System.out.println("Nama saya "+name+", umur "+age);
    }
    static void sayHello(int age){
        System.out.println(age);
    }
    static void sayHello(String lastName){
        System.out.println("Nama belakang saya "+lastName);
    }
}
