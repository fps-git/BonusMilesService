public class BonusMilesService {
    public int calculate(int cost) {
        int miles = cost / 20;
        if (miles < 0) {
            miles = 0;
        }
        return miles;
    }
}
