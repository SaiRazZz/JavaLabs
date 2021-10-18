import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Stixi implements Int {
    private ArrayList<Integer> paragraphСount;
    private String name;
    private int OglavCount;

    Stixi() {
    }

    Stixi(ArrayList<Integer> paragraphСount, String name, int OglavCount) {
        this.paragraphСount = paragraphСount;
        this.name = name;
        this.OglavCount = OglavCount;
    }


    public String getName()          {return name;}
    public void setName(String name) {this.name = name;}

    public int getOglavCount() {return OglavCount;}
    public void setOglavCount(int OglavCount) throws WrongParException  {
        if (OglavCount < 0) {
            throw new WrongParException("Incorrect Stixi OglavCount");
        }
        this.OglavCount = OglavCount;
    }

    @Override
    public ArrayList<Integer> getParagraphCount() {
        return null;
    }

    @Override
    public void setParagraphCount(ArrayList<Integer> paragraphCount) {

    }

    public ArrayList<Integer> getParagraphСount() {return paragraphСount;}

    public void setParagraphСount (ArrayList<Integer> paragraphСount) {
        if (paragraphСount == null) {
            throw new ParagraphCountIsNullRuntimeException("Stix paragraphCount is null");

        }
        this.paragraphСount = paragraphСount;
    }
    public int paragraphCountWithoutOglav(int index)
    {
        int result =  paragraphСount.get(index) - OglavCount;
        return result;
    }

    @Override
    public String toString() {
        return "Stixi{" +
                "paragraphСount=" + paragraphСount +
                ", name='" + name + '\'' +
                ", OglavCount=" + OglavCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stixi stixi = (Stixi) o;
        return OglavCount == stixi.OglavCount && Objects.equals(paragraphСount, stixi.paragraphСount) && Objects.equals(name, stixi.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paragraphСount, name, OglavCount);
    }
}

