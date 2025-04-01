package javaChallenges.inheritance;
//Create a class ArrayOperations with a static nested class Statistics.
//Statistics could have methods like mean(), median(), which
//operate on an array.
public class arrayOperations {//outer class
    private  int[] arrays;

    public arrayOperations(int[] arrays) {
        this.arrays = arrays;
    }

    public class Statistics{//inner class
    double mean(){
        double sum=0;
        for(int number:arrays){
            sum=+number;
        }
        return sum/arrays.length;
    }
    }

}
