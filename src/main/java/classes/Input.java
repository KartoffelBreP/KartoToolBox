package classes;

import main.Main;

import java.util.Scanner;

public class Input extends Main
{
    public static <T> String input(T... t)
    {
        Scanner scan=null;
        String input=null;
        for (T e : t)
        {
            if(e==null)
            {
                if (scan == null)
                {
                    scan = new Scanner(System.in);
                    input=scan.nextLine();
                    continue;
                }
                else
                {
                    System.out.print(input);
                    continue;
                }
            }
            System.out.print(e);
        }

        return input;
    }
}
