package utils;

import java.util.*;

public class CodeGenerator {
    
    public static String generateMK() {
        return "MK" + System.currentTimeMillis();
    }

    public static String generateNIM() {
        Random rand = new Random();
        int number = rand.nextInt(900000000) + 100000000;
        return String.valueOf(number);
    }

}
