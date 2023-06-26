// Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
// suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
// permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
// El programa deberá comprobar que los números introducidos son correctos, es decir,
// están entre el 1 y el 9.

public class App {
    public static void main(String[] args) throws Exception {
      int[][] magic = new int[3][3];

        Rellenar(magic);
        ShowMat(magic);
        EsMagica(magic);

        if(EsMagica(magic)){
            System.out.println("Es magica");
        } else {
            System.out.println("No es magica");
        }
    }

    public static boolean EsMagica(int[][] mat){
        boolean retorno = true;
        int total = 0;
        int uno = 0, dos = 0, tres = 0;

        //saca la suma de las tres filas y de cada una por separado
        for(int i = 0; i < 3 ; i++){
            total = total + mat[i][i];
            uno = uno + mat[i][i];
            total = total + mat[i][0];
            dos = dos + mat[i][0];
            total = total + mat[1][i];
            tres = tres + + mat[1][i];
        }

        if(total / 3 != uno){
            retorno = false;
            return retorno;
        } else if (total / 3 != dos) {
            retorno = false;
            return retorno;
        }else if (total / 3 != tres) {
            retorno = false;
            return retorno;
        } else {
            return retorno;
        }
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
