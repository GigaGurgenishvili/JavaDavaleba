package No5.A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args)
    {
        List<String> strings = new ArrayList<>();
        List<Integer> roundNumbers = new ArrayList<>();

        Map<Integer, String> combo = new HashMap<>();

        for (int i = 0; i < 10; i++)
        {//generate random input
            roundNumbers.add((int)(((Math.random() * 10))));
            strings.add("შესატყვისია ნომერი: " + roundNumbers.get(i) + "-სთვის");
        }

        for (Integer i: roundNumbers)
        {//put values in combo
            combo.put(i, strings.get(roundNumbers.indexOf(i)));
        }

        for (Map.Entry<Integer, String> pair: combo.entrySet())
        {//print result
            System.out.println(pair.getKey().toString() + " " + pair.getValue().toString());
        }
    }
}
