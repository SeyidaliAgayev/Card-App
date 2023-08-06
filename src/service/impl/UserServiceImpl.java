package service.impl;

import data.GlobalData;
import exception.ApplicationException;
import model.entity.User;
import model.enums.Exceptions;
import service.CardManagementService;
import service.UserService;

import static util.InputUtil.*;



public class UserServiceImpl implements UserService {
    private static int failedAttempts = 0;
    private CardManagementService cardManagementService;
    public UserServiceImpl() {
        cardManagementService = new CardManagementServiceImpl();
    }
    @Override
    public void signIn() {
        String phoneNumberOrFin = stringInput("Enter phone number or fin: ").toUpperCase();
        String password = stringInput("Enter password: ");
        boolean userDoesntExist = true;

        for (User user: GlobalData.users) {
            if (user.getFin().equals(phoneNumberOrFin) || user.getPhoneNumber().equals(phoneNumberOrFin)) {
                userDoesntExist = false;
                if (user.getPassword().equals(password)) {
                    failedAttempts = 0;
                    cardManagementService.cardManagement(user.getId());
                } else {
                    failedAttempts++;
                }
                if (failedAttempts == 3) {
                    System.exit(1);
                }
            }
        }
        if (userDoesntExist) {
            throw new ApplicationException(Exceptions.USERNAME_NOT_FOUND);
        }
    }
}
