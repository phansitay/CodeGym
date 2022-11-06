package dao;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDao {
    public boolean insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> selectAllUsers();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;

    public List<User> searchUser(String country) throws SQLException;

    public  List<User> sortUser() throws SQLException;

    User getUserById(int id);

    boolean insertUserStore(User user) throws SQLException;


}
