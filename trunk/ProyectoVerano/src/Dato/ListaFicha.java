///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package Dato;
//
///**
// *
// * @author Javy
// */
//import java.util.*;
//
//
//
//public class ListaFicha
//{
//  //  private  <Ficha> Fichas;
//
//
//    public ListaFicha()
//    {
//       ArrayList <Ficha> Fichas = new ArrayList();
//
//       for (int i=0;i<7;i++){
//       for(int j=i;j<7;j++){
//
//         Ficha Aux= new Ficha(i,j);
//         Fichas.addElement(Aux);
//
//       }
//
//       }
//         return Fichas;
//}
//
//
//
//
//    }
//
//   public Iterator getIterator()
//    {
//        return ListaFicha.iterator();
//    }
//    /**
//     *
//     * Método public void imprimirColeccion(): Este método imprime el
//     * contenido de la colección miSet
//     */
//    public void ImprimirColeccion()
//    {
//        int i;
//        Ficha registro;
//
//        /*
//         * Se define un arreglo de tipo Object (la clase genérica Java)
//         */
//        Object [] arreglo;
//
//        /*
//         * Se convierte la colección pasada como parámetro a un array, que
//         * es asignado al arreglo de tipo Object
//         */
//        arreglo = ListaFicha.toArray();
//
//        System.out.println("DATOS");
//
//        /*
//         * Se hace un recorrido del arreglo de tipo Object y se imprime
//         * la información de la casilla i
//         */
//        for(i=0 ; i<arreglo.length ; i++)
//        {
//            registro = (Ficha) arreglo[i];
//            System.out.println("Valos interno: " + registro.setX(x);
//            System.out.println("Valos externo: " + registro.setY(y);
//            System.out.println();
//        }
//
//        System.out.println("\n\n");
//    }
//
//
//    /**
//     *
//     * Método public boolean agregarElemento(Nodo objeto): Este método agrega
//     * el Nodo "objeto" a la colección miSet
//     */
//    public boolean AgregarElemento(Ficha objeto)
//    {
//        return ListadeFicha.add(objeto);
//    }
//
//
//    /**
//     *
//     * Método public boolean removerElemento(Nodo objeto): Este método elimina
//     * el Nodo "objeto" de la colección miSet
//     */
//    public boolean RemoverElemento(Ficha objeto)
//    {
//        boolean encontrado = false;
//        Ficha auxiliar = null;
//
//        /*
//         * Se define un iterador inicializado con el iterador de la colección
//         */
//        Iterator iterador = ListaFicha.iterator();
//
//        /*
//         * Mientras no se encuentre el elemento y existan mas elementos en la
//         * colección, se sigue entrando en el ciclo
//         */
//        while (!encontrado && iterador.hasNext())
//        {
//            /*
//             *  Se obtiene el siguiente objeto del iterador y se le hace un cast
//             *  para asignarlo al objeto de tipo Nodo
//             */
//            auxiliar = (Usuario) iterador.next();
//
//            /*
//             * Se invoca al método equals de la clase Nodo para determinar si son
//             * iguales. En caso de serlo, se encontró el elemento buscado
//             */
//            //if (objeto.equals(auxiliar))
//            if (objeto.getNickname().contentEquals(auxiliar.getNickname()))
//                encontrado = true;
//        }
//
//        /*
//         * Si se encontró el elemento, se procede a ejecutar el remove
//         */
//        if (encontrado)
//        {
//            if (UsuariosRegistrados.remove(auxiliar))
//                return true;
//        }
//
//        return false;
//    }
//
//    public boolean BuscarUsuario(Usuario objeto)
//    {
//        boolean encontrado = false;
//        Usuario auxiliar = null;
//
//        /*
//         * Se define un iterador inicializado con el iterador de la colección
//         */
//        Iterator iterador = UsuariosRegistrados.iterator();
//
//        /*
//         * Mientras no se encuentre el elemento y existan mas elementos en la
//         * colección, se sigue entrando en el ciclo
//         */
//        while (!encontrado && iterador.hasNext())
//        {
//            /*
//             *  Se obtiene el siguiente objeto del iterador y se le hace un cast
//             *  para asignarlo al objeto de tipo Nodo
//             */
//            auxiliar = (Usuario) iterador.next();
//
//            /*
//             * Se invoca al método equals de la clase Nodo para determinar si son
//             * iguales. En caso de serlo, se encontró el elemento buscado
//             */
//            //if (objeto.equals(auxiliar))
//            if ((objeto.getNickname().contentEquals(auxiliar.getNickname()))&&(objeto.getClave().contentEquals(auxiliar.getClave())))
//                return true;
//
//        }
//        return false;
//    }
//}