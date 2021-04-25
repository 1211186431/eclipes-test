package report;

import java.util.ArrayList;

public class ReportGetByDB implements ReportGet {
    
	@Override
	public String getReport(String name) {
		// TODO Auto-generated method stub
		return "DB 中返回"+name+"文件的数据";
	}

}
