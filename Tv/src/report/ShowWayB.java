package report;

public class ShowWayB implements ReportShow {
	ReportGet reportGet;
	String name;
	public ShowWayB(ReportGet reportGet,String name) {
		super();
		this.reportGet = reportGet;
		this.name=name;
	}

	@Override
	public void reportShowWay() {
		// TODO Auto-generated method stub
		 System.out.println("-------------");
	     System.out.println(this.reportGet.getReport(name));
	     System.out.println("-------------");
	}

}
