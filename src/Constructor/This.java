package Constructor;

public class This {

    // Dalam pembuatan constructor harus sama dengan classnya
    String name;
    String addres;

    public This(String paramName, String paramAddres) {
        this.name = paramName;
        this.addres = paramAddres;
    }

    public This(String paramName) {
        this(paramName,null);
    }
    public This(){
    this(null);
    }
}
