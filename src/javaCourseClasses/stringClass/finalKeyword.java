package javaCourseClasses.stringClass;
// final keyWord
public class finalKeyword {
    public  final  int id=1002;//first you declare final datatype so, the value will be immutable
    void ini(){
      //  id=99; can't change
    }
    final String email="SandeepMehra2259@gmail.com";
    void out(){
       // email="bbi";can't change
    }
    public static void main(String[] args) {
        finalKeyword o = new finalKeyword();
        System.out.println(o.email);//after we declare datatype final so user are capable to use but user can't modify ;
    }
}
