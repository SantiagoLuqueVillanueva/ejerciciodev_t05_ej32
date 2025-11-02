public class App {
    public static void main(String[] args) throws Exception {
        int numeroIntroducido =Integer.parseInt(System.console().readLine("Por favor, introduzca un número entero positivo: "));

        int numero = numeroIntroducido;
        int volteado = 0;

        while (numero > 0) {
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
        }

        int numero2 = volteado;
        int sol = 0;
        int suma = 0;

        while (numero2 > 0) {
            sol = numero2 % 10;

            if (sol % 2 == 0) {
                System.out.print(sol + " ");
                suma += sol;
            }

            numero2 /= 10;
        }

        System.out.println();

        System.out.println("Suma de los digitos pares: "+suma);
    }
}
