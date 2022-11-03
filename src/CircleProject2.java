import java.util.Scanner;
public class CircleProject2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What number would you like to input to find the last remaining standing?");
        int x = s.nextInt();
        int p = 0;
        int g = 0;
        int h = 1;
        int f = x - (int)Math.pow(2,p);
        while (x>0)
        {
            while (f>0)
            {
                p = p+1;
                f = x-(int)Math.pow(2,p);
                if ((f <= 0))
                {
                    p = p-1;
                    while (g != (x-(int)Math.pow(2,p)))
                    {
                        h = h + 2;
                        g = g+1;
                        if (g == (x-(int)Math.pow(2,p)))
                        {
                            System.out.println("The last one standing is:" + h);
                        }
                    }
                }
            }
        }
    }
}
