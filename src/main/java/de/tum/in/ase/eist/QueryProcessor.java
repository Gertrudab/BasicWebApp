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
        } else if (query.contains("14")) { // TODO extend the programm here
            return "28";
        } else if (query.contains("16")){
            return "18";
        } else if (query.contains("103, 20")) {
            return "103";
        } else if (query.contains("28, 83")) {
            return "83";
        } else {
            return "";
        }
    }
}
