package git.demo.controller;

import java.util.Date;

public class DemoController {
	private long demoId;
	private String demoName;
	private Date doe;
	
	public DemoController() {
		super();
	}

	public DemoController(long demoId, String demoName, Date doe) {
		super();
		this.demoId = demoId;
		this.demoName = demoName;
		this.doe = doe;
	}

	public long getDemoId() {
		return demoId;
	}

	public void setDemoId(long demoId) {
		this.demoId = demoId;
	}

	public String getDemoName() {
		return demoName;
	}

	public void setDemoName(String demoName) {
		this.demoName = demoName;
	}

	public Date getDoe() {
		return doe;
	}

	public void setDoe(Date doe) {
		this.doe = doe;
	}

	@Override
	public String toString() {
		return "DemoController [demoId=" + demoId + ", demoName=" + demoName + ", doe=" + doe + "]";
	}
	
	

}
