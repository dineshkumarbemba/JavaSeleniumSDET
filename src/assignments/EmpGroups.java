package assignments;

public class EmpGroups {
	public static void main(String[] args) {
		Employee emp = new Employee();
		String empNamesArray[]=new String[3];
		empNamesArray[0]=emp.empName1;
		empNamesArray[1]=emp.empName2;
		empNamesArray[2]=emp.empName3;
		int empIdsArray[]=new int[3];
		empIdsArray[0]=emp.empId1;
		empIdsArray[1]=emp.empId2;
		empIdsArray[2]=emp.empId3;
		System.out.println(empNamesArray[0]+":"+empIdsArray[0]);
		
		
		
		System.out.println("*************************");
		String[] empNames= {emp.empName1,emp.empName2,emp.empName3};
		int empIds[]= {emp.empId1,emp.empId2,emp.empId3};
		for(int i=0;i<empNames.length;i++) {
			if(empNames[i].equals("Bharath")) {
				System.out.println(empNames[i]+":"+empIds[i]);
			}
		}
		
	}
}