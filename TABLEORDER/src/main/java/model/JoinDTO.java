package model;

public class JoinDTO {
	
	private int tnum;
	private String tid;
	private String tpw;
	private String tname;
	private String tphone;
	private String tadd;
	private String tgender;
	private String tdate;
	private String timg;
	private String tcreate;
	private String tcon;
	
	
	
	public JoinDTO(String tid) {
		this.tid = tid;
	}
	public int getTnum() {
		return tnum;
	}
	public void setTnum(int tnum) {
		this.tnum = tnum;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getTpw() {
		return tpw;
	}
	public void setTpw(String tpw) {
		this.tpw = tpw;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTphone() {
		return tphone;
	}
	public void setTphone(String tphone) {
		this.tphone = tphone;
	}
	public String getTadd() {
		return tadd;
	}
	public void setTadd(String tadd) {
		this.tadd = tadd;
	}
	public String getTgender() {
		return tgender;
	}
	public void setTgender(String tgender) {
		this.tgender = tgender;
	}
	public String getTdate() {
		return tdate;
	}
	public void setTdate(String tdate) {
		this.tdate = tdate;
	}
	public String getTimg() {
		return timg;
	}
	public void setTimg(String timg) {
		this.timg = timg;
	}
	public String getTcreate() {
		return tcreate;
	}
	public void setTcreate(String tcreate) {
		this.tcreate = tcreate;
	}
	public String getTcon() {
		return tcon;
	}
	public void setTcon(String tcon) {
		this.tcon = tcon;
	}

	
	
}
