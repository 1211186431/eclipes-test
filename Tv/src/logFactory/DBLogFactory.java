package logFactory;

public class DBLogFactory implements LogFactory {

	@Override
	public LogWay createLog() {
		// TODO Auto-generated method stub
		return new DBLog();
	}

}
