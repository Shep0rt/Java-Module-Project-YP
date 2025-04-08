import java.util.Scanner;

public class Main {
    static Race race = new Race();
    static int numberOfCars = 3;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        for (int i = 1; i <= numberOfCars; i++) {
            String name;
            int speed;
            name = readName(i);
            speed = readSpeed(i);
            Car car = new Car(name, speed);
            race.setLider(car);
        }
        System.out.println("Победитель гонки: " + race.leaderName);
        System.out.println("Дистанция: " + race.leaderDistance);
    }

    private static int readSpeed(int number) {
        while (true) {
            System.out.println("— Введите скорость машины №" + number + ":");
             if(scanner.hasNextInt()) {
                int speed = scanner.nextInt();
                if (speed >= 0 && speed <= 250) {
                    return speed;
                } else {
                    System.out.println("— Неправильная скорость. Скорость должна быть в диапазоне от 0 до 250");
                }
            } else {
                System.out.println("— Неправильная скорость");
                if (scanner.hasNext()) {
                    scanner.next();
                }
            }
        }
    }

    private static String readName(int number) {
        while (true) {
            System.out.println("— Введите название машины №" + number + ":");
            String name = scanner.next();
            if (!name.isEmpty()) {
                return name;
            } else {
                System.out.println("Введено пустое название машины, попробуйте снова");
            }
        }
    }
}