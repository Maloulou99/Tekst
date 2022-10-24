import java.util.ArrayList;

public class Tekst {

    ArrayList<String> tekstLinjer = new ArrayList<>();

    public void tilføj(String tekstLinje) {
        tekstLinjer.add(tekstLinje);
    }

  public int tilføjAntalUnikke() {
      ArrayList<String> teksts = new ArrayList<>();
      for (String n : tekstLinjer) {
          if (!teksts.contains(n)) {
              teksts.add(n);
          }
      }return teksts.size();
  }

    public String toString(){
        return tekstLinjer.get(0);
    }
}
