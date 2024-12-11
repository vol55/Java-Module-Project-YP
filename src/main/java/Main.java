import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        String name;
        String speed;

        for (int i = 0; i < 3; i++) {
            System.out.printf("— Введите название машины №%d:\n", i + 1);
            name = scanner.next();

            while (true) {
                System.out.printf("— Введите скорость машины #%d\n", i + 1);
                speed = scanner.next();
                if (isSpeedLegit(speed)) {
                    break;
                }
                System.out.println("— Неправильная скорость");
            }

            cars.add(new Car(name, Double.parseDouble(speed)));
        }

        scanner.close();
        Race race = new Race(cars);
        System.out.printf("Самая быстрая машина: %s\n", race.getWinner().name);
    }

    private static boolean isSpeedLegit(String userInput) {
        try {
            double speed = Double.parseDouble(userInput);
            return speed >= 0 && speed <= 250;

        } catch (NumberFormatException e) {
            return false;
        }
    }
}
