package report;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbName="table1";
		String fileName="file1";
		String excelName="abc.xlsx";
		ReportGet rGbyDB=new ReportGetByDB();
		ReportGet rGbyFile=new ReportGetByFile();
		
		ExcelAPI excelAPI=new ExcelAPI();
		ReportGet rGbyExcel=new ReportGetByExcel(excelAPI);
		
		ReportShow reportShow1=new ShowWayA(rGbyDB,dbName);
		ReportShow reportShow2=new ShowWayB(rGbyFile,fileName);
		ReportShow reportShow22=new ShowWayB(rGbyExcel,excelName);
		
		reportShow1.reportShowWay();
		reportShow2.reportShowWay();
		reportShow22.reportShowWay();
		
	}

}
