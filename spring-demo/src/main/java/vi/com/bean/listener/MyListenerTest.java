package vi.com.bean.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MyListenerTest implements ApplicationListener {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof MyEvent) {
			MyEvent myEvent = (MyEvent) event;
			myEvent.println();
		}
	}
}
