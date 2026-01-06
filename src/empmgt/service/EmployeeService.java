package empmgt.service;

import empmgt.dao.EmployeeDAO;
import empmgt.model.Employee;

public class EmployeeService {
   public Employee save(Employee e){
       EmployeeDAO edao = new EmployeeDAO();
       return edao.insert(e);
       
   }
}
