package javaCourseClasses.ListInterface;

 class Printer<printAnyThing> {

         printAnyThing thingsToPrint;

         public  Printer(printAnyThing thingsToPrint){
             this.thingsToPrint=thingsToPrint;
         }
         public void Print(){
             System.out.println(thingsToPrint);
         }

     }
     // String list class only using String elements
class stringPrinter<string>{
     String thingsToPrint;

    public stringPrinter(String thingsToPrint) {
        this.thingsToPrint = thingsToPrint;
    }
    public void stringPrint(){
        System.out.println(thingsToPrint);
    }
}