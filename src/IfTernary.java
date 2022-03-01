public class IfTernary {
    public static void main(String[] args) {
        String ucapan;
        int nilai = 80;
        Boolean status = false;
        ucapan = nilai>60 && status ? "Selamat, kamu lulus diatas KKM" : "Silahkan remidi";
        System.out.println(ucapan);
    }
}
