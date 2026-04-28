/*
------------------------------------------------------------
DEFINITION:
This program demonstrates how to READ DATA from a MySQL
database using JDBC (Java Database Connectivity).

JDBC is an API in Java that allows Java programs to:
- Connect to a database
- Execute SQL queries
- Retrieve and manipulate data

In this example:
- We connect to MySQL database
- Execute a SELECT query
- Display data from "students" table
------------------------------------------------------------
*/

package jdbc;

import java.sql.*; // Importing JDBC classes

public class ReadDataExample {

	public static void main(String[] args) {

		try {
			/*
			------------------------------------------------------------
			STEP 1: Load and Register Driver
			- This loads MySQL JDBC Driver into memory
			- Required to establish connection
			------------------------------------------------------------
			*/
			Class.forName("com.mysql.cj.jdbc.Driver");

			/*
			------------------------------------------------------------
			STEP 2: Establish Connection
			- Connect to database using:
			  URL, username, password
			- Database: itvedant
			------------------------------------------------------------
			*/
			Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/itvedant",
				"root",
				"Shinde@123"
			);

			/*
			------------------------------------------------------------
			STEP 3: Create Statement Object
			- Used to send SQL queries to database
			------------------------------------------------------------
			*/
			Statement stat = conn.createStatement();

			/*
			------------------------------------------------------------
			STEP 4: Execute Query
			- SELECT query to fetch all records from students table
			- ResultSet stores returned data
			------------------------------------------------------------
			*/
			ResultSet rs = stat.executeQuery("Select * from students");

			/*
			------------------------------------------------------------
			STEP 5: Process ResultSet
			- rs.next() moves cursor to next row
			- Retrieve data using column index:
			  getInt(1) → first column
			  getString(2) → second column
			------------------------------------------------------------
			*/
			while (rs.next()) {
				System.out.println(
					rs.getInt(1) + "  " + rs.getString(2)
				);
			}

			/*
			------------------------------------------------------------
			NOTE:
			- Always close resources (Connection, Statement, ResultSet)
			  in real applications to avoid memory leaks
			------------------------------------------------------------
			*/

		} catch (SQLException | ClassNotFoundException e) {

			/*
			------------------------------------------------------------
			EXCEPTION HANDLING:
			- SQLException → database errors
			- ClassNotFoundException → driver not found
			- e.getMessage() prints error message
			------------------------------------------------------------
			*/
			System.out.println(e.getMessage());
		}
	}
}

/*
------------------------------------------------------------
USAGE OF THIS PROGRAM:

- Fetch data from database tables
- Used in:
  • Student management systems
  • Banking applications
  • Web applications (backend)
  • Reporting systems

------------------------------------------------------------
EXAMPLE DATABASE TABLE: students

| ID | Name     |
|----|----------|
| 1  | Rahul    |
| 2  | Sneha    |
| 3  | Amit     |

------------------------------------------------------------
EXAMPLE OUTPUT:

1  Rahul
2  Sneha
3  Amit

------------------------------------------------------------
SUMMARY:

1. Load JDBC Driver
2. Create Connection
3. Create Statement
4. Execute Query
5. Process ResultSet
6. Handle Exceptions

------------------------------------------------------------
*/