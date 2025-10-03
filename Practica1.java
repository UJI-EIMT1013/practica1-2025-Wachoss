package Practica1;

import java.util.*;

public class practica1 {

    //EJERCICIO 1
    public static Set<Integer> multiplos (Iterator<Integer> it) {
        Set<Integer> multiplos = new HashSet<>();
        Set<Integer> visitados = new HashSet<>();
        while(it.hasNext()){
            Iterator<Integer> itVisitados = visitados.iterator();
            int posibleMultiplo = it.next();
            while(itVisitados.hasNext()){
                int numeroVisitado = itVisitados.next();
                if(posibleMultiplo != 0 && numeroVisitado != 0){
                    if(posibleMultiplo % numeroVisitado == 0) {
                        multiplos.add(posibleMultiplo);
                    } else if(numeroVisitado % posibleMultiplo == 0){
                        multiplos.add(numeroVisitado);
                    }
                } 
            }
            visitados.add(posibleMultiplo);
        }
        return multiplos;
    }

    //EJERCICIO2
    public static void separate (Set<Integer> cuadrados, Set<Integer> noCuadrados)  {
        Set<Integer> todos = new HashSet<>();
        todos.addAll(cuadrados);
        todos.addAll(noCuadrados);

        Set<Integer> nuevosCuadrados = new HashSet<>();

        for (int n :todos){
            if (n < 0) continue;
            int sqroot = (int) Math.sqrt(n);
            if (sqroot * sqroot == n && todos.contains(sqroot)){
                nuevosCuadrados.add(n);
            } 
        }
        cuadrados.retainAll(nuevosCuadrados);
        cuadrados.addAll(nuevosCuadrados);
        noCuadrados.removeAll(nuevosCuadrados);
        
    }


    //EJERCICIO 3
    public static<T> Collection<Set<T>> divideInSets (Iterator<T> it) {
        //TODO
        return null;
    }

    //EJERCICIO 4
    public static<T> Collection<Set<T>> coverageSet2 (Set<T> u,ArrayList<Set<T>> col) {
        //TODO
        return null;
    }



}

