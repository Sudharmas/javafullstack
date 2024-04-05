package beans;

public class javabeans {

	private String fname;
	private String l_name;
//creating consructors to set and get names in get.jsp and se.jsp file
	public javabeans() {
		fname = fname;
		l_name = l_name;
	}
	public String getfname() {//constructor to get the name
		return fname;
	}

	public void setfname(String fname) {//constructor to update name
		this.fname = fname;
	}

	public String getL_name() {//for last name
		return l_name;
	}

	public void setL_name(String l_name) {//for last name
		this.l_name = l_name;
	}
}
