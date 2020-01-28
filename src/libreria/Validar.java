package libreria;


import java.util.Scanner;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Validar {

public static float validarFloatPositivo(){
Scanner sc = new Scanner(System.in);    
float valor;
do {
    System.out.println("Introduce un numero");
 valor = sc.nextFloat();
} while(valor<=0);
return valor;
}

    
}
