// import java.util.Random;
// Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
// de 2 dígitos, etcétera (hasta 5 dígitos).
public class App {
    public static void main(String[] args) throws Exception {
        // || se usa eso para parsear
        int tam = (int) Math.round(1 + (Math.random() * 100));
        int[] vec = new int[tam];
        Rellenar(vec);
        Cuantos(vec);
    }

    public static void Cuantos(int[] vec) {
        int uni = 0, dec = 0, cen = 0, mil = 0;

        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);

            

            if (Integer.toString(vec[i]).length() == 4) {
                mil += 1;
                continue;
            } else if (Integer.toString(vec[i]).length() == 3) {
                dec += 1;
                continue;
            } else if (Integer.toString(vec[i]).length() == 2) {
                cen += 1;
                continue;
            } else {
                uni += 1;
                continue;
            }
        }

        System.out.println("Hay " + mil + " miles");
        System.out.println("Hay " + dec + " decenas");
        System.out.println("Hay " + cen + " centenas");
        System.out.println("Hay " + uni + " unidades");
    }

    public static void Rellenar(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int) Math.round(1 + (Math.random() * 9999));
        }
    }
}
