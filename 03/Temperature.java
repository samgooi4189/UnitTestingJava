public class Temperature {
  public int celcius;

  public Temperature() {
    this.celcius=36;
  }

  public int now() {
    return this.celcius;
  }

  public void set(int celcius) {
    this.celcius = celcius;
  }
}
