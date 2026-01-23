public class SocialNetworkApp {
    public static void main(String[] args) {
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        user1.createPost("Hello world! My first post.");
        user1.createPost("Java is fun to learn.");

        user1.showMyPosts();
        user2.showMyPosts();
    }
}