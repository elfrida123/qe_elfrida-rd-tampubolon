package starter.comment;

import net.thucydides.core.annotations.Step;

public class Comment {
    @Step("I am on the home page")
    public void onPostPage(){
        System.out.println("I am on the home page");
    }

    @Step("I search the posting that I want to comment")
    public void SearchPosting(){
        System.out.println("I search the posting that I want to comment");
    }

    @Step("I click comment menu")
    public void ClickCommentMenu(){
        System.out.println("I click comment menu");
    }

    @Step("I write text")
    public void WriteTextonPosting(){
        System.out.println("I write text on comment posting");
    }

    @Step("I click Post button")
    public void ClickAddButton(){
        System.out.println("I click Add button");
    }

    @Step("my comment have been sent")
    public void CommentSent(){
        System.out.println("my comment have been sent");
    }
}
