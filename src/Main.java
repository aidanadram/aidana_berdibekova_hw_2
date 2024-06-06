import java.util.Random;

public class Main {
    public static void main (String[] args){
        System.out.println(permission(21, 16) );
        System.out.println(permission(9, 30) );
        System.out.println(permission(16, 1) );
        System.out.println(permission(38, -22) );
        System.out.println(permission(54, 25) );


    }
    public static void generateRandomAge(int age, int temperature){
        Random random = new Random();
        int generateRandomAge = random.nextInt(100);
        System.out.println(permission(generateRandomAge(), 16));
        System.out.println(permission(generateRandomAge(), 30));
        System.out.println(permission(generateRandomAge(), 1));
        System.out.println(permission(generateRandomAge(), -22));
        System.out.println(permission(generateRandomAge(), 25));
    }

    private static int generateRandomAge() {
        return 0;

    }

    public static String permission(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять! ";
        }else if (age < 20 && temperature >=0 && temperature <= 28) {
            return "Можно идти гулять! ";
        }else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять! ";
        }else {
            return "Оставайтесь дома! ";}

        }
    }
