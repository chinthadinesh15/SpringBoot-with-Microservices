package in.Dinesh.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService
{
	//@Autowired
//	@Qualifier("OracleDao")
	private ReportDao dao;
	
	
	
	public ReportService() 
	{
		System.out.println("0-param Constructor");
	}
	@Autowired
	public ReportService(ReportDao dao) 
	{
		this.dao=dao;
		System.out.println("ResportService :: param Constructor");
	}
	@Autowired
	public void setDao(ReportDao dao)
	{
		System.out.println("Setter of Report Service");
		this.dao = dao;
	}



	public void generateReport()
	{
		dao.getData();
		System.out.println("Report Generated.....");
	}

}
