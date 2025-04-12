import org.mindrot.jbcrypt.BCrypt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserManager {
    private List<User> userList = Collections.synchronizedList(new ArrayList<>());

    public synchronized void registerUser(String username, String password) {
        if (username == null || password == null) {
            throw new IllegalArgumentException("Username and password cannot be null");
        }
        if (isUsernameTaken(username)) {
            throw new IllegalArgumentException("Username is already taken");
        }
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        userList.add(new User(username, hashedPassword));
    }

    public boolean validateLogin(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        synchronized (userList) {
            for (User user : userList) {
                if (user.getUsername().equals(username) && BCrypt.checkpw(password, user.getPassword())) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isUsernameTaken(String username) {
        synchronized (userList) {
            for (User user : userList) {
                if (user.getUsername().equals(username)) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = Collections.synchronizedList(userList);
    }
}