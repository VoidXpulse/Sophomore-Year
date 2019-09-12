public class Passenger {
    private int dcovered, distance;
    public Passenger(int d){
    }
    public int distanceadd(){
        dcovered++;
        if(dcovered >= distance){
            System.out.println("You dropped off the passenger");
            return (distance / 5) * 3;
        }
        else{
            return 0;
        }
    }
    public void reset(int d){
        distance = d;
        dcovered = 0;
    }
}
