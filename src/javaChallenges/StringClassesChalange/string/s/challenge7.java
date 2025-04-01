package javaChallenges.StringClassesChalange.string.s;

//Take an array of words and concatenate them into a single string
//using StringBuilder.
public class challenge7 {
    public static void main(String[] args) {
        String[] arr={"this", "is", "the", "best", "and", "most", "detailed", "course",
                "on", "java", "on", "the", "internet"};
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
