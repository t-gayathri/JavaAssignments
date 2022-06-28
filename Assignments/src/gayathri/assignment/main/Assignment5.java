package gayathri.assignment.main;

import gayathri.assignment.data.DefaultInitialization;
import gayathri.assignment.singleton.StaicAndNonstatic;

public class Assignment5 {
    public static void main(String[] args) {
        DefaultInitialization defaultInitialization = new DefaultInitialization();
        defaultInitialization.printValues();
        defaultInitialization.displayValues();
        StaicAndNonstatic staicAndNonstatic = new StaicAndNonstatic("string");
        staicAndNonstatic.print();
    }
}
