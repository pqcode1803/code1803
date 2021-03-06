package tedu.day2001;

import java.io.Serializable;

public class FileInfo implements Serializable {
	private static final long serialVersionUID = 6674247425425150634L;
	
	private String name;
	private long size;
	private long time;
	
	public FileInfo() {
		super();
	}
	public FileInfo(String name, long size, long time) {
		super();
		this.name = name;
		this.size = size;
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	
}
