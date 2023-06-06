public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[][] mat = new int[3][3];

        Rellenar(mat);
        ShowMat(mat);
        mat = Turn(mat);
        System.out.println("///////////////////////////////////");
        ShowMat(mat);
    }

    public static int[][] Turn(int[][] mat) {
        int[][] newMat = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3 ; j ++){
                newMat[i][j] = mat[j][i];
            }
        }
        return newMat;
    }

    public static void Rellenar(int[][] mat) {
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3 ; j ++){
                mat[i][j] = (int) Math.round(1 + (Math.random() * 9));
            }
        }
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
