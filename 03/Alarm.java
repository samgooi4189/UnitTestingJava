public class Alarm {
  
  Temperature temperature = new Temperature();
  
  public Alarm() {
    
  }

  public boolean isHot() {
    return temperature.now() > 40;
  }

  public boolean isCold() {
    return temperature.now() < 10;
  }

  
}
