package vi.com.bean.listener;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {
	String msg;

	public MyEvent(Object source,String msg) {
		super(source);
		this.msg = msg;
	}

	public void println() {
		System.out.println(msg);
	}
}
