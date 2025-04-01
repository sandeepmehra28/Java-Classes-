package javaChallenges.Collections;
//Write a method concatenate Strings that takes variable arguments
//of a String type and concatenates them into a single string
 class challenge2 {
     public static void main(String[] args) {
         System.out.println(concatenate("sandeep","mehra"));
         System.out.println(concatenate("sonu","yadav"));
         System.out.println(concatenate("sachin","yadav"));
     }
    public static String concatenate(String... ccn){
        StringBuilder str = new StringBuilder();
        for(String n: ccn){
            str.append(n).append(" ");
        }
        return str.toString();
    }
}
