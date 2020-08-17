package pkP;

import pkS.Captura;

public class Principal {
    public static void main(String arg[]) throws Exception {
        Captura cap = new Captura();
        System.out.println("Metodo mixto");
        int com3, com2, com5;
        boolean comp = true;
        System.out.println("Ingresa el valor de A");
        int a;
        do {
            try {
                a = Integer.parseInt(cap.getString());
            } catch (Exception e) {
                System.err.println(e.getMessage() + "\nIngresa Numeros enteros");
                a = Integer.parseInt(cap.getString());
            }

            com2 = a % 2;
            com3 = a % 3;
            com5 = a % 5;
            if ((com2 == 0) || (com3 == 0) || (com5 == 0) || (a < 1)) {
                comp = false;
                System.out.println("Ingresa un numeros positivos, que no se divisible de 2 y 5");
            } else if ((com2 != 0) && (com3 != 0) && (com5 != 0) && (a > 0))
                comp = true;

        } while (comp != true);

        System.out.println("Ingresa el valor inicial de Xn");
        int Xn;
        do {
            try {
                Xn = Integer.parseInt(cap.getString());
            } catch (Exception e) {
                System.err.println(e.getMessage() + "\nIngresa Numeros enteros");
                Xn = Integer.parseInt(cap.getString());
            }
            if (Xn < 1) {
                comp = false;
                System.out.println("Ingresa numeros positivos");
            } else if (Xn > 0) {
                comp = true;
            }
        } while (comp != true);

        int AuxiliarXn = Xn;
        int Xn2;
        System.out.println("Ingresa el valor de C");
        int c;
        do {
            try {
                c = Integer.parseInt(cap.getString());
            } catch (Exception e) {
                System.err.println(e.getMessage() + "\nIngresa Numeros enteros");
                c = Integer.parseInt(cap.getString());
            }
            if (c < 1) {
                comp = false;
                System.out.println("Ingresa numeros positivos");
            } else if (c > 0) {
                comp = true;
            }
        } while (comp != true);
        System.out.println("Ingresa el valor del modulo");
        int m;
        boolean mC = true;
        do {
            try {
                m = Integer.parseInt(cap.getString());
            } catch (Exception e) {
                System.err.println(e.getMessage() + "\nIngresa Numeros enteros");
                m = Integer.parseInt(cap.getString());
            }
            if ((m < a) || (m < Xn) || (m < c) || (m < 1)) {
                mC = false;
                System.out.println("El modulo debe ser positivo y mayor que a, Xn y c");
            } else if ((m > a) && (m > Xn) && (m > c) && (m > 0))
                mC = true;
        } while (mC != true);

        int i = 0;
        System.out.println("______________________________________________________________");
        System.out.println("     n° " + "  Xn " + "    (" + "(" + a + " * " + "Xn" + ")" + "+" + c + ")" + " mod " + m
                + "      Xn+1");
        System.out.println("______________________________________________________________");
        do {
            System.out.println("     " + (i) + "    " + Xn + "         " + ((a * Xn) + c) + " mod " + m
                    + "             " + (((a * Xn) + c) % m));
            System.out.println("______________________________________________________________");
            i++;
            Xn2 = ((a * Xn) + c) % m;
            Xn = Xn2;
        } while (Xn != AuxiliarXn);
        System.out.println("     " + (i) + "    " + Xn + "         " + ((a * Xn) + c) + " mod " + m + "             "
                + (((a * Xn) + c) % m));
        System.out.println("______________________________________________________________");
    }
}