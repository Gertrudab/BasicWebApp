package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("your name")) {
           return "Gertruda";
        } else if (query.contains("plus")){
            int start = query.indexOf("is") + 3;
            int plus = query.indexOf("plus") + 5;
            String first = query.substring(start, plus - 6);
            String second = query.substring(plus);
            int f = Integer.parseInt(first);
            int s = Integer.parseInt(second);
            return Integer.toString(f + s);
        } else if (query.contains("is the largest")) {
            query = query.replaceAll("[^\\d]", " ");
            query = query.trim();
            String[] values = query.split(" ");
            int[] integers = new int[values.length];
            for (int i = 0; i < integers.length; i++) {
                integers[i] = Integer.parseInt(values[i].trim());
            }
            return "";
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        QueryProcessor processor = new QueryProcessor();
        System.out.println(processor.process(" what is 2 plus 10"));
    }
}
