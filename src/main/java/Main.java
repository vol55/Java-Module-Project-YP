import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        String name;
        int speed;

        for (int i = 0; i < 3; i++) {
            System.out.printf("— Введите название машины №%d:\n", i + 1);
            name = scanner.next();

            while (true) {
                System.out.printf("— Введите скорость машины #%d\n", i + 1);
                speed = Integer.parseInt(scanner.next());
                if (speed >= 0 && speed <= 250) {
                    break;
                } else {
                    System.out.println("— Неправильная скорость");
                }
            }

            cars.add(new Car(name, speed));
        }

        Race race = new Race(cars);
        System.out.printf("Самая быстрая машина: %s\n", race.getWinner().name);
    }
}
