import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        ListasGenericas<Integer> lg = new ListasGenericas<>();

        List<Integer> l1 = new ArrayList<>(List.of(1, 2, 3, 4, 5,6,7,8,9));
        List<Integer> l2 = new ArrayList<>(List.of(-1, -2, -3, -4, -5, -6, -7, -8, -9));
        List<Integer> l3 = Arrays.asList(5,5,5,5,5);


        ListasGenericas<String> lgs = new ListasGenericas<>();

        List<String> l4 = Arrays.asList("Ana", "Laura");
        List<String> l5 = Arrays.asList("Ana", "Avril");


        System.out.println(lg.sonTodasMayoresForma1(l1, l2));
        System.out.println(lg.sonTodasMayoresForma1(l1, l3));

        System.out.println(lg.todosDeMayorAMenorSinRepetirSet(l1, l2));

        System.out.println(lgs.todosDeMayorAMenorSinRepetirSet(l4, l5));

    }
}
