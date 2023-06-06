import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner leer = new Scanner(System.in);

        int num;
        int count = 0;
        int total = 0;
        do {
            count += 1;
            System.out.println("ingrese un numero");
            num = leer.nextInt();
            if (num == 0) break;
            else if (num > 0) total += num;
            else continue;
        } while(num != 0 && count < 20);

        if (count == 0) {
            System.out.println("Pero sos capo como vas a meter el 1 de primero?");
        } else {
            System.out.println("La suma total es de: " + total);
        }
    }
}
