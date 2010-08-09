/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dato;
import java.util.Random;




/**
 *
 * @author Minerva Verdugo Ruiz
 */
public class RandonFicha {

int n;

public void RandonFicha(){

    Ficha ficharandom= new Ficha();
    Random generator2 = new Random();
    int randomIndex2;


    for (int i=1; i<29; i++){

        ficharandom.CrearFichas().get(i);
        randomIndex2 = generator2.nextInt( 6);


    }

//shuffle


//    int randomIndex = generator.nextInt( 6);
//
//Random generator2 = new Random();
//int randomIndex2 = generator2.nextInt( 6);
//
//for (int i=1; i<7; i++){
//    System.out.println(randomIndex + "/");
//}
//
//
//
//
//
//}

}
}
