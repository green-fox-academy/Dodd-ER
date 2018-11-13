package blogpost;
//        Create a BlogPost class that has
//        an authorName
//        a title
//        a text
//        a publicationDate

public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    BlogPost(){
        this("", "", "", "");
    }

    BlogPost(String authorName,String title, String text, String publicationDate){
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }
}
