package Jan05;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Employer e1 = new Employer(101, "IT", 200000.00);
        Employer e2 = new Employer(102, "Agrotech", 350000.00);
        Employer e3 = new Employer(103, "Softfarm", 400000.00);
        
        
        Set set = new LinkedHashSet();
        set.add(e1);
        set.add(e1);
        set.add(e2);
        
        for (Object obj : set) {
            System.out.println(obj);
        }
    }
}
