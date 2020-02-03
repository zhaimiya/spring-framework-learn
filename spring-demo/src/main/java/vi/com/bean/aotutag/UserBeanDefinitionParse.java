package vi.com.bean.aotutag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSimpleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class UserBeanDefinitionParse extends AbstractSimpleBeanDefinitionParser {

	// 会用到的
	@Override
	protected Class getBeanClass(Element ele){
		return User.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		String name = element.getAttribute("usrnm");
		String email = element.getAttribute("email");
		if (StringUtils.hasText(name)) {
			builder.addPropertyValue("usrnm", name);
		}
		if (StringUtils.hasText(email)) {
			builder.addPropertyValue("email", email);
		}
	}
}
