public class PythagoreanTriplet
{
    public static void main (String [] args)
    {
        final long TARGET = 25;
        int a = 1;
        boolean isTargetFound = false;
        while (! isTargetFound)
        {
            int b = a + 1;
            while (true)
            {
                int c = (a * a) + (b * b);
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                if (Math.sqrt(c) > b && b > a && (a + b + c) == TARGET)
                {
                    isTargetFound = true;
                    break;
                }
                b++;
            }
            a++;
        }
    }
}
