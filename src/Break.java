public class Break {
    public static void main(String[] args) {
//        Integer counter = 1;
//        while(true){
//            System.out.print( (counter*2) - 1 + " ");
//            counter++;
//
//            if(counter > 40){
//                break;
//            }
//        }
        for(int counter = 1;counter <= 100; counter++){
            Integer number = 34;
            if(number % counter == 0){
                continue;
            }
            System.out.println("Perulangan Ganjil-"+counter);
        }
    }
}
