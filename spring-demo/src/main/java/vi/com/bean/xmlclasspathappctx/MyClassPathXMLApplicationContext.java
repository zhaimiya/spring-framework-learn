package vi.com.bean.xmlclasspathappctx;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vi.com.bean.postprocessors.BeanFactoryPostProcessorE;
import vi.com.bean.postprocessors.BeanFactoryPostProcessorF;
import vi.com.bean.postprocessors.MyBeanPostProcessor;

public class MyClassPathXMLApplicationContext extends ClassPathXmlApplicationContext {
	public MyClassPathXMLApplicationContext(String... configLocation) {
		super(configLocation);
	}


	@Override
	protected void initPropertySources() {
		super.initPropertySources();
		//添加额外的验证要求
	}

	@Override
	public void addApplicationListener(ApplicationListener<?> listener) {
		super.addApplicationListener(listener);
	}

	@Override
	public void addBeanFactoryPostProcessor(BeanFactoryPostProcessor postProcessor) {
		super.addBeanFactoryPostProcessor(postProcessor);
	}

	@Override
	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {

	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		super.customizeBeanFactory(beanFactory);
		super.setAllowBeanDefinitionOverriding(true);
		super.setAllowCircularReferences(true);
	}
}
