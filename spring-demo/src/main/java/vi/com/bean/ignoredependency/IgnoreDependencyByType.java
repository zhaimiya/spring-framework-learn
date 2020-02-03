package vi.com.bean.ignoredependency;

import java.util.List;

public class IgnoreDependencyByType {
	private List<String> list;

	public List<String> getList() {
		return list;
	}

	public IgnoreDependencyByType setList(List<String> list) {
		this.list = list;
		return this;
	}
}
