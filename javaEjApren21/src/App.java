// Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
// 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
// dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
// que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
// menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
// columna de la matriz M en la cual empieza el primer elemento de la submatriz P.

public class App {
    public static void main(String[] args) throws Exception {
        int[][] matDiez = new int[10][10];
        int[][] matTres = new int[3][3];

        Rellenar(matDiez, 10);
        ShowMat(matDiez, 10);
        Rellenar(matTres, 3);
        ShowMat(matTres, 3);
    }

    public static void Contains(int[][] matDiez, int[][] matTres){

        //estos for mueven los limites de la matriz mas grande
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                //

                //aca haria los dos for para recorrer y comparar corriendo los limites con los bucles de arriba
            }
        }
    }

    public static void Rellenar(int[][] mat, int tam) {
        for (int i = 0; i < tam; i++) {
            for(int j = 0; j < tam ; j ++){
                mat[i][j] = (int) Math.round(1 + (Math.random() * 99));
            }
        }
    }

    public static void ShowMat(int[][] vec, int tam) {
            for(int i = 0; i < tam ; i ++){
                for(int j = 0; j < tam ; j ++){
                    System.out.print(" "+vec[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("");
    }
}