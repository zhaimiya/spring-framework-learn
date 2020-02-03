package vi.com.bean.postprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.PriorityOrdered;

public class BeanFactoryPostProcessorF implements BeanDefinitionRegistryPostProcessor, PriorityOrdered {
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("F————postProcessBeanDefinitionRegistry：实现BeanDefinitionRegistryPostProcessor, PriorityOrdered");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("F————postProcessBeanFactory：实现BeanDefinitionRegistryPostProcessor, PriorityOrdered");
	}

	@Override
	public int getOrder() {
		return -100;
	}
}
