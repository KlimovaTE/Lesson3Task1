public class BonusMilesService {
    public int calculate(int cost) {

        int rublesPerMile = 20;
        int bonusMiles;

        bonusMiles = cost / rublesPerMile;

        return bonusMiles;
    }

}
