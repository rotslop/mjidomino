/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dato;
import java.util.*;
import java.util.Vector;
import java.util.Collections;
/**
 *
 * @author Minerva Verdugo Ruiz
 */
public class Ficha {

 private int x; //parte inferior
 private int y;//  parte superior

 public Ficha (){
     this.x=0;
     this.y=0;
 }

    public Ficha(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

 public Vector <Ficha>  CrearFichas (){
 
 Vector <Ficha> Fichas = new Vector();

for (int i=0;i<7;i++){
for(int j=i;j<7;j++){

Ficha Aux= new Ficha(i,j);
Fichas.addElement(Aux);

    }

     }
return Fichas;
}

//System.out.println(" " + Aux);

}



