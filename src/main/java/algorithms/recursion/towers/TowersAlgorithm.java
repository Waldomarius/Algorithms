package algorithms.recursion.towers;

public class TowersAlgorithm {

    public void doTower(int numberElement, char towerA, char towerB, char towerC) {

        if (numberElement == 1) {
            System.out.println("Disk 1 from " + towerA + " to " + towerC);

        } else {
            doTower(numberElement - 1, towerA, towerC, towerB);

            System.out.println("Disk " + numberElement + " from " + towerA + " to " + towerC);

            doTower(numberElement - 1, towerB, towerA, towerC);
        }
    }
}
