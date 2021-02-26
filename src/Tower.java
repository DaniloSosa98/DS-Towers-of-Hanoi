
public class Tower<E> {
    public char name;
    Stack tower = new Stack();

    public Tower() {
    }

    public Tower(char name) {
        this.name = name;
    }

    public void add(Disk disk){
        tower.push(disk);
    }
    
    public Node<E> remove(){
        return tower.pop();
    }
    
    public char getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Tower: "+ name;
    }
    
}
