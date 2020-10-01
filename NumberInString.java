public class NumberInString {
    public static void main(String[] args) {
        new NumberInString().program();
    }

    public void program() {
        String s = "Well im 18 years old";
        System.out.println(findNumber(s));
    }

    public int findNumber(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
