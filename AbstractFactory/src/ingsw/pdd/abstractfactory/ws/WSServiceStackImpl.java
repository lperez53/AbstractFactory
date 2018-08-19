package ingsw.pdd.abstractfactory.ws;

import ingsw.pdd.abstractfactory.impl.IServiceStackAbstractFactory;
import ingsw.pdd.abstractfactory.service.IEmployeeService;
import ingsw.pdd.abstractfactory.service.IProductsService;

public class WSServiceStackImpl implements IServiceStackAbstractFactory{
	
	@Override
	public IEmployeeService getEmployeeService() {
		return new EmployeeServiceWSImpl();

	}
	@Override
	public IProductsService getProductsService() {
		return new ProductServiceWSImpl();
	}
}
