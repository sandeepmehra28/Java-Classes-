package javaChallenges.inheritance;

public class arrayOperationsTest {
    public static void main(String[] args) {
        arrayOperations array= new arrayOperations(new int[]{1,2,3,4,5,6,7,8,9});
        arrayOperations.Statistics statistics =  array. new Statistics();
        System.out.println(statistics.mean());
    }
}
