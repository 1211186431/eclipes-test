package logFactory;

public class FileLogFactory implements LogFactory {

	@Override
	public LogWay createLog() {
		// TODO Auto-generated method stub
		return new FileLog();
	}

}
