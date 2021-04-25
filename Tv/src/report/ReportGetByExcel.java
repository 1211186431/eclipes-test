package report;

import java.util.ArrayList;

public class ReportGetByExcel implements ReportGet {
    ExcelAPI excelAPI;
    
    public ReportGetByExcel(ExcelAPI excelAPI) {
		// TODO Auto-generated constructor stub
    	this.excelAPI=excelAPI;
	}
	@Override
	public String getReport(String name) {
		// TODO Auto-generated method stub
		return this.excelAPI.getExcel(name);
	}

}
