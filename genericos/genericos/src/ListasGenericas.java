import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
Escribir un método que reciba dos listas como parámetros y devuelva
true si todos los elementos de la primera son Mayores que cualquiera de
la segunda, y false en caso contrario Considere que los objetos que están
contenidos en las listas tienen órden total (Implementan Comparable y 
tienen implementado su propio equals y hashCode). 
Ejemplifica su uso mediante dos casos de prueba JUnit, uno con listas de
 Integer y otro con listas de Strings.	
public boolean sonTodosMayores(List<T> l1, List<T> l2) {...} 
*/

public class ListasGenericas<T extends Comparable<T>>{ //importante poner el tipo comparable a T para poder usar los metodos

    public boolean sonTodasMayoresForma1(List<T> l1, List<T> l2){

        Collections.sort(l1);
        T min1 = Collections.min(l1);
        T max2 = Collections.max(l2);

        return min1.compareTo(max2) > 0;
    }

    public boolean sonTodasMayoresForma2(List<T> l1, List<T> l2){

        Collections.sort(l1);
        Collections.sort(l2);

        return l1.get(0).compareTo(l2.get(l2.size()-1)) > 0;
    }


    public List<T> todosDeMayorAMenor(List<T> l1, List<T> l2){
        List<T> aux = new ArrayList<>();
        for (T t : l1) {
            aux.add(t);
        }
        for (T t : l2) {
            aux.add(t);
        }
        return aux;
    }

    public List<T> todosDeMayorAMenorSinRepetir(List<T> l1, List<T> l2){
        List<T> aux = new ArrayList<>();
        for (T t : l1) {
            if(!aux.contains(t)){
                aux.add(t);
            }
        }
        for (T t : l2) {
            if(!aux.contains(t)){
                aux.add(t);
            }
        }
        return aux;
    }

    public List<T> todosDeMayorAMenorSinRepetirSet(List<T> l1, List<T> l2){
        Set<T> set = new TreeSet<>(); // recuerda el set no permite repetidos asi que usaremos ese
        
        for (T t : l1) {
            set.add(t);
        }
        for (T t : l2) {
            set.add(t);
        }
        return new ArrayList<>(set).reversed();
    }
}

