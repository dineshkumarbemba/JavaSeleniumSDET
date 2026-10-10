package assignments;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment5_Collection_WebTable {
	public static void main(String[] args) {
		Map<String,String>student1Det=new LinkedHashMap<String,String>();
		student1Det.put("Name", "JohnDoe");
		student1Det.put("Age", "Twenty");
		student1Det.put("Gender","Male");
		student1Det.put("RoleNo","SBA12345");
		student1Det.put("Grade","A++");
		student1Det.put("Major","ComputerScience");
		student1Det.put("GPA","A3.8");
		student1Det.put("Email","john@example.com");
		student1Det.put("PAN Number","SDF6543210");
		student1Det.put("Address","123 Elm St");

		Map<String,String>student2Det=new LinkedHashMap<String,String>();
		student2Det.put("Name", "Jane Smith");
		student2Det.put("Age", "Twenty One");
		student2Det.put("Gender","Female");
		student2Det.put("RoleNo","SBA12346");
		student2Det.put("Grade","B+");
		student2Det.put("Major","Mathematics");
		student2Det.put("GPA","A3.5");
		student2Det.put("Email","jane@example.com");
		student2Det.put("PAN Number","REW6543211");
		student2Det.put("Address","456 Oak St");

		Map<String,String>student3Det=new LinkedHashMap<String,String>();
		student3Det.put("Name", "Mike Brown");
		student3Det.put("Age", "Twenty One");
		student3Det.put("Gender","Male");
		student3Det.put("RoleNo","SBA12347");
		student3Det.put("Grade","A+");
		student3Det.put("Major","Physics");
		student3Det.put("GPA","A3.9");
		student3Det.put("Email","mike@example.com");
		student3Det.put("PAN Number","TYR6543212");
		student3Det.put("Address","789 Pine St");

		List<Map<String,String>>studDetails=new ArrayList<Map<String,String>>();
		studDetails.add(student1Det);
		studDetails.add(student2Det);
		studDetails.add(student3Det);
		System.out.println(studDetails);
		//	for(int i=0;i<studDetails.size();i++) {
		//		System.out.println(studDetails.get(i));
		//	}
		//System.out.println(studDetails.get(1).get("Email"));

		Map<String,String>employee1Det=new LinkedHashMap<String,String>();
		employee1Det.put("Employee ID","E001");
		employee1Det.put("Name","Alice Green");
		employee1Det.put("Age","Thirty");
		employee1Det.put("Gender","Female");
		employee1Det.put("Department","Engineering");
		employee1Det.put("Position","Software Engineer");
		employee1Det.put("Salary","75K Pounds");
		employee1Det.put("Email","alice@example.com");
		employee1Det.put("PAN Number","SDF6543210");


		Map<String,String>employee2Det=new LinkedHashMap<String,String>();
		employee2Det.put("Employee ID","E002");
		employee2Det.put("Name","Bob Johnson");
		employee2Det.put("Age","Thirty Five");
		employee2Det.put("Gender","Male");
		employee2Det.put("Department","Marketing");
		employee2Det.put("Position","Marketing Manager");
		employee2Det.put("Salary","85K Pounds");
		employee2Det.put("Email","bob@example.com");
		employee2Det.put("PAN Number","REW6543211");

		Map<String,String>employee3Det=new LinkedHashMap<String,String>();
		employee3Det.put("Employee ID","E003");
		employee3Det.put("Name","Carol White");
		employee3Det.put("Age","Twenty Eight");
		employee3Det.put("Gender","Female");
		employee3Det.put("Department","Sales");
		employee3Det.put("Position","Sales Executive");
		employee3Det.put("Salary","65K Pounds");
		employee3Det.put("Email","carol@example.com");
		employee3Det.put("PAN Number","TYR6543212");

		List<Map<String,String>>employeeDetails=new ArrayList<Map<String,String>>();
		employeeDetails.add(employee1Det);
		employeeDetails.add(employee2Det);
		employeeDetails.add(employee3Det);
		System.out.println(employeeDetails);

		Map<String, String> Product1Map = new LinkedHashMap<String, String>();
		Product1Map.put("Product ID", "P001");
		Product1Map.put("Name", "Laptop");
		Product1Map.put("Category", "Electronics");
		Product1Map.put("Price", "$1,200");
		Product1Map.put("Stock Quantity", "50");
		Product1Map.put("Supplier", "Tech Supplies");
		Product1Map.put("Warranty", "2 years");
		Product1Map.put("Rating", "4.5");
		Product1Map.put("Manufacturing Date", "15-01-2023");
		Product1Map.put("Expiry Date", "15-01-2025");
		System.out.println("Product 1 details :" + Product1Map);

		// Below Product2Map details are stored using Map(HashMap)

		Map<String, String> Product2Map = new LinkedHashMap<String, String>();
		Product2Map.put("Product ID", "P002");
		Product2Map.put("Name", "Desk Chair");
		Product2Map.put("Category", "Furniture");
		Product2Map.put("Price", "$150");
		Product2Map.put("Stock Quantity", "200");
		Product2Map.put("Supplier", "Office Depot");
		Product2Map.put("Warranty", "1 year");
		Product2Map.put("Rating", "4");
		Product2Map.put("Manufacturing Date", "10-02-2023");
		Product2Map.put("Expiry Date", "N/A");
		System.out.println("Product 2 details :" + Product2Map);

		// Below Product3Map details are stored using Map(HashMap)

		Map<String, String> Product3Map = new LinkedHashMap<String, String>();
		Product3Map.put("Product ID", "P003");
		Product3Map.put("Name", "Coffee Maker");
		Product3Map.put("Category", "Kitchen");
		Product3Map.put("Price", "$75");
		Product3Map.put("Stock Quantity", "100");
		Product3Map.put("Supplier", "KitchenWorld");
		Product3Map.put("Warranty", "6 months");
		Product3Map.put("Rating", "4.2");
		Product3Map.put("Manufacturing Date", "20-03-2023");
		Product3Map.put("Expiry Date", "20-03-2024");
		System.out.println("Product 3 details :" + Product3Map);

		List<Map<String,String>>productDetails=new ArrayList<Map<String,String>>();
		productDetails.add(Product1Map);
		productDetails.add(Product2Map);
		productDetails.add(Product3Map);
		System.out.println(productDetails);
		
		Map<String,List<Map<String,String>>>allDetails=new LinkedHashMap<String,List<Map<String,String>>>();
		allDetails.put("StudentDetails", studDetails);
		allDetails.put("EmployeeDetails", employeeDetails);
		allDetails.put("ProductDetails", productDetails);
		System.out.println("ALL Values from Map"+allDetails);
		
		System.out.println("Required value : " +allDetails.get("ProductDetails").get(1).get("Supplier"));
		
		Set<Entry<String, List<Map<String, String>>>> entrySet = allDetails.entrySet();
		for(Entry<String, List<Map<String, String>>>a:entrySet) {
			System.out.println(a);
		}

	}
}
