package service.impl;

import exception.ApplicationException;
import model.enums.Exceptions;
import service.CardManagementService;
import service.CardService;
import service.UserService;

import static util.MenuUtil.*;

public class CardManagementServiceImpl implements CardManagementService {
    @Override
    public void cardManagement(long userId) {
        CardService cardService = new CardServiceImpl();


        while (true) {
            int option = accountMenu();
                switch (option) {
                    case 0:
                        System.exit(100);
                        break;
                    case 1:
                        cardService.cardToCard(userId);
                        break;
                    case 2:
                        cardService.showBalance(userId);
                        break;
                    case 3:
                        UserManagementServiceImpl userManagementService = new UserManagementServiceImpl();
                        userManagementService.userManagement();
                        break;
                    default:
                        throw new ApplicationException(Exceptions.INVALID_OPTION);
                }
            }
        }
    }

