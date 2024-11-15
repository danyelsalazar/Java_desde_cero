package entrenadores;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*Nos contrata un club para consolidar información. Actualmente cada entrenador
registra en un diccionario dicciEntrena (un diccionario), en una entrada bajo su 
nombre, una lista con todos los socios atendidos ese mes. El club quiere obtener
un listado de todos los socios que entrenan (ordenados por nombre) en donde consten
todos los entrenadores con los que estuvo cada uno (también ordenados por nombre de entrenador).
Por ejemplo, si dicciEntrena, en la clave “Bielsa” contiene la lista [“Juan”, “Alberto”],
y en la clave “Alvarez” contiene la lista [“Tom”, “Alberto”, “Vero”], el resultado debe 
ser otro diccionario de la forma:
“Alberto”, “Alvarez”, “Bielsa”
“Juan”, “Bielsa”
“Tom”, “Alvarez”
“Vero”, “Alvarez” 

 */
public class Entrenadores {
    public Map<String, List<String>> entrenadosPor(Map<String, List<String>> entrenadores){

        TreeMap<String, List<String>> entrenados = new TreeMap<>();

        //recorremos el mapa
        for (Map.Entry<String, List<String>> entry : entrenadores.entrySet()) {
            String entrenador = entry.getKey();
            List<String> socios = entry.getValue();
            for (String socio : socios) {
                List<String> l; 
                /* -----forma 1-----
                if(entrenados.containsKey(socio)){
                    l = entrenados.get(socio);
                }else{
                    l = new LinkedList<>();
                }
                l.add(entrenador)
                entrenados.put(socio, l);
                */
                //-----forma dos: ------
                l = entrenados.getOrDefault(socio, new LinkedList<String>()); //si entrenados contiene la clave nos devuelve el valor y si no nos devuelve el segundo parametro que le pusimos en estre caso una lista de string
                l.add(entrenador);
                entrenados.put(socio, l);
            }

        }

        return entrenados;

    }
}
