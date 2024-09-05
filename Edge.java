// PROG2 VT24, Inlämningsuppgift, del 2
// Grupp 159
// Max Lindberg mali7984
// William Ekedahl wiek0904
// Simon Lundqvist silu8199

public class Edge<T>{
    private T destination;
    private int weight;
    private String name;

    public Edge(T destination, int weight, String name){
        this.destination= destination;
        this.weight= weight;
        this.name=name;

    }
    public T getDestination(){
        return destination;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight (int x){
        if (x<0){
            throw new IllegalArgumentException();
        }else {
            weight = x;
        }
    }
    public String getName(){
        return name;
    }

    public String toString(){
        return "till " + getDestination() + " med " + getName() + " tar " + String.valueOf(getWeight()) + "\n";
    }
}



