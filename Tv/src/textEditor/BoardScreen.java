package textEditor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BoardScreen {
	public void open() {
		System.out.println("open");
	}

	public void create() {
		System.out.println("create");
	}

	public void copy() {
		System.out.println("copy");
	}

	public void paste() {
		System.out.println("paste");
	}

	public void save(String commend)  {
		commend=commend+"\n";
		FileOutputStream out;
		try {
			out = new FileOutputStream(new File("D://大三//大三下//设计模式//textEditor.txt"), true);
			byte[] b = commend.getBytes();
			out.write(b);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
