public class Race {
public String leaderName;
public int leaderDistance;
private int timeRace = 24;

public void setLider(Car car) {
    int distance = car.speed * timeRace;
    if (leaderDistance < distance) {
        leaderDistance = distance;
        leaderName = car.name;
    }
}
}
