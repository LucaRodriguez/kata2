package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {1, 3, 5, 7, 9, 1, 3, 5, 7, 4, 7, 6, 5, 3, 1};
        String[] data2 ={"Pepe","Pepe","Pepe","Maria","Maria","Pedro","Juan"};
        
        Histogram meta_histogram = new Histogram(data2);
        
        Map<Integer,Integer> histogram = meta_histogram.getHistogram();
        
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println("Key = " + entry.getKey() + " Value =" + entry.getValue());
        }
    
    }
}