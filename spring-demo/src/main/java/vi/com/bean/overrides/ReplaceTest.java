package vi.com.bean.overrides;

import org.springframework.beans.factory.support.MethodReplacer;
import sun.plugin.liveconnect.ReplaceMethod;

import java.lang.reflect.Method;

public class ReplaceTest implements MethodReplacer {
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("每个人都将成为王者");
		return null;
	}
}
