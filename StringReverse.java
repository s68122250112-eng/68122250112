public class StringReverse {
    // อัลกอริทึมที่ 1: Recursive
    public static String reverseRecursive(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        return s.charAt(s.length() - 1) + reverseRecursive(s.substring(0, s.length() - 1));
    }

    // อัลกอริทึมที่ 2: Iterative (ใช้ StringBuilder เพื่อประสิทธิภาพ)
    public static String reverseIterative(String s) {
        if (s == null) return null;
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}

