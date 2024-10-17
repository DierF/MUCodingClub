import java.util.Scanner;

public class pizza2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        //     ________
        //    /         \
        //   /   _____   \
        //  |   /     \   |
        //  |   \     /   |
        //   \   ‾‾‾‾‾   /
        //    \_________/

        // Circle Area: PI * R^2
        // Radius for the Outer Circle: r
        // Radius for the Inner Circle: r - c

        double outer_circle_area = Math.PI * r * r;
        double inner_circle_area = Math.PI * (r - c) * (r - c);
        double percentage = inner_circle_area / outer_circle_area * 100.0;

        System.out.println(percentage);
    }
}