package Jan05.home;

public class Test {
   void x(){System.out.println("X");}
   void y(){System.out.println("Y");}
   
    public static void main(String[] args) {
        Test tt = new Test();
        for (int i = 0; i < 5; i++){
            tt.x();
        }
        for (int i = 0; i < 5; i++){
            tt.y();
        }
    }
}
