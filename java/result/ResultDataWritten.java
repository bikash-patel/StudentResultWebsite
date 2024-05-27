package result;

public class ResultDataWritten {
      private String hallticketnumber;
      private String name;
      private int cWritten;
      private int cppWritten;
      private int javaWritten;
      private int webtechnologyWritten;
      private int dsaWritten;
      private int digitallogicWritten;
      int sum;
      
      public int getcWritten() {
		return cWritten;
	}
	public void setcWritten(int cWritten) {
		this.cWritten = cWritten;
	}
	public int getCppWritten() {
		return cppWritten;
	}
	public void setCppWritten(int cppWritten) {
		this.cppWritten = cppWritten;
	}
	public int getJavaWritten() {
		return javaWritten;
	}
	public void setJavaWritten(int javaWritten) {
		this.javaWritten = javaWritten;
	}
	public int getWebtechnologyWritten() {
		return webtechnologyWritten;
	}
	public void setWebtechnologyWritten(int webtechnologyWritten) {
		this.webtechnologyWritten = webtechnologyWritten;
	}
	public int getDsaWritten() {
		return dsaWritten;
	}
	public void setDsaWritten(int dsaWritten) {
		this.dsaWritten = dsaWritten;
	}
	public int getDigitallogicWritten() {
		return digitallogicWritten;
	}
	public void setDigitallogicWritten(int digitallogicWritten) {
		this.digitallogicWritten = digitallogicWritten;
	}
	public String getHallticketnumber() {
		return hallticketnumber;
	}
	public void setHallticketnumber(String hallticketnumber) {
		this.hallticketnumber = hallticketnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
    public int getTotalWritten()
    {
    	sum=cWritten+cppWritten+javaWritten+webtechnologyWritten+dsaWritten+digitallogicWritten;
    	return sum;
    }  
}
