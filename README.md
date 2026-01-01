# java-stream-example


Grouping By <br>
1. Basic Single-Field Grouping <br>
	Group by Department:<br>
	Group by Salary:<br>
2. Grouping with Aggregations (Summary Statistics)<br>
	Count Employees per Department<br>
	Average Salary per Department:<br>
	Total Salary (Sum) per Department:<br>
	Max/Min Salary Earner per Department:<br>
 3. Multi-Level Grouping<br>
	Group by Department, then by Salary:<br>
	By Department, Salary, and then Employee Number:<br>
4. Grouping with Mapping (Extracting Specific Fields)<br>
	Sometimes you only need a specific field (like names) from the grouped objects rather than the whole Employee object.<br>
	Employee Names by Department:<br>
5. Sort After Goup<br>
	Group By Dept SortEmpNo<br>
	Sorted by Department Name:<br>
6. Partitioning (Special Binary Grouping)<br>
	High vs. Low Salary Partitioning: (e.g., threshold of 50,000)<br>
	In Partitioning can we sort the element <br>

ToMap<br>
———
1. Basic 1:1 Mapping<br>
Used when you have unique keys (like empno). If a duplicate key is encountered, it throws an IllegalStateException.<br>
	Map EmpNo to Employee Object<br>
	Map EmpNo to Employee Name:<br>

2. Handling Duplicate Keys (Merge Function)<br>
If your list might have duplicate keys (e.g., mapping by dept), you must provide a Merge Function to decide which value to keep.<br>
 	Keep the first employee found:<br>
	Keep the employee with the highest salary:<br>

3. Specific Map Implementation (Supplier)<br>
By default, toMap returns a HashMap. You can specify a different type like TreeMap or LinkedHashMap using a Map Supplier.<br>
	Collect into a LinkedHashMap (Preserves insertion order):<br>

 4. Sort the Map based on Key or Value<br>
	Sort the Map based on key<br>
	Sort the Map based on key DESC<br>
	Sort Based on Emp No of emp<br>
	Sort Based on Emp No of emp DESC<br>
 

