import java.util.ArrayList;

public interface Int {
    String getName();
    void setName(String name);

    int getOglavCount();
    void setOglavCount(int OglavCount) throws  WrongParException;
    ArrayList<Integer> getParagraphCount();
    void setParagraphCount(ArrayList<Integer>paragraphCount);


    int paragraphCountWithoutOglav(int index);
}