public class official_friends extends Friends {
    public String designation;

    public official_friends(String[] arr) {
        super(arr[0], arr[1], arr[3]);
        this.designation = arr[2];

    }

    public String getDesignation(){
        return designation;
    }

}

