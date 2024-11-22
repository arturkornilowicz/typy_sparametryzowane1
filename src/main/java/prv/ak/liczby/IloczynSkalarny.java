package prv.ak.liczby;

import java.util.*;

public class IloczynSkalarny<T extends Liczba> {

    private List<T> v1;
    private List<T> v2;
    private T zero;

    public IloczynSkalarny(List<T> v1, List<T> v2, T zero) {
        this.v1 = v1;
        this.v2 = v2;
        this.zero = zero;
    }

    public T iloczynSkalarny() {
        Liczba wynik = zero;

        for (int i = 0; i < v1.size(); i++) {
            wynik = wynik.suma(v1.get(i).iloczyn(v2.get(i)));
        }

        return (T)wynik;
    }
}
