import java.util.ArrayList;

public class UserClass
{
    private String name;
    private String email;
    private int dateOfBirth;
    private ArrayList notificationBox;
    private ArrayList postList;
    private ArrayList timeLine;
    private ArrayList favPosts;
    private ArrayList followedList;
    private String place;
    private ArrayList incoming;
    private ArrayList outgoing;

    public UserClass(String name, String email, int dateOfBirth, ArrayList notificationBox, ArrayList postList, ArrayList timeLine, ArrayList favPosts, ArrayList followedList, String place, ArrayList incoming, ArrayList outgoing)
    {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.notificationBox = notificationBox;
        this.postList = postList;
        this.timeLine = timeLine;
        this.favPosts = favPosts;
        this.followedList = followedList;
        this.place = place;
        this.incoming = incoming;
        this.outgoing = outgoing;
    }


    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public int getDateOfBirth() { return dateOfBirth; }

    public void setDateOfBirth(int dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public ArrayList getNotificationBox() { return notificationBox; }

    public void setNotificationBox(ArrayList notificationBox) { this.notificationBox = notificationBox; }

    public ArrayList getPostList() { return postList; }

    public void setPostList(ArrayList postList) { this.postList = postList; }

    public ArrayList getTimeLine() { return timeLine; }

    public void setTimeLine(ArrayList timeLine) { this.timeLine = timeLine; }

    public ArrayList getFavPosts() { return favPosts; }

    public void setFavPosts(ArrayList favPosts) { this.favPosts = favPosts; }

    public ArrayList getFollowedList() { return followedList; }

    public void setFollowedList(ArrayList followedList) { this.followedList = followedList; }

    public String getPlace() { return place; }

    public void setPlace(String place) { this.place = place; }

    public ArrayList getIncoming() { return incoming; }

    public void setIncoming(ArrayList incoming) { this.incoming = incoming; }

    public ArrayList getOutgoing() { return outgoing; }

    public void setOutgoing(ArrayList outgoing) { this.outgoing = outgoing; }
}
