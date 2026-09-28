package bai1;

import java.util.*;

public class Main {
    static void main(String[] args) {
        String string = "khang day ne khang rat dep trai ne";
        String[] words = string.split(" ");
        Map<String,Integer> wordMap = new HashMap<>();

        for (String word : words){
            if (wordMap.containsKey(word)){
                wordMap.put(word,wordMap.get(word)+1);
            }else {
                wordMap.put(word,1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        System.out.println("Danh sach tu va tan suat:");

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(
                    entry.getKey() + " : " + entry.getValue()
            );
        }
    }
}
