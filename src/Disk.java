public class Disk {
    int size;
   

    public Disk() {
    }

    public Disk(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return String.valueOf(size);
    }

}
