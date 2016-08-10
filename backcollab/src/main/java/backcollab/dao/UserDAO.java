package backcollab.dao;

import backcollab.model.User;

public interface UserDAO {
	
	public void saveOrUpdate();
	public User get(int id);
	public User getByName(String name);
	public User getById(int id);

}
