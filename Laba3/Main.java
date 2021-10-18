import java.util.*;


public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static LinkedList<Int> collections = new LinkedList<Int>();
    private static String name = "";
    private static int OglavCount = 0;
    private static ArrayList<Integer> paragraphCount = new ArrayList<Integer>();
    private static ArrayList<Integer> paragraphCount2 = new ArrayList<Integer>();
    private static ArrayList<Integer> paragraphCount3 = new ArrayList<Integer>();
    private static ArrayList<Integer> paragraphCount4 = new ArrayList<Integer>();

    public static void main(String[] args){


        var sbornikPoam1 = new SbornikPoam();
        var sbornikPoam2 = new SbornikPoam();
        var stixi1 = new Stixi();
        var stixi2 = new Stixi();

        try {
            sbornikPoam1.setParagraphСount(paragraphCount);
            paragraphCount.add(10);
            sbornikPoam1.setName("Poema#1");
            sbornikPoam1.setOglavCount(1);
            collections.add(sbornikPoam1);


            sbornikPoam2.setParagraphСount(paragraphCount2);
            paragraphCount2.add(15);
            sbornikPoam2.setName("Poema#2");
            sbornikPoam2.setOglavCount(3);
            collections.add(sbornikPoam2);

            stixi1.setParagraphСount(paragraphCount3);
            paragraphCount3.add(25);
            stixi1.setName("Anekdot#1");
            stixi1.setOglavCount(2);
            collections.add(stixi1);

            stixi2.setParagraphСount(paragraphCount4);
            paragraphCount4.add(12);
            stixi2.setName("Anekdot#2");
            stixi2.setOglavCount(4);
            collections.add(stixi2);
        }

        catch (WrongParException ex)
        {
            System.err.println(ex.getMessage());
        }

        System.out.println(collections.get(0).paragraphCountWithoutOglav(0));

        var map = new HashMap<Integer, LinkedList<Int>>();
        int key;
        for (Int col : collections) {
            key = col.paragraphCountWithoutOglav(0);
            if (map.containsKey(key)) {
                map.get(key).add(col);
            } else {
                var list = new LinkedList<Int>();
                list.add(col);
                map.put(key, list);
            }
        }

        System.out.println("map");
        System.out.println(map);

        var sbornikPoam = new LinkedList<SbornikPoam>();
        var stixi = new LinkedList<Stixi>();
        for (Int col : collections) {
            if (col instanceof SbornikPoam) {
                sbornikPoam.add((SbornikPoam) col);
            }

            else if (col instanceof Stixi) {
                stixi.add((Stixi) col);
            }
        }

        System.out.println("sbornikPoam");
        System.out.println(sbornikPoam);
        System.out.println("Stixi");
        System.out.println(stixi);
    }
}