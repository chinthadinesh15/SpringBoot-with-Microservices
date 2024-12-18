package in.Dinesh.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("MysqlDao")
@Primary
public class MySqlReport implements ReportDao
{
	@Override
	public void getData() 
	{
		System.out.println("Getting data from MySql Report");
	}
}
