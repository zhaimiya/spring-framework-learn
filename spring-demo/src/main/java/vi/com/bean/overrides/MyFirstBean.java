package vi.com.bean.overrides;

public class MyFirstBean {
	private String str = "Hellow Spring";

	public  void sayHellow(){
		System.out.println("str = "+str);
	}

	public String getStr() {
		return str;
	}

	public MyFirstBean setStr(String str) {
		this.str = str;
		return this;
	}
}
