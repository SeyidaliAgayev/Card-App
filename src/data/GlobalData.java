package data;
import model.entity.Card;
import model.entity.User;

import java.util.Random;

public class GlobalData {
    public static final User[] users;
    public static final Card[] cards;

    static {
        int id = 1;
        Random random = new Random();
        cards = new Card[] {
                new Card(id++, "4169738858447601",String.valueOf(random.nextInt(899) + 100),
                        "08/27",98700.54),
                new Card(id++, "4169738858447602",String.valueOf(random.nextInt(899) + 100),
                        "08/27",5000.45),
                new Card(id++, "4169738858447603",String.valueOf(random.nextInt(899) + 100),
                        "08/27",15600.37),
                new Card(id++, "4169738858447604",String.valueOf(random.nextInt(899) + 100),
                        "08/27",700.89),
                new Card(id++, "4169738858447605",String.valueOf(random.nextInt(899) + 100),
                        "08/27",85800.65),

        };
    }
    static {
        int id = 1;
        users = new User[] {
                new User(id++,"AA","AAA","AAAAA","123456",
                        "ABCD001","+994111111111",cards[0]),
                new User(id++,"BB","BBB","BBBBB","123457",
                        "ABCD002","+994222222222",cards[1]),
                new User(id++,"CC","CCC","CCCCC","123458",
                        "ABCD003","+994333333333",cards[2]),
                new User(id++,"DD","DDD","DDDDD","123459",
                        "ABCD004","+994444444444",cards[3]),
                new User(id++,"EE","EEE","EEEEE","123450",
                        "ABCD005","+994555555555",cards[4]),
        };
    }

}
