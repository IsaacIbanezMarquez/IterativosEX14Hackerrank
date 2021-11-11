
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



// ENUNCIADO:

// La creu:

/* Continuant mab la idea de les figures ara li toca a la creu. Demana un nombre N enter senar i dibuixa una creu com la que es mostra a continuació per N=5:

*
N ha de ser un nombre imparell i positiu sinó sortirà el següent missatge d'error:"N ha de ser imparell i positiu"

Input Format

N enter.

Constraints

N ha de ser imparell i positiu

Output Format

Creu d'asteriscs.

Sample Input 0

5
Sample Output 0

*       *
  *   *
    *
  *   *
*       *
Sample Input 1

4
Sample Output 1

N ha de ser imparell i positiu

 */















public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int filas = N;

        if (N < 0 || N % 2 == 0){System.out.println("N ha de ser imparell i positiu");}
        else
        {
            while (filas != 0)
            {
                int columnas = N;

                while(columnas != 0)
                {
                    if ((filas == 1 || filas == N)  && (columnas == 1 || columnas == N))
                    {
                        System.out.print("* ");
                    }
                    else if (filas == columnas)
                    {
                        System.out.print("* ");
                    }
                    else if (N - filas + 1 == columnas)
                    {
                        System.out.print("* ");
                    }



                    else {System.out.print("  ");}
                    columnas--;
                }


                filas--;
                System.out.println("");
            }

        }









    }
}
