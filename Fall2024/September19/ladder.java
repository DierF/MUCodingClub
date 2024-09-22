import java.util.Scanner;

public class ladder
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int wall = sc.nextInt();
        int theta = sc.nextInt();

        //          |\
        //          | \
        //          |  \
        //          |   \   Hypotenuse(ladder)
        // Opposite |    \
        // (wall)   |     \
        //          |_____θ\
        //           Adjacent
        //
        //  sin(θ) = Opposite / Hypotenuse
        //  => Hypotenuse = Opposite / sin(θ)
        //  -> ladder = wall / sin(θ)

        // Note: Math.sin() takes the angle as radian, not degree!
        double ladder = (double)wall / Math.sin(Math.toRadians(theta));

        // round up to the nearest integer
        int result = (int)Math.ceil(ladder);

        System.out.println(result);
    }
}
