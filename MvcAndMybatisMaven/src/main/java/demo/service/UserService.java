package demo.service;

import java.util.Set;

import demo.entity.User;

public interface UserService {
	
		public User getByUsername(String username);

	    public Set<String> getRoles(String username);

	    public Set<String> getPermissions(String username);
}
