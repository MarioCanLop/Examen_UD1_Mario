package org.example;

import javax.lang.model.util.ElementScanner6;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen {
    public void ejercicio1(){
        Scanner entrada = new Scanner(System.in);
        int prim_tri = -1 ;
        int seg_tri = -1 ;
        int terc_tri = -1;
        float resultado_sum;
        float resultado_med;

        boolean error = false;

        while (error == false) {
            try { //Hace que no acabe el programa si se añade un caracter que no se un numero
                while (prim_tri < 0 || prim_tri > 10) { //Comprueba que los numeros sean entre 0 y 10
                    System.out.println("Dame la nota del primer trimestre (0:10)");
                    prim_tri = entrada.nextInt();
                }
                while (seg_tri < 0 || seg_tri > 10) { //Comprueba que los numeros sean entre 0 y 10
                    System.out.println("Dame la nota del segundo trimestre (0:10)");
                    seg_tri = entrada.nextInt();
                }
                while (terc_tri < 0 || terc_tri > 10) { //Comprueba que los numeros sean entre 0 y 10
                    System.out.println("Dame la nota del tercer trimestre (0:10)");
                    terc_tri = entrada.nextInt();
                    error = true;
                }

            } catch (InputMismatchException er) {
                System.out.println("ERROR, Introduce un valor valido ...");
                entrada.nextLine();
            }
        }
        resultado_sum = prim_tri + seg_tri + terc_tri; //Suma las 3 notas
        resultado_med = resultado_sum / 3; //Las divide entre los 3 trimestres
        if (resultado_med >= 5){ //Comprueba que es mayor que 5 para saber si aprueba si no suspendido
            System.out.println("La media obtenida es " + resultado_med);
            System.out.println("APROBADO");
        }else {
            System.out.println("La media obtenida es " + resultado_med);
            System.out.println("SUSPENSO");
        }
    }
    public void ejercicio2(){
        Scanner entrada = new Scanner(System.in);

        int num = 0;
        int conv;
        boolean error = false;
        while(error == false){
            try {
                while(num == 0){//Comprueba que el numero no sea 0 y si es 0 vuelve a pedir el numero
                    System.out.println("Introduce un numero");
                    num = entrada.nextInt();
                    error = true;
                }
            }catch (InputMismatchException er) {
                System.out.println("ERROR, Introduce un valor valido ...");
                entrada.nextLine();
            }
        }
        if (num > 0){//Comprueba si mayor que 0 para saber si es absoluto si no lo es debe multiplicarlo por -1
            System.out.println("El valor absoluto es " + num);
        }else {
            conv = num * -1;
            System.out.println("El valor absoluto es " + conv);
        }
    }

}
