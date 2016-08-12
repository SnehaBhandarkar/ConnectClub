package backcollab.dao;

import backcollab.model.Forum;

public interface ForumDAO {
	
	public void saveOrUpdate();
	public Forum get(int forumId);
	public Forum getByName(String userName);
	public Forum getById(int forumId);


}
