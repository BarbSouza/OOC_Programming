import java.util.ArrayList;

public class AlgomonManager implements AlgomonActions {
  ArrayList<Algomon> algomons;

  public AlgomonManager() {

    algomons = new ArrayList<>();
  }

  public void algomonsMenu(Algomon algomon) {
    algomons.add(algomon);
  }

  @Override
  public void offensive(Algomon attackingAlgomon) {
    /*
     * receive ids to be able to take health from the attacked algomon
     * */
    System.out.println(
        "Algomon: "
            + attackingAlgomon.getTypes()
            + " is attacking! Damage done: "
            + attackingAlgomon.getAttack());
  }

  // shows which Algon is defending.
  @Override
  public void defensive(Algomon defensiveAlgomon) {
    System.out.println(
        "Algomon: "
            + defensiveAlgomon.getTypes()
            + " is deffending! Defense power: "
            + defensiveAlgomon.getDefense());
  }

  @Override
  public void healing(Algomon healingAlgomon) {
    healingAlgomon.setHealth(healingAlgomon.getHealth() + 10);
    System.out.println(
        "Algomon: "
            + healingAlgomon.getTypes()
            + " healed! Current health: "
            + healingAlgomon.getHealth());
  }

  @Override
  public void listAlgomons() {
    for (Algomon algomon : algomons) {
      System.out.println(algomon);
    }
  }

  @Override
  public Algomon showStatusById(Integer id) {
    return null;
  }

  @Override
  public void showAllAlgomonsStatus() {}

  @Override
  public void removeAlgomon(Integer id) {
    for (Algomon algomon : algomons) {
      if (algomon.getId() == id) {
        algomons.remove(algomon);
        return;
      }
    }
  }
}
