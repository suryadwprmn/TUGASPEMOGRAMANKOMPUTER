package Static;

public class Inner {
    public static String name;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Inner.name = name;
    }

    public static class InnerApp{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
