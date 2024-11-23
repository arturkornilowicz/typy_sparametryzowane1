package prv.ak;

import prv.ak.liczby.*;

import java.util.List;

public class App
{
    public static void main( String[] args )
    {

        List<LiczbaWymierna> v1 = List.of(new LiczbaWymierna(1),new LiczbaWymierna(2));
        List<LiczbaWymierna> v2 = List.of(new LiczbaWymierna(1),new LiczbaWymierna(2));

        IloczynSkalarny<LiczbaWymierna> il1 = new IloczynSkalarny<>(v1,v2,LiczbaWymierna.zero);

        System.out.println(il1.iloczynSkalarny());


        List<LiczbaZespolona> z1 = List.of(new LiczbaZespolona(1),new LiczbaZespolona(2));
        List<LiczbaZespolona> z2 = List.of(new LiczbaZespolona(1),new LiczbaZespolona(2));

        IloczynSkalarny<LiczbaZespolona> il2 = new IloczynSkalarny<>(z1,z2,LiczbaZespolona.zero);

        System.out.println(il2.iloczynSkalarny());

    }
}
