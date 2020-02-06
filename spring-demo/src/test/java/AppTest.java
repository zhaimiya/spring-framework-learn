import org.junit.Test;
import org.springframework.context.ApplicationContext;
import vi.com.bean.aotutag.User;
import vi.com.bean.xmlclasspathappctx.MyClassPathXMLApplicationContext;

import java.util.ArrayList;
import java.util.List;


public class AppTest {

	@Test
	public void test() {
		String path = "config.xml";
//		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(path));
		ApplicationContext ctx = new MyClassPathXMLApplicationContext(path);
//		User user = ctx.getBean(User.class);
//		user.getId();

		List<String> list = new ArrayList<>();
		list.add(0,"first");
		for (int i = 0; i <list.size() ; i++) {
			System.out.println(i +":  "+ list.get(i));
		}

		list.add(0,"second");
		for (int i = 0; i <list.size() ; i++) {
			System.out.println(i +":  "+ list.get(i));
		}
	}


}