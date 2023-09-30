package Record;

public class RecordApp {
    public static void main(String[] args) {
        Record record = new Record("Surya","rahasia");
        System.out.println(record.username());
        System.out.println(record.password());

        System.out.println(record);
    }
}
