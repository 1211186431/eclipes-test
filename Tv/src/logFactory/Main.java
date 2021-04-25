package logFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LogFactory factory1=new FileLogFactory();
        LogFactory factory2=new DBLogFactory();
        LogWay way1=factory1.createLog();
        LogWay way2=factory2.createLog();
        
        way1.writeLog();
        way2.writeLog();
	}

}
