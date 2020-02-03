package vi.com.bean.ignoredependency;

import java.util.List;

public class IgnoreDependencyByInterfaceImpl implements IgnoreDependencyByInterfaceSrv {
	private  List<String> list;


	@Override
	public void setList(List<String> list) {
		this.list = list;
	}

	public List<String> getList() {
		return list;
	}
}
