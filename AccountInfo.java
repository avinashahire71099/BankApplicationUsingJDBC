import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AccountInfo {
public int createAccount(Account a)
{
	Connection con=DBConnection.getConnection();
	int i=0;
	
		try {
			PreparedStatement ps=con.prepareStatement("insert into bankdb values(?,?,?)");
			ps.setInt(1,a.getAccNo());
			ps.setString(2,a.getCustName());
			ps.setFloat(3,a.getAccBal());
		    i=ps.executeUpdate();
		    con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	return i;
}
public int deleteAccount(int accNo)
{
	int i=0;
	Connection con=DBConnection.getConnection();
	  try {
		PreparedStatement ps=con.prepareStatement("delete from bankdb where accNo=?");
	     ps.setInt(1, accNo);
		 i=ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	
	return i;
}
public void searchAccount(int accNo)
{
	Connection con=DBConnection.getConnection();
	try {
		PreparedStatement pstate=con.prepareStatement("select * from bankdb where accNo=?");
		pstate.setInt(1, accNo);
		ResultSet a=pstate.executeQuery();
		while(a.next())
		{
			System.out.println(a.getInt(1)+"\t"+a.getString(2)+"\t"+a.getFloat(3));
		}

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
public void showRecord()
{
	String str="Select * from bankdb";
	Connection con=DBConnection.getConnection();
	try {
		Statement p=con.createStatement();
		ResultSet result=p.executeQuery(str);
		ResultSetMetaData a=result.getMetaData();
		for(int i=1;i<=a.getColumnCount();i++)
		{
			System.out.print(a.getColumnName(i)+"\t");
			
		}
		System.out.println("\n-------------------------------------");
		while(result.next())
		{
			System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t\t"+result.getFloat(3));
		}
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public int updateRecord(int a)
{
	Scanner sc=new Scanner(System.in);
	int i=0;
	System.out.println("Please enter customer name and account balance to update");
	String custName=sc.next();
	Double accBal=sc.nextDouble();
	Connection con=DBConnection.getConnection();
	try {
		PreparedStatement pstate=con.prepareStatement("update bankdb set custName=?,accBal=? where accNo=?");
		pstate.setString(1,custName);
		pstate.setDouble(2,accBal);
		pstate.setFloat(3,a);
		 i=pstate.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return i;
}
}
