package javaCourseClasses.patterns;

class pattren{
    void pa(){
        for(int i = 1;i<=5;i++){for(int j = 5;j>=i;j--){
                System.out.print("* ");}System.out.println();}
    }
    void pa1(){
        for (int i = 1; i <= 5; i++) {for (int j = 1; j <= i; j++) {
            System.out.print("* ");}
            System.out.println();}
        for (int i = 1; i <= 4; i++) {for(int j = 4;j>=i;j--){
                System.out.print("* ");}System.out.println();}
    }
    void pa2(){
        for(int i=1;i<=5;i++){for (int j = 4;j>=i;j--){
                System.out.print(" ");}
            for (int k = 1;k<=i;k++){
                System.out.print("*");}
                System.out.println();}
    }
}
