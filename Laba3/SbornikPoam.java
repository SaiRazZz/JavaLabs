import java.io.Serial;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.List;

public class SbornikPoam implements Int {
    private ArrayList<Integer> paragraphСount;
    private String name;
    private int OglavCount;

    SbornikPoam() {
    }

    SbornikPoam(ArrayList<Integer> paragraphСount, String name, int OglavCount) {
        this.paragraphСount = paragraphСount;
        this.name = name;
        this.OglavCount = OglavCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOglavCount() {
        return OglavCount;
    }

    public void setOglavCount(int OglavCount) throws WrongParException {
        if (OglavCount < 0) {
            throw new WrongParException("Incorrect Poema OglavCount");
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

    public ArrayList<Integer> getParagraphСount() {
        return paragraphСount;
    }

    public void setParagraphСount(ArrayList<Integer> paragraphСount) {
        if (paragraphСount == null) {
            throw new ParagraphCountIsNullRuntimeException("Poema paragraphCount is null");
        }
        this.paragraphСount = paragraphСount;
    }

    public int paragraphCountWithoutOglav(int index) {
        int result = paragraphСount.get(index) - OglavCount;
        return result;
    }

    @Override
    public String toString() {
        return "SbornikPoam{" +
                "paragraphСount=" + paragraphСount +
                ", name='" + name + '\'' +
                ", OglavCount=" + OglavCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SbornikPoam that = (SbornikPoam) o;
        return OglavCount == that.OglavCount && Objects.equals(paragraphСount, that.paragraphСount) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paragraphСount, name, OglavCount);
    }

}