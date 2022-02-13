
package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserService service = new UserServiceImpl();

        service.createUsersTable();

        service.saveUser("Ivan", "Ivanov", (byte) 20);
        service.saveUser("Petr", "Petrov", (byte) 21);
        service.saveUser("Sidr", "Sidorov", (byte) 22);
        service.saveUser("Viktor", "Viktorov", (byte) 23);

        System.out.println(service.getAllUsers());

        service.cleanUsersTable();
        service.dropUsersTable();
    }
}
