package prv.ak.liczby;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
public class LiczbaWymierna implements Liczba {

    private int licznik;
    private int mianownik;

    public LiczbaWymierna(int licznik) {
        this(licznik,1);
    }

    @Override
    public Liczba suma(Liczba arg) {
        LiczbaWymierna a = (LiczbaWymierna) arg;
        return new LiczbaWymierna(licznik*a.mianownik + mianownik*a.licznik, mianownik*a.mianownik);
    }

    @Override
    public Liczba roznica(Liczba arg) {
        LiczbaWymierna a = (LiczbaWymierna) arg;
        return new LiczbaWymierna(licznik*a.mianownik - mianownik*a.licznik, mianownik*a.mianownik);
    }

    @Override
    public Liczba iloczyn(Liczba arg) {
        LiczbaWymierna a = (LiczbaWymierna) arg;
        return new LiczbaWymierna(licznik*a.licznik, mianownik*a.mianownik);
    }

    public final static LiczbaWymierna zero = new LiczbaWymierna(0,1);

    @Override
    public String toString() {
        return licznik + "/" + mianownik;
    }
}
