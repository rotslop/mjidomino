/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dato;

/**
 *
 * @author Javy
 */
/**
 ******************************************************************
                   Archivo: CompararApellido.java
                       -------------------
    copyright            : (C) 2009 by Ing. Ricardo  Casanova N.
    email                : rcasanov@ucab.edu.ve
 *******************************************************************
 Esta clase permite generar el filtro comparator para la colección
 *******************************************************************
 */

import java.util.*;


/*
 * Esta clase implementa la interfaz Comparator, que permite establecer
 * un filtro para el ordenamiento de la colección de estudiantes por apellido
 */
public class CompararID implements Comparator
{

    /*
     * Se implementa el método compare de la interfaz Comparator, que recibe como
     * parámetro dos objetos de tipo Object (los objetos que serán comparados)
     */
    public int compare(Object primerObjeto, Object segundoObjeto)
    {
        /*
         * Se genera una comparación entre los apellidos de los objetos
         */

        Partida PrimerObjetoPartida = (Partida) primerObjeto;
        Partida SegundoObjetoUsuario = (Partida) segundoObjeto;

        String IDPrimerObjeto = PrimerObjetoPartida.getID();
        String IDSegundoObjeto = SegundoObjetoUsuario.getID();

        int resultado = IDPrimerObjeto.compareTo(IDSegundoObjeto);

        /*
         * Si resultado es igual a cero, es porque se trata del mismo objeto
         */
        if (resultado == 0)
            return 0;
        /*
         * Si el apellido del primer objeto es mayor que el apellido del segundo, se
         * devuelve -1, con lo cual el primer objeto será ingresado en la colección
         * antes que el segundo
         */
        if (resultado <= 0)
            return -1;
        /*
         * Si el apellido del primer objeto es menor que el apellido del segundo, se
         * devuelve 1, con lo cual el primer objeto será ingresado en la colección
         * después que el segundo
         */
        return 1;
    }
}

