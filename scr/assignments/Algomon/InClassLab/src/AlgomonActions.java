public interface AlgomonActions {

  void offensive(Algomon attackingAlgomon);

  void defensive(Algomon defensiveAlgomon);

  void healing(Algomon healingAlgomon);

  void listAlgomons();

  Algomon showStatusById(Integer id);

  void showAllAlgomonsStatus();
  
  void removeAlgomon(Integer id);
}
