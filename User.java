import java.util.ArrayList;

public class User {
     String username;
     ArrayList<Post> myPosts;
     ArrayList<User> friends;

    public User(String username) {
        this.username = username;
        this.myPosts = new ArrayList<>();
        this.friends = new ArrayList<>();
    }

    // Add a new post to the user's profile
    public void createPost(String content) {
        myPosts.add(new Post(content));
    }

    // Add a friend connection
    public void addFriend(User friend) {
        if (!friends.contains(friend)) {
            friends.add(friend);
        }
    }

    // Display all posts from this user
    public void showMyPosts() {
        System.out.println("--- " + username + "'s Feed ---");
        for (Post p : myPosts) {
            System.out.println("- " + p.getContent());
        }
    }

    public String getUsername() {
        return username;
    }
}