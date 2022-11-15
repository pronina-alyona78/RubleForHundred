public class Main {
    public static void main(String[] args) {

        int initAccount = 200;
        int addAccount = 1500;
        int bonusRuble;
        int finalAccount;

        if (addAccount > 1000) {
            bonusRuble = addAccount / 100;
        } else {
            bonusRuble = 0;
        }
        finalAccount = initAccount + addAccount + bonusRuble;
        System.out.println("Количество бонусных рублей = " + bonusRuble);
        System.out.println("Итоговый счет = " + finalAccount);
    }


}



