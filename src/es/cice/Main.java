package es.cice;

import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        AlmacenarNumero almacen= new AlmacenarNumero();
        int x;
        do {
            out.println("SELECCIONE OPCION");
            out.println("1. Guardar numero");
            out.println("2. Recuperar numero");
            out.println("0. Salir");
            x = sc.nextInt();
            switch (x){
                case 1:
                    out.println("Introduzca numero");
                    int num = sc.nextInt();
                    almacen.guardarNumero(num);
                    break;
                case 2:
                    List<Integer> numeros = almacen.recuperarNumero();
                    for (int n : numeros) {
                        out.println(n);
                    }
                    break;
                case 0:
                    almacen.close();
                    break;
            }

        }while(x!=0);

    }
}
