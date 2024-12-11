import java.util.ArrayList;

public class Race {
    private final ArrayList<Car> cars;

    Race(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public Car getWinner() {

        Car winner = cars.getFirst();
        for (int i = 1; i < cars.size(); i++) {
            if (cars.get(i).speed > winner.speed) {
                winner = cars.get(i);
            }
        }


        return winner;
    }


}
