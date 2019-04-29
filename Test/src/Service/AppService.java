package Service;

import java.util.List;

import entity.app;

public interface AppService {

	public void newApp(app a);
	public List<app> showAll();
}
