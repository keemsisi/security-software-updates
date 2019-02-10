

public class StaticClassTest {
 private  static class TesterClass {
     private String s = "";
     TesterClass(String name){
         this.s = name;
     }
 }


    public static void main(String[] args) {
        TesterClass v = new TesterClass("Adeshina");
        TesterClass jj = new TesterClass("Hello");
        System.out.println(jj.s);
        System.out.println(v.s);

        System.out.println(v.s);
        System.out.println(jj.s);
        System.out.println(TesterClass.class.getAnnotatedInterfaces());


        System.out.println(jj.s);
        System.out.println(jj.s);

        System.out.println(v.s);
        System.out.println(v.s);



    }

}
