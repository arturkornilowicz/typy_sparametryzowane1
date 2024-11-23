package prv.ak.liczby;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
public class LiczbaZespolona implements Liczba {

    private double re;
    private double im;

    public LiczbaZespolona(double re) {
        this(re,0.0);
    }

    @Override
    public Liczba suma(Liczba arg) {
        LiczbaZespolona a = (LiczbaZespolona) arg;
        return new LiczbaZespolona(re+a.re, im+a.im);
    }

    @Override
    public Liczba roznica(Liczba arg) {
        LiczbaZespolona a = (LiczbaZespolona) arg;
        return new LiczbaZespolona(re-a.im, im-a.im);
    }

    @Override
    public Liczba iloczyn(Liczba arg) {
        LiczbaZespolona a = (LiczbaZespolona) arg;
        return new LiczbaZespolona(re*a.re-im*a.im,im*a.re+re*a.im);
    }

    public final static LiczbaZespolona zero = new LiczbaZespolona(0,0);

    @Override
    public String toString() {
        return re + "+" + im + "i";
    }
}
