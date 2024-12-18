package in.Dinesh.beans;

import org.springframework.stereotype.Repository;

@Repository("OracleDao")

public class OrcaleReport implements ReportDao
{
	@Override
	public void getData() 
	{
		System.out.println("Data Getting from Oracle Report");
	}
}
