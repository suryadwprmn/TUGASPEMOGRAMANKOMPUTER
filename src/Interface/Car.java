package Interface;

public interface Car extends HasBrand,IsMaintanance {




    String name = "Avanza"; // harus ada isinya / constant
    void drive(); // sama seperti abstrak method

    public abstract int getTier(); //


     default boolean isBig(){
         return true;
         // default digunakan untuk abstrak agar tidak di override

     }
}
