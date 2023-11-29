package com.arrays.crud;

public class Engine {
	private int eid;
	private String type;
	public Engine() {
		// TODO Auto-generated constructor stub
	}
	
	public Engine(int eid, String type) {
		super();
		this.eid = eid;
		this.type = type;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Engine [eid=" + eid + ", type=" + type + "]";
	}
}
