public class DrawATriangle {
    
    static char a = '*';
    public static void main(String[] args) {
        // i show line
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.println(a);
                //System.out.println("\n");
            }
            System.out.println("\n");
        }
    }
}
