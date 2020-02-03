package vi.com.bean.postprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.PriorityOrdered;

public class BeanFactoryPostProcessorE implements BeanFactoryPostProcessor, PriorityOrdered {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("E————postProcessBeanFactory, 实现BeanFactoryPostProcessor, PriorityOrdered");
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
