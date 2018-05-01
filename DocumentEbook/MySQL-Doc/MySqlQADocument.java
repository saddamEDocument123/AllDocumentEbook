/**
    This Document basically containt  All Question and Answer for MySql and
    getting all question from real time project

    @Author Sk Saddam Hosan 

 */

 1. What the ENUM data type ?
 =>
    ENUM is a string object whose value is chosen from a list of permitted values defined at the time of column 
    creation. The ENUM data type provides the following advantages: Compact data storage. MySQL ENUM uses numeric
    indexes (1, 2, 3, …) to represents string values.

        CREATE TABLE `administrators` (
        `iAdminId` int(11) NOT NULL AUTO_INCREMENT,
        `iGroupId` int(11) NOT NULL DEFAULT '1',
        `vFirstName` varchar(255) CHARACTER SET utf8 NOT NULL,
        `vLastName` varchar(255) CHARACTER SET utf8 NOT NULL,
        `vEmail` varchar(255) NOT NULL,
        `vContactNo` varchar(100) NOT NULL,
        `vPassword` varchar(255) NOT NULL,
        `eStatus` enum('Active','Inactive','Deleted') NOT NULL DEFAULT 'Active',
        `eDefault` enum('Yes','No') NOT NULL DEFAULT 'No',
        PRIMARY KEY (`iAdminId`)
        ) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

        INSERT INTO `administrators` VALUES (1,1,'Main','Admin','demo@demo.com','1234567890','$2y$1','Active','Yes')

2. What is the indexeing in MySql Database ?
=>
    An index is a copy of selected columns of data from a table that can be searched very efficiently that also includes a 
    low-level disk block address or direct link to the complete row of data it was copied from.

****   Now, let’s say that we want to run a query to find all the details of any employees who are named ‘Abc’?
            SELECT * FROM Employee 
                WHERE Employee_Name = 'Abc'


3. What would happen without an index?
=>

    Database software would literally have to look at every single row in the Employee table to see if the Employee_Name for that row is ‘Abc’. 
    And, because we want every row with the name ‘Abc’ inside it, we can not just stop looking once we find just one row with the name ‘Abc’, 
    because there could be other rows with the name Abc. So, every row up until the last row must be searched – which means thousands of rows 
    in this scenario will have to be examined by the database to find the rows with the name ‘Abc’. This is what is called a full table scan

4. How a database index can help performance?
=>

    The whole point of having an index is to speed up search queries by essentially cutting down the number of records/rows in a table that 
    need to be examined. An index is a data structure (most commonly a B- tree) that stores the values for a specific column in a table.

5. How does B-trees index work?
=>
    The reason B- trees are the most popular data structure for indexes is due to the fact that they are time efficient – because look-ups, 
    deletions, and insertions can all be done in logarithmic time. And, another major reason B- trees are more commonly used is because the 
    data that is stored inside the B- tree can be sorted. The RDBMS typically determines which data structure is actually used for an index. 
    But, in some scenarios with certain RDBMS’s, you can actually specify which data structure you want your database to use when you create 
    the index itself.

6. How does a hash table index work?
=>
    The reason hash indexes are used is because hash tables are extremely efficient when it comes to just looking up values. So, queries that 
    compare for equality to a string can retrieve values very fast if they use a hash index.
      For instance, the query we discussed earlier could benefit from a hash index created on the Employee_Name column. The way a hash index 
      would work is that the column value will be the key into the hash table and the actual value mapped to that key would just be a pointer 
      to the row data in the table. Since a hash table is basically an associative array, a typical entry would look something like 
      “Abc => 0x28939″, where 0x28939 is a reference to the table row where Abc is stored in memory. Looking up a value like “Abc” in a hash 
      table index and getting back a reference to the row in memory is obviously a lot faster than scanning the table to find all the rows 
      with a value of “Abc” in the Employee_Name column.

7. The disadvantages of a hash index
=>
    Hash tables are not sorted data structures, and there are many types of queries which hash indexes can not even help with. For instance,
     suppose you want to find out all of the employees who are less than 40 years old. How could you do that with a hash table index? Well,
      it’s not possible because a hash table is only good for looking up key value pairs – which means queries that check for equality

8. What exactly is inside a database index?
=>
    So, now you know that a database index is created on a column in a table, and that the index stores the values in that specific column.
     But, it is important to understand that a database index does not store the values in the other columns of the same table. For example, 
     if we create an index on the Employee_Name column, this means that the Employee_Age and Employee_Address column values are not also 
     stored in the index. If we did just store all the other columns in the index, then it would be just like creating another copy of the 
     entire table – which would take up way too much space and would be very inefficient.

9. How does a database know when to use an index? 
=>
    When a query like “SELECT * FROM Employee WHERE Employee_Name = ‘Abc’ ” is run, the database will check to see if there is an index on 
    the column(s) being queried. Assuming the Employee_Name column does have an index created on it, the database will have to decide whether 
    it actually makes sense to use the index to find the values being searched – because there are some scenarios where it is actually less 
    efficient to use the database index, and more efficient just to scan the entire table.

10. What is the cost of having a database index?
=>
    It takes up space – and the larger your table, the larger your index. Another performance hit with indexes is the fact that whenever you 
    add, delete, or update rows in the corresponding table, the same operations will have to be done to your index. Remember that an index
    needs to contain the same up to the minute data as whatever is in the table column(s) that the index covers.

     As a general rule, an index should only be created on a table if the data in the indexed column will be queried frequently.

11. Why is it indexing needed?
=>
    When data is stored on disk-based storage devices, it is stored as blocks of data. These blocks are accessed in their entirety,
    making them the atomic disk access operation. Disk blocks are structured in much the same way as linked lists; both contain a section 
    for data, a pointer to the location of the next node (or block), and both need not be stored contiguously.
    Due to the fact that a number of records can only be sorted on one field, we can state that searching on a field that isn’t sorted requires 
    a Linear Search which requires N/2 block accesses (on average), where N is the number of blocks that the table spans. If that field is a 
    non-key field (i.e. doesn’t contain unique entries) then the entire tablespace must be searched at N block accesses.
    Whereas with a sorted field, a Binary Search may be used, which has log2 N block accesses. Also since the data is sorted given a non-key field, 
    the rest of the table doesn’t need to be searched for duplicate values, once a higher value is found. Thus the performance increase is substantial.
