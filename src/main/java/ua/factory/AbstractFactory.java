package ua.factory;

import ua.models.dao.Dao;

public abstract class AbstractFactory {

	
	public abstract Dao getDao();
}
