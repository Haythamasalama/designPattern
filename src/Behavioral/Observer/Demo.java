package Behavioral.Observer;

public class Demo {
    public static void main(String[] args) {
        Follower haythamasalama = new Follower("haythamsalsama");
        Tweet tweet = new Tweet("Welcome Friends!!");
        
        tweet.subscribe(haythamasalama);
        tweet.notifyToAll();
    }
}
