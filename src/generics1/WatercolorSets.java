package generics1;

import static generics1.Sets.*;
import static generics1.Watercolors.*;

import java.util.EnumSet;
import java.util.Set;

public class WatercolorSets {

    public static void main(String[] args) {
        Set<Watercolors> set1 = EnumSet.range(BRILLIANT_RED, ROZE_MADDER);
        Set<Watercolors> set2 = EnumSet.range(ROZE_MADDER, COBALT_BLUE_HUE);
        System.out.println("set1 " + set1);
        System.out.println("set2 " + set2);
        System.out.println("union (set1, set2) " + union(set1, set2));
        Set<Watercolors> subset = intersection(set1, set2);
        System.out.println("intersection (set1, set2) " + subset);
        System.out.println("difference (set1, subset) "
                + difference(set1, subset));
        System.out.println("difference (set2, subset) "
                + difference(set2, subset));
        System.out.println("difference (set1, set2) " + difference(set1, set2));
        System.out.println("complement (set1, set2) " + complement(set1, set2));

    }
}
