package javaCourseClasses.controlStatments_MathAndString;

class Days {

    public void we(int day) {//two types for declaring the switch statement this is the first type
        switch (day) {
            case 1:
                System.out.print("monday");
                break;
            case 2:
                System.out.print("tuesday");
                break;
            case 3:
                System.out.print("wednesday");
                break;
            case 4:
                System.out.print("thursday");
                break;
            case 5:
                System.out.print("friday");
                break;
            case 6:
                System.out.print("saturday");
                break;
            case 7:
                System.out.print("sunday");
                break;
            default:
                System.out.print("not valid in this program..!");
        }
     }


}
class Days1{
    public void we1 (int day){
        String output = switch (day){//this is the second type of switch statement
            case 1->"monday";
            case 2->"tuesday";
            case 3->"wednesday";
            case 4 ->"thursday";
            case 5 ->"friday";
            case 6 ->"saturday";
            case 7 ->"sunday";
            default -> "invalid..!";
        };
        System.out.println(output);
    }
}

