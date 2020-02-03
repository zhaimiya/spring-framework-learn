package vi.com.bean.aotutag;

import org.springframework.beans.factory.FactoryBean;

public class UserFactoryBean implements FactoryBean<User> {
	private String userInfo;

	@Override
	public User getObject() throws Exception {
		User user = new User();
		String[] infos = userInfo.split(",");
		return user;
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

	public String getUserInfo() {
		return userInfo;
	}

	public UserFactoryBean setUserInfo(String userInfo) {
		this.userInfo = userInfo;
		return this;
	}
}
