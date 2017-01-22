package data;

import org.testng.annotations.DataProvider;
public class TestDataProgram {
	

	
		@DataProvider(name="TestDataCreateComputer")
		public Object [][] createcomputerutils()
		{
			Object [][] ab=new Object[1][4];
			ab[0][0]="mac"; 
			ab[0][1]="1990-08-02"; 
			ab[0][2]="1992-06-02"; 
			ab[0][3]="Apple Inc.";					
			return ab;
		}
		@DataProvider(name="TestDataReadComputer")
		public Object [][] readComputerutils()
		{
			Object [][] ab=new Object[1][1];
			ab[0][0]="mac";			
			return ab;
		}
		@DataProvider(name="TestDataEditComputer")
		public Object [][] editComputerutils()
		{
			Object [][] ab=new Object[1][5];
			ab[0][0]="mac"; 
			ab[0][1]="macbook";
			ab[0][2]="1990-08-02";
			ab[0][3]="1992-06-02";
			ab[0][4]="Apple Inc.";
			return ab;
		}
		@DataProvider(name="TestDataDeleteComputer")
		public Object [][] DeleteComputerutils()
		{
			Object [][] ab=new Object[1][1];
			ab[0][0]="macbook";			
			return ab;
		}	
	}

