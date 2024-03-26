package Maps;

public class Main {
    public static void main(String[] args) {
        MyMap<String,String> maps = new MyMap<>();
        maps.put("Philippines","Cebu");
        maps.put("Indonesia","Bandung");
        maps.put("Australia","Melbourne");
        System.out.println(maps.remove("Singapore"));
        maps.display();
        System.out.println(maps.get("Indonesia"));
        maps.put("Australia","Canberra");
        maps.put("Indonesia","Jakarta");
        maps.put("Philippines","Manila");
        maps.put("Ukraine","Pripyat");
        maps.put("Ukraine","Kyiv");
        maps.display();
        System.out.println(maps.remove("Ukraine"));
        /*MyMap<Integer,Double> maps = new MyMap<>();
        maps.put(1,5.6);
        maps.put(2,6.9);
        maps.put(3,42.0);
        maps.remove(2);
        maps.display();*/
    }
}
