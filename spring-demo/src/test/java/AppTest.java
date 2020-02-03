import org.junit.Test;
import org.springframework.context.ApplicationContext;
import vi.com.bean.aotutag.User;
import vi.com.bean.xmlclasspathappctx.MyClassPathXMLApplicationContext;


public class AppTest {

	@Test
	public void test() {
		String path = "config.xml";
//		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(path));
		ApplicationContext ctx = new MyClassPathXMLApplicationContext(path);
		User user = ctx.getBean(User.class);
		user.getId();



	}


}