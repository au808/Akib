package jan06;

public class Exception {
    public static void main(String[] args) {

        try{
           int[] arr = {22, 33, 44};
            System.out.println(arr[5]);
            int x = 10/0;
            String s = null;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Arry Problem");
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Problem");
        }catch(NullPointerException e){
            System.out.println("Null poienter Exception");
        }
        
        System.out.println("Programme Continue...");
    }
    
}
