public class Algomon {

  private Integer id;
  private AlgomonTypes types;
  private Integer health;
  private Integer attack;
  private Integer defense;
  private Integer speed;

  public Algomon(
      Integer id,
      AlgomonTypes types,
      Integer health,
      Integer attack,
      Integer defense,
      Integer speed) {
    this.id = id;
    this.types = types;
    this.health = health;
    this.attack = attack;
    this.defense = defense;
    this.speed = speed;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public AlgomonTypes getTypes() {
    return types;
  }

  public void setTypes(AlgomonTypes types) {
    this.types = types;
  }

  public Integer getHealth() {
    return health;
  }

  public void setHealth(Integer health) {
    this.health = health;
  }

  public Integer getAttack() {
    return attack;
  }

  public void setAttack(Integer attack) {
    this.attack = attack;
  }

  public Integer getDefense() {
    return defense;
  }

  public void setDefense(Integer defense) {
    this.defense = defense;
  }

  public Integer getSpeed() {
    return speed;
  }

  public void setSpeed(Integer speed) {
    this.speed = speed;
  }

  @Override
  public String toString() {
    return "Algomon{"
        + "id="
        + id
        + ", types="
        + types
        + ", health="
        + health
        + ", attack="
        + attack
        + ", defense="
        + defense
        + ", speed="
        + speed
        + '}';
  }
}

