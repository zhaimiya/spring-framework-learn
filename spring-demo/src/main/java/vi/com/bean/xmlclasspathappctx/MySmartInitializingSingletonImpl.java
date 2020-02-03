package vi.com.bean.xmlclasspathappctx;

import org.springframework.beans.factory.SmartInitializingSingleton;

public class MySmartInitializingSingletonImpl implements SmartInitializingSingleton {
	@Override
	public void afterSingletonsInstantiated() {
		System.out.println("MySmartInitializingSingletonImpl.afterSingletonsInstantiated--smartSingleton.afterSingletonsInstantiated() ");
	}
}
