import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> kv = new HashMap<String, Integer>(args.length);
        for (String i: args) {
          if (kv.containsKey(i)) {
            kv.put(i, kv.get(i)+1);
          } else {
            kv.put(i, 1);
          };
        }
        System.out.println(kv);
    }
}
