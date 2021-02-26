
class TowersApp {

    static int nDisks = 6;

    static int count = 0;

    public static void main(String[] args) {
        Tower A = new Tower('A');
        Tower B = new Tower('B');
        Tower C = new Tower('C');

        for (int i = nDisks; i > 0; i--) {
            A.add(new Disk(i));
        }
        System.out.println("Amount of Disks: " + nDisks + "\n");
        Towers(nDisks, A, B, C);
        
        System.out.println("Total Steps: " + count);
        System.out.println("This hoolds to O(2^N-1) efficiency as this operation shows");
        System.out.println((Math.pow(2, nDisks))-1);

    }

    public static void Towers(int topN, Tower src, Tower inter, Tower dest) {

        if (topN > 0) {
            count++;   
            Towers(topN - 1, src, dest, inter);
            Node<Disk> temp = src.remove();
            dest.add(temp.data);
            System.out.println("Moved Disk " + temp.data.size + " from Tower: " + src.name + " to Tower: " + dest.name + "\n");
            Towers(topN - 1, inter, src, dest);

        }
    }

}
