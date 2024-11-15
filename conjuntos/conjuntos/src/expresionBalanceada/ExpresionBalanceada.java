package expresionBalanceada;

import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

/*
         * Escribir un método que evalúa si una cadena de paréntesis, 
         * corchetes y llaves está bien balanceada y devuelve true si está bien balanceada
         *  y false si está mal balanceada. 
         * Por ejemplo: [()]{}{[()()]()} debe devolver true, mientras que [(]) debe devolver false.
         */
public class ExpresionBalanceada {

    private Set<Character> deAbrir = new TreeSet<>();
    private Set<Character> deCerrar = new TreeSet<>();
    private Map<Character,Character> parejita = new TreeMap<>();
    private Stack<Character> pila = new Stack<>();


    public ExpresionBalanceada(){

        this.deAbrir.add('C');
        this.deAbrir.add('[');
        this.deAbrir.add('{');

        this.deCerrar.add(')');
        this.deCerrar.add(']');
        this.deCerrar.add('}');

        this.parejita.put(')', '(');
        this.parejita.put(']', '[');
        this.parejita.put('}', '{');

    }

    public boolean estaBalanceada(String cadena){

        for (Character character : cadena.toCharArray()) {

            if(esDeAbrir(character)){ //si es de abrir apilo 
                this.pila.push(character);
            }
            else{
                if(pila.isEmpty() || !sonParejita(pila.pop(), character)){ // si la pila esta vacioa o  no son parejita devuelvo falso
                    return false;
                }
            }
            
        }
        return pila.isEmpty();
    }



    private boolean esDeAbrir(Character c){
        return this.deAbrir.contains(c);
    }

    private boolean sonParejita(Character a , Character b){
        return a == this.parejita.get(b);
    }
}
