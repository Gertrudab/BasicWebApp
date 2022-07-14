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
            query = query.replaceAll("[^\\d]", " ");
            query = query.trim();
            String[] values = query.split(" ");
            int[] integers = new int[values.length];
            integers[0] = Integer.parseInt(values[0].trim());
            integers[1] = Integer.parseInt(values[1].trim());
            return Integer.toString(integers[0] + integers[1]);
        } else {
            return "";
        }
    }
}
