import java.util.ArrayList;

public class Player {
  private ArrayList<Integer> selecedAlgomon;
  private AlgomonManager algomonManager;
  
  public Player() {
    selecedAlgomon = new ArrayList<>();
  }
  public void addAlgomon(Integer id) {
    selecedAlgomon.add(id);
  }
  
  public void listAlgomons() {
    algomonManager.listAlgomons();      
  }
  
}
