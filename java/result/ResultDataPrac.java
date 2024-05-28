package result;

public class ResultDataPrac {
	private int cPrac;
	private int cppPrac;
    private int javaPrac;
    private int webtechnologyPrac;
    private int dsaPrac;
    private int digitallogicPrac;
    
    public int getcPrac() {
		return cPrac;
	}
	public void setcPrac(int cPrac) {
		this.cPrac = cPrac;
	}
	public int getCppPrac() {
		return cppPrac;
	}
	public void setCppPrac(int cppPrac) {
		this.cppPrac = cppPrac;
	}
	public int getJavaPrac() {
		return javaPrac;
	}
	public void setJavaPrac(int javaPrac) {
		this.javaPrac = javaPrac;
	}
	public int getWebtechnologyPrac() {
		return webtechnologyPrac;
	}
	public void setWebtechnologyPrac(int webtechnologyPrac) {
		this.webtechnologyPrac = webtechnologyPrac;
	}
	public int getDsaPrac() {
		return dsaPrac;
	}
	public void setDsaPrac(int dsaPrac) {
		this.dsaPrac = dsaPrac;
	}
	public int getDigitallogicPrac() {
		return digitallogicPrac;
	}
	public void setDigitallogicPrac(int digitallogicPrac) {
		this.digitallogicPrac = digitallogicPrac;
	}
	public int getTotalPrac()
    {
    	int sum=cPrac+cppPrac+javaPrac+webtechnologyPrac+dsaPrac+digitallogicPrac;
    	return sum;
    }  
}
