
public class User {

    static int user_id = 0;
    private final String UserName;
    private final int UserPhone;
    private int numberOfReversedTickets;
    private Ticket userTicket;

    public User(String userName, int userPhone, int numberOfReversedTickets , Ticket userTicket) {
        UserName = userName;
        UserPhone = userPhone;
        this.numberOfReversedTickets = numberOfReversedTickets;
        user_id++;
        this.userTicket = userTicket;
    }

    public String reservedCategory () {
        return userTicket.getCategory();
    }

    public int getNumberOfReversedTickets() {
        return numberOfReversedTickets;
    }

    public int getUserPhone() {
        return UserPhone;
    }

    public String getUserName() {
        return UserName;
    }



}