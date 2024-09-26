//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println ( "Задача №1" );
        for (int i = 1; i <= 10; i++) {
            System.out.print ( " " + i );
        }

        System.out.println ( "\nЗадача №2" );
        for (int i = 10; i >= 1; i--) {
            System.out.print ( " " + i );
        }

        System.out.println ( "\nЗадача №3" );
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.print ( " " + i );
        }

        System.out.println ( "\nЗадача №4" );
        for (int i = 10; i >= -10; i--) {
            System.out.print ( " " + i );
        }

        System.out.println ( "\nЗадача №5" );
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println ( i + " год является високосным" );
        }

        System.out.println ( "\nЗадача №6" );
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print ( " " + i );
        }

        System.out.println ( "\nЗадача №7" );
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print ( " " + i );
        }

        System.out.println ( "\nЗадача №8" );
        int money = 0;
        for (int i = 1; i <= 12; i++) {
            money = money + 29000;
            System.out.println ( "Месяц - " + i + ", сумма накоплений равна " + money + " рублей" );
        }

        System.out.println ( "\nЗадача №9" );
        float moneyInBank = 0.0f;
        for (int i = 1; i <= 12; i++) {
            moneyInBank = moneyInBank * 1.01f + 29000;
            System.out.println ( "Месяц - " + i + ", сумма накоплений равна " + moneyInBank + " рублей" );
        }

        System.out.println ( "\nЗадача №10" );
        for (int i = 0; i <= 10; i++) {
            System.out.print ( " " + 2 * i );
        }
    }
}
