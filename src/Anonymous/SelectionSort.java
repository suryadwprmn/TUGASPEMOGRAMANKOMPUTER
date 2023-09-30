package Anonymous;

public class SelectionSort {
    private String [] data;

    public void setData(String[] data) {
        this.data = data;
    }

    public void Sort(){
        int i, j , counter_i;

        String small;

        int n = this.data.length;
        for (i = 0 ; i <n -1 ;i++){
            counter_i = i;
            for (j = i +1 ; j < n ; j++){
                if (this.data[j].compareTo(this.data[counter_i]) < 0);
                {
                    small = this.data[j];
                    String temp = this.data[j];
                    this.data[j] = this.data[i];
                    this.data[i] = temp;
                }
            }
        }
    }

    public void PrintSort(){
        for (int i = 0; i < this.data.length;i++){
            System.out.println(this.data[i]+ " ");
        }
    }

    public static void main(String[] args) {
        String[] mahasiswa = {"aurya", "iizqi", "oaffa", "eerdi", "uulmi"};
        SelectionSort _mySS = new SelectionSort();
        _mySS.setData(mahasiswa);
        _mySS.Sort();
        _mySS.PrintSort();
    }
}
