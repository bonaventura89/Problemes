public class Belly {
  private int cukes;
  
  public Belly() {
    if(cukes != 0)
    {
      this.cukes = 0;
    }
  }
  
  public void eat(int cukes) {
    if(cukes >= 0)
    {
       this.cukes += cukes;
    }
  }
  
  public void digest(int hour) {
    if(cukes > 0)
    {
      this.cukes -= hour;
    }
  }
  
  public int getCukes() {
      return cukes; 
  }
  
  
}
