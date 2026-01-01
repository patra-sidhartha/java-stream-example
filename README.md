# java-stream-example

Java Stream
Grouping By
1. Basic Single-Field Grouping
	Group by Department:
	Group by Salary:
2. Grouping with Aggregations (Summary Statistics)
	Count Employees per Department
	Average Salary per Department:
	Total Salary (Sum) per Department:
	Max/Min Salary Earner per Department:
 3. Multi-Level Grouping
	Group by Department, then by Salary:
	By Department, Salary, and then Employee Number:
4. Grouping with Mapping (Extracting Specific Fields)
	Sometimes you only need a specific field (like names) from the grouped objects rather than the whole Employee object.
	Employee Names by Department:
5. Sort After Goup
	Group By Dept SortEmpNo
	Sorted by Department Name:
6. Partitioning (Special Binary Grouping)
	High vs. Low Salary Partitioning: (e.g., threshold of 50,000)
	In Partitioning can we sort the element 

ToMap
———
1. Basic 1:1 Mapping
Used when you have unique keys (like empno). If a duplicate key is encountered, it throws an IllegalStateException.
	Map EmpNo to Employee Object
	Map EmpNo to Employee Name:

2. Handling Duplicate Keys (Merge Function)
If your list might have duplicate keys (e.g., mapping by dept), you must provide a Merge Function to decide which value to keep.
 	Keep the first employee found:
	Keep the employee with the highest salary:

3. Specific Map Implementation (Supplier)
By default, toMap returns a HashMap. You can specify a different type like TreeMap or LinkedHashMap using a Map Supplier.
	Collect into a LinkedHashMap (Preserves insertion order):

 4. Sort the Map based on Key or Value
	Sort the Map based on key
	Sort the Map based on key DESC
	Sort Based on Emp No of emp
	Sort Based on Emp No of emp DESC
 






