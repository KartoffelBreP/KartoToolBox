package io;
public abstract class Output<T>
{
    public static <T> void print(T... t)
    {
        for (T element : t)
        {
            System.out.print(element);
        }
    }
}
