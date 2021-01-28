public class TestUtils {

    static String arrayToString(Object[] array){
        String result="";

        for (Object a:array
        ) {
            result+=a.toString()+" ";
        }

        return result;
    }
    static String arrayToString(int[] array){
        String result="";

        for (int a:array
        ) {
            result+=a+" ";
        }

        return result;
    }
}
