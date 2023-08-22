package lesson16;

import java.util.*;

public class Hw1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("Лена", "Маша", "Таня", "Антон"));
        System.out.println(c(strings));
    }
    public static String c(List<String> list)
    {
        Map<String, Integer> q = new HashMap<>();
        for (String s: list)
        {
            Integer a = q.get(s);
            if (a == null)
                q.put(s, 1);
            else q.put(s, a + 1);
        }
        Map.Entry<String,Integer> w = Collections.max(q.entrySet(), new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                return Integer.compare(e1.getValue(), e1.getValue());
            }
        });
        return w.getKey();
    }
}
