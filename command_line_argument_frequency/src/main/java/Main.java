import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < args.length; i++) {
            if (!map.containsKey(args[i])) {
                map.put(args[i], 1);
            } else {
                int frequency = map.get(args[i]);
                int newFrequency = frequency + 1;
                map.replace(args[i], frequency, newFrequency);
            }
        }

        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getKey()).compareTo(o2.getKey());
            }
        });

        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }

        Iterator it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

    }
}
