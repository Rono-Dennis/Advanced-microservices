package com.rono.amazonproject.swagger.to;

public class ComparePortalTO {

	private int id;
	private String wproductid;
	private String wproductname;
	private long wproductprice;

	public ComparePortalTO() {
	}

	public ComparePortalTO(int id, String wproductid, String wproductname, long wproductprice) {
		super();
		this.id = id;
		this.wproductid = wproductid;
		this.wproductname = wproductname;
		this.wproductprice = wproductprice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWproductid() {
		return wproductid;
	}

	public void setWproductid(String wproductid) {
		this.wproductid = wproductid;
	}

	public String getWproductname() {
		return wproductname;
	}

	public void setWproductname(String wproductname) {
		this.wproductname = wproductname;
	}

	public long getWproductprice() {
		return wproductprice;
	}

	public void setWproductprice(long wproductprice) {
		this.wproductprice = wproductprice;
	}

	@Override
	public String toString() {
		return "ComparePortalTO [id=" + id + ", wproductid=" + wproductid + ", wproductname=" + wproductname
				+ ", wproductprice=" + wproductprice + "]";
	}

}
