package javaCourseClasses.mathClass;

public class mathClass {
    public static void main(String[] args) {
        System.out.println( "math abs(): "+Math.abs(-99));//convert  negative value to positive in integer;
        System.out.println("math ceil(): "+Math.ceil(89.7));//round-up like (99.8 convert to 100)
        System.out.println("math floor(): "+Math.floor(99.5));//round-down like (99.5 convert to 99.0)
        System.out.println("math round(): "+Math.round(45.9));//round to nearest integer like(45.9 convert to 46)
        System.out.println("math max(): "+Math.max(4,5));// return max value
        System.out.println("math min(): "+Math.min(6,2));//return min value
        System.out.println("math pow(): "+Math.pow(2,8));//power calculation
        System.out.println("math sqrt(): "+Math.sqrt(5));//square-root
        for(int i =1;i<=5;i++){//create random number and also modify according to usage
            int random =(int) Math.round(Math.random()*100);
            System.out.println("random number "+i+" : "+random);
        }
        System.out.println();
    }

}
