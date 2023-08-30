import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class hardwoodspecies
{
    public static void main(String[] args) throws IOException
    {
        //Scanner is too slow for this problem
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map   = new HashMap<>();
        int                      total = 0;

        String name = reader.readLine();

        while (name != null)
        {
            var count = map.getOrDefault(name, 0) + 1;
            
            map.put(name, count);
            ++total;

            name = reader.readLine();
        }

        ArrayList<String> names = new ArrayList<>(map.keySet());
        Collections.sort(names);
        
        for (String key : names)
        {
            var    count      = map.get(key);
            double percentage = 100.0 * count / total;

            System.out.println(key + " " + percentage);
        }

    }
}

