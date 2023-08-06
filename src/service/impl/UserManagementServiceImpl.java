package service.impl;

import exception.ApplicationException;
import model.enums.Exceptions;
import service.UserManagementService;
import service.UserService;

import static util.MenuUtil.entryMenu;

public class UserManagementServiceImpl implements UserManagementService {
        @Override
        public void userManagement() {
            UserService userService = new UserServiceImpl();

            int option = entryMenu();

            while (true) {
                try {
                    switch (option) {
                        case 0:
                            System.exit(100);
                            break;
                        case 1:
                            userService.signIn();
                            break;
                        default:
                            throw new ApplicationException(Exceptions.INVALID_OPTION);
                    }
                } catch (ApplicationException exception) {
                    System.out.println(exception.getMessage());
                }
            }
        }
}
