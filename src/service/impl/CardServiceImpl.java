package service.impl;

import data.GlobalData;
import exception.ApplicationException;
import model.entity.User;
import model.enums.Exceptions;
import service.CardService;
import static util.InputUtil.*;
import static helper.ServiceHelper.*;


public class CardServiceImpl implements CardService {
    @Override
    public void cardToCard(long id) {
        String receiverCard = stringInput("Enter receiver card number: ");
        double transferMoney = doubleInput("Enter transfer money: ");

        User senderAccount = new User();
        User receiverAccount = new User();

        for (User user: GlobalData.users) {
            if (user.getId() == id) {
                senderAccount = user;
                if (user.getCard().getAmount() < transferMoney + fee(transferMoney)) {
                    throw new ApplicationException(Exceptions.LOW_BALANCE_EXCEPTION);
                }
            }
            if (user.getCard().getCardNumber().equals(receiverCard)) {
                receiverAccount = user;
            }
        }

        System.out.println(transferMessage(receiverAccount.getCard(),
                senderAccount.getCard(),transferMoney));

        if (senderAccount.getCard().getCardNumber().equals(receiverCard)){
            throw new ApplicationException(Exceptions.THE_SAME_CARD_NUMBER_EXCEPTION);
        }
//        if (receiverAccount.getCard().getCardNumber() == null) {
//            throw new ApplicationException(Exceptions.EMPTY_CARD_NUMBER_EXCEPTION);
//        }

        changeBalance(senderAccount.getCard(), true, transferMoney);
        changeBalance(receiverAccount.getCard(),false, transferMoney);
    }

    @Override
    public void showBalance(long id) {
        for (User user: GlobalData.users) {
            if (user.getId() == id) {
                System.out.println("-------------------------------------------------------------\n");
                System.out.println("Dear customer, your balance: " + user.getCard().getAmount());
                System.out.println("-------------------------------------------------------------\n");
            }
        }
    }
}
