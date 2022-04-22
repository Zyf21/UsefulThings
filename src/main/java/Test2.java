import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {

        System.out.println(anno("пила", "липа"));
        System.out.println(palindrom("шалаш"));

    }


    private static boolean anno (String first, String second){
        char[] firstArr = first.toCharArray();
        Arrays.sort(firstArr);

        char[] secondArr = second.toCharArray();
        Arrays.sort(secondArr);
        System.out.println(new String(firstArr));
        System.out.println(new String(secondArr));

        return  Arrays.equals(firstArr, secondArr);

    }
    public String sort(String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    public boolean permutation (String s,String t) {
        if (s.length() != t.length()) {
            return false;
        }
        return sort(s).equals(sort(t));
    }

    private static boolean palindrom(String pali) {
        String result = new StringBuilder(pali).reverse().toString();
        if (pali.equals(result)) {
            return true;
        }
        return false;
    }
}
