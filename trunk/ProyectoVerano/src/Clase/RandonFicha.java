/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;
import java.util.Random;




/**
 *
 * @author Minerva Verdugo Ruiz
 */
public class RandonFicha {

int n;

public void RandonFicha(){
Random generator = new Random();
int randomIndex = generator.nextInt( 6);

for (int i=1; i<7; i++){
    System.out.println(randomIndex + "/");
}

}

}
