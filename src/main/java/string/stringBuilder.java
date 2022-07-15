package string;

public class stringBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello!");
        sb.append(" I am Java Developer");  // Hello! I am Java Developer

        int countSb = sb.length();  // 26

        char ch = sb.charAt(5);  // !

        int index = sb.indexOf("!"); // 5
        index = sb.indexOf("!", 3); // 5
        index = sb.indexOf("9");  // -1 (not found)
        index = sb.indexOf("llo");  // 2

        String newString = sb.substring(8);  // am Java Developer
        newString = sb.substring(12, 16);  // Java

        sb.insert(6, "!");  // Hello!! I am Java Developer

        sb.delete(5, 7);  // Hello I am Java Developer
        sb.deleteCharAt(4);  // Hell I am Java Developer

        sb.reverse();  // repoleveD avaJ ma I lleH

        sb.replace(1, 2, "j");  // rjpoleveD avaJ ma I lleH
        System.out.println(sb);

    }
}
