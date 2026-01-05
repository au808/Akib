package Jan05;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Employer e1 = new Employer(101, "IT", 200000.00);
        Employer e2 = new Employer(102, "Agrotech", 350000.00);
        Employer e3 = new Employer(103, "Softfarm", 400000.00);
        
        
        Set employers = new LinkedHashSet();
        employers.add(e1);
        employers.add(e2);
        employers.add(e3);
        
        for (Object obj : employers) {
            System.out.println(obj);
        }
    }
}
