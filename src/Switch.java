public class Switch {
    public static void main(String[] args) {
//        String nilai = "C";
//
//        switch(nilai){
//            case "A":
//                System.out.println("Anda lulus");
//                break;
//            case "B":
//                System.out.println("Anda lulus, namun harus giat belajar lagi");
//                break;
//            case "C":
//                System.out.println("Anda tidak lulus");
//                break;
//            default:
//                System.out.println("Anda lulus");
//        }
//        Switch Lambda
//        String nilai = "E";
//        switch(nilai){
//            case "A" -> System.out.println("Anda lulus dengan baik");
//            case "B","C" -> System.out.println("Anda lulus");
//            case "D" -> System.out.println("Anda tidak lulus");
//            default -> {
//                System.out.println("Remidi");
//            }
//        }
//        Switch Tanpa Yield
//        String nilai = "A";
//        String ucapan;
//        switch(nilai){
//            case "A" -> ucapan = "Anda lulus dengan baik";
//            case "B","C" -> ucapan = "Anda lulus";
//            case "D" -> ucapan = "Anda tidak lulus";
//            default -> ucapan = "Anda lulus dengan baik";
//        }
//        System.out.println(ucapan);
        String nilai = "E-";
        String ucapan = switch(nilai){
            case "A":
                yield "Anda lulus dengan sempurna";
            case "B","C":
                yield "Anda lulus";
            case "D":
                yield "Anda tidak lulus";
            default:
                yield "Remidi....";
        };
        System.out.println(ucapan);
    }
}
