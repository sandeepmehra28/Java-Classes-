package javaCourseClasses.GenericsAndDiamondOperators;

 class NumberContainer <T extends Number>{
    private T values;

     public T getValues() {
         return values;
     }

     public void setValues(T values) {
         this.values = values;
     }
 }
