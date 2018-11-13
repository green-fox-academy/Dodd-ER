package post.it;

import java.awt.*;

public class Main {
    public static void main(String[] args){
        PostIt newPostIt1 = new PostIt(Color.ORANGE, "Idea1 ", Color.BLUE);
        PostIt newPostIt2 = new PostIt(Color.PINK, "Awesome", Color.BLACK);
        PostIt newPostIt3 = new PostIt(Color.YELLOW, "Superb", Color.GREEN);

        System.out.println(newPostIt1);
        System.out.println(newPostIt2);
        System.out.println(newPostIt3);
    }
}
