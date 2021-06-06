import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

final class AccountUtils {

    private AccountUtils() { }

    public static void increaseBalance(Account account, long amount) throws NoSuchFieldException,
            IllegalAccessException{
        // write your code here
       Field fields =  Account.class.getDeclaredField("balance");
        fields.setAccessible(true);
        fields.set(account, (long) fields.get(account) + amount);

    }
}
//
//class Account {
//    private long balance;
//
//    public Account(long balance) {
//        this.balance = balance;
//    }
//
//    // some other methods
//}