package classes;

import main.Main;

public class Output<T> extends Main
{


    public static <T> void print(T... t)
    {
        for (T element : t)
        {
            System.out.print(element);
        }

    }
}
