package cardealersystem;

import java.util.ArrayList;
import java.util.List;

public class Parts {
    private static List<Part> parts = new ArrayList<>();

    public static void seedParts() {
        for (int i = 0; i < 5; i++) {
            Part temp = new Part( 0 + i, "parts # " + i, 10 + i, "country " + i);
            parts.add(temp);
        }
    }

    public static Part findPart(int id) {
        for (Part p :
                parts) {
            if (p.getPartID() == id) {
                return p;
            }
        }
        return null;
    }
}
