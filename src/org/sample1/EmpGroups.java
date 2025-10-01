package org.sample1;

public class EmpGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String [] empName;
     int [] empId;
     
     Employees e = new Employees();
      empName = new String[] { e.empName1, e.empName2, e.empName3};
      empId  = new int[] { e.empId1, e.empId2, e.empId3};
      
      System.out.println("EmployeeName:" + e.empName1 + ",EmployeeId:" + e.empId1);
      System.out.println("EmployeeName:" + e.empName2 + ",EmployeeId:" + e.empId2);
      System.out.println("EmployeeName:" + e.empName3 + ",EmployeeId:" + e.empId3);
     
      
	}

}
