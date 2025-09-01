abstract class Ticket{
    String pnr;
    String passenger;
    public Ticket(String pnr,String passenger){
       this.pnr=pnr;
       this.passenger=passenger;
    }
    public void display(){
        System.out.println("pnr:"+pnr+"passenger:"+passenger);
    }
abstract double calculateFare();
}
class SleeperclassTicket extends Ticket{
    double baseFare;
    double SleeperSurcharge;

    public SleeperclassTicket(String pnr, String passenger, double baseFare) {
        super(pnr, passenger);
        this.baseFare = baseFare;
        this.SleeperSurcharge = 50.0;
    }

    double calculateFare(){
        return baseFare + SleeperSurcharge;
    }
}
class AC3TierTicket extends Ticket{
    double baseFare;
    double AC3TierSurcharge;
    public AC3TierTicket(String pnr,String passenger,double baseFare){
        super(pnr,passenger);
        this.baseFare=baseFare;
        this.AC3TierSurcharge=250.0;
    }
    double calculateFare(){
        return baseFare+AC3TierSurcharge;
    }
}
public class TicketBooking {
    public static void main(String[] args) {
        SleeperclassTicket sleeperTicket=new SleeperclassTicket("654321","revanth",650);
        AC3TierTicket ac3TierTicket=new AC3TierTicket("123456","sai",1200);
        sleeperTicket.display();
        System.out.println("Sleeper class fare:"+sleeperTicket.calculateFare());
        ac3TierTicket.display();
        System.out.println("AC 3 Tier fare:"+ac3TierTicket.calculateFare());
    }
}