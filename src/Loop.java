public class Loop {
    public static String diamond(Integer number) {
        String line = "";
        for (var i = 1; i <= number; i++) {
            for (var j = 1; j <= i; j++) {
                System.out.println(line += ' ' + j);
            }
            for (var j = i; j > 1; j--) {
                System.out.println(line += ' ' + (j - 1));
            }
        }
        return line;
    }
    public static void main(String[] args) {
        System.out.println(diamond(2));
    }
}
