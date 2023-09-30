package Static;

public class Method {

    public static int sum(int... values){
        int total = 1;

        for (var value : values){
            total *= value;
        }
        return total;
    }
}
