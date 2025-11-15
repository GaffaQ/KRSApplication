package utils;

import java.util.*;

public class CodeGenerator {
    
    public static String generateMK() {
        // "MK-1298"
        return "MK" + (new Random().nextInt(9000) + 1000);
    }

}
