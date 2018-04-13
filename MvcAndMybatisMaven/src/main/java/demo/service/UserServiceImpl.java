package demo.service;

import java.util.Set;

import demo.dao.UserDao;
import demo.entity.User;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Resource
    private UserDao userDao;

    public User getByUsername(String username) {
        return userDao.getByUsername(username);
    }

    public Set<String> getRoles(String username) {
        return userDao.getRoles(username);
    }

    public Set<String> getPermissions(String username) {
        return userDao.getPermissions(username);
    }

}
