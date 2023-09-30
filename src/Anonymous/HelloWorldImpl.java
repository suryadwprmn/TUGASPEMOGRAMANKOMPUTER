package Anonymous;

public class HelloWorldImpl {
    public static void main(String[] args) {
        HelloWorld english = new HelloWorld() {
            @Override
            public void SayHello() {
                System.out.println("Hello");
            }

            @Override
            public void SayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        HelloWorld indonesia = new HelloWorld() {
            @Override
            public void SayHello() {
                System.out.println("Hallo");
            }

            @Override
            public void SayHello(String name) {
                System.out.println("Hallo " + name);
            }
        };

        english.SayHello();
        english.SayHello("Surya");
        indonesia.SayHello("Dwi");
    }
}
