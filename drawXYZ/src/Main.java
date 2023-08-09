public class Main {

    private static void drawXYZ(int n) {
//        membuat variable penampung
        int temp = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                temp++;

                if (temp % 3 == 0) {
                    System.out.print("X");
                } else if (temp % 2 != 0) {
                    System.out.print("Y");
                } else if (temp % 2 == 0){
                    System.out.print("Z");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        drawXYZ(3);
        drawXYZ(5);
    }
}