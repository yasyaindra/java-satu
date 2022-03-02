public class Methods {
    public static void main(String[] args) {
//        int[] values = {30,30,30};
        sayCongrats("Indra", 80,90,80,100);
    }

//    static int sum(int a, int b){
//        var result = a +b;
//        return result;
//    }
//    Method dengan Variabel
//    static void sayCongrats(String name, int[] values){
//        int total = 0;
//        for(var value:values){
//            total += value;
//        }
//        int finalValue = total / values.length;
////        System.out.println(finalValue);
//        if(finalValue >= 75){
//            System.out.println("Selamat "+name+", Anda lulus");
//        } else {
//            System.out.println("Remidi");
//        }
//    }
    static void sayCongrats(String name, int... values){
        System.out.println(name);
        System.out.println(values[0]);
    }
}
