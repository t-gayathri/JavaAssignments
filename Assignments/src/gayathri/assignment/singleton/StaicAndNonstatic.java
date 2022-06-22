package gayathri.assignment.singleton;

public class StaicAndNonstatic {
    static String str;
    //String str; - error occurs because it is non-static
    public StaicAndNonstatic(String string){
        str=string;
    }

    public static void printString(String s) {
        //compile time error: since the str is not static it is unable to access
        str=s;
        StaicAndNonstatic sc = new StaicAndNonstatic(s);
        System.out.println(sc);
    }
    public void print() {
        System.out.println(str);
    }

//    public static void main(String[] args)
//    {
//        String str = "ABCD";
//        StaicAndNonstatic obj = new StaicAndNonstatic(str);
//        obj.printString(str);
//        obj.print();
//    }

}
