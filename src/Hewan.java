public class Hewan {
    public static void main(String[] args){
        int age = 30;

        Integer ageObject = age;

        int ageAgain = ageObject;

        byte byteAge = ageObject.byteValue();
        short shortAge = ageObject.shortValue();
        System.out.print(byteAge);
    }
}
