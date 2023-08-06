package helper;

import model.entity.Card;

public class ServiceHelper {
    public static void changeBalance(Card card,boolean isSender,double transferMoney) {
        double newAmount = isSender ? card.getAmount() - transferMoney - fee(transferMoney) :
                card.getAmount() + transferMoney;
        card.setAmount(newAmount);
    }

    public static double fee(double transferMoney) {
        return transferMoney/100 + 1;
    }
    public static String transferMessage(Card receiverCard, Card senderCard, double transferMoney) {
        return  "----------------------------------------------------\n" +
                "Amount of transfer money: " + transferMoney + "\n" +
                "Comission fee: " + fee(transferMoney) + "\n" +
                "Card number of receiver account: " + cardNumberMasker(receiverCard.getCardNumber())+ "\n" +
                "Balance of account: " + (senderCard.getAmount() - transferMoney) + "\n" +
                "----------------------------------------------------\n";
    }
    public static String cardNumberMasker(String receiverCard) {
        return receiverCard.replace(receiverCard.substring(0,12),"************");
    }
}
