public class unoaldiez {
    public static void main(String[] args) {

        System.out.println("Números del 1 al 10:");
        for (int num = 1; num <= 10; num++) {
            for (int i = 0; i <= 10; i++) {
                int rta = (i * num);
                System.out.println(num + "x" + i + "=" + (rta));
            }
        }
    }
}
