package Java;

public class pal {
    public static void main(String[] args) {
        String s1 = "raceacar";
        String s2 = "Mahesh";
        boolean b1 = isPal(s1, 0);
        boolean b2 = isPal(s2, 0);
        System.out.println(b1);
        System.out.println(b2);
    }

    public static boolean isPal(String s, int i) {
        if (i >= s.length() / 2)
            return true;
        if (s.charAt(i) != s.charAt(s.length() - i - 1))
            return false;

        return isPal(s, i + 1);
    }
}
