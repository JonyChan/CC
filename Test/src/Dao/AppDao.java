package Dao;

import java.util.List;

import entity.app;

public interface AppDao {
	
	public app insert(app a);
	public List<app> showAll();
}
