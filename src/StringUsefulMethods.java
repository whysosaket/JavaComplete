public class StringUsefulMethods {
    public static void main(String[] args) {
        String name= " Saket ";
        boolean r= name.equals("SakeT");
        int l= name.length();
        char ch= name.charAt(3);
        int io= name.indexOf("S");
        boolean ib= name.isEmpty();
        String uc=name.toUpperCase();
        String lc= name.toLowerCase();
        String es= name.trim();             //removes all the blank spaces
        String rep= name.replace('A','I');
    }
}
