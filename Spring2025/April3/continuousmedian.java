import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class continuousmedian
{
    public static void main(String[] banana) throws IOException
    {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        
        int test_case = Integer.parseInt(console.readLine());
        for (int t = 0; t < test_case; t++)
        {
            Queue<Long> left = new PriorityQueue<>(Comparator.reverseOrder()); // max heap
            Queue<Long> right = new PriorityQueue<>(); // min heap
            
            long result = 0;

            console.readLine();
            String[] data = console.readLine().split(" ");
            for (int i = 0; i < data.length; i++)
            {
                // always push into left
                left.add(Long.parseLong(data[i]));

                // make sure all elements in left half is smaller than all elements in right half
                if (!left.isEmpty() && !right.isEmpty() && left.peek() > right.peek())
                {
                    right.add(left.poll());
                }
                
                // make sure elements are evenly put into two halves
                if (left.size() > right.size() + 1)
                {
                    right.add(left.poll());
                }
                else if (right.size() > left.size())
                {
                    left.add(right.poll());
                }

                // add median
                if (left.size() == right.size())
                {
                    result += (left.peek() + right.peek()) / 2;
                }
                else
                {
                    result += left.peek();
                }
            }
            
            System.out.println(result);
        }
    }
}