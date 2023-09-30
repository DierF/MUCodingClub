import java.util.Scanner;

public class halfacookie
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextDouble())
        {
            double r = sc.nextDouble();

            double x = sc.nextDouble();
            double y = sc.nextDouble();

            double d = Math.sqrt(x * x + y * y);

            if (d > r)
            {
                System.out.println("miss");
                continue;
            }

            double a = Math.acos(d / r);

            double circle_area = Math.PI * r * r;

            double area = (a / (2.0 * Math.PI)) * circle_area;

            area -= 0.5 * d * Math.sqrt(r * r - d * d);

            area *= 2.0;

            System.out.println((circle_area - area) + " " + area);
        }

        sc.close();
    }
}
