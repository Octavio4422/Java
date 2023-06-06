

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static void ShowMat(int[][] vec) {
        for(int i = 0; i < 3 ; i ++){
            for(int j = 0; j < 3 ; j ++){
                System.out.print(vec[i][j]);
            }
            System.out.println("");
        }
    }
}
