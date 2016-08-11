package backcollab.dao;

import backcollab.model.Blog;

public interface BlogDAO {
	
	public void saveOrUpdate();
	public Blog get(int blogId);
	public Blog getByName(String userName);
	public Blog getById(int blogId);

}
