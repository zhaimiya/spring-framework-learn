package vi.com.bean.overrides;

public abstract class LookUpTest {

	public abstract Animal getBean();

	public  void say(){
		this.getBean().sayHello();
	}
}
