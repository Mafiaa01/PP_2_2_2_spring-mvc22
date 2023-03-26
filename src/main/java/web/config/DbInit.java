package web.config;

import org.springframework.stereotype.Component;
import web.DAO.UserDAO;
import web.Model.User;

import javax.annotation.PostConstruct;

@Component
public class DbInit {

    private final UserDAO userDAO;

    public DbInit(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    @PostConstruct
    private void createDefaultusers() {

        User user = new User( "user", "email");
        userDAO.addUser(user);

        User user1 = new User( "users", "emails");
        userDAO.addUser(user1);
    }

}