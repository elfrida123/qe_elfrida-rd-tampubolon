    package starter.stepdefinitions.comment;

    import io.cucumber.java.en.And;
    import io.cucumber.java.en.Given;
    import io.cucumber.java.en.Then;
    import io.cucumber.java.en.When;
    import net.thucydides.core.annotations.Steps;
    import starter.comment.Comment;

    public class CommentSteps {
        @Steps
        Comment comment;

        @Given("I am on the posting page")
        public void onHPostingPage(){
            comment.onPostPage();
        }

        @Then("I search the posting that I want to comment")
        public void SearchPosting(){
            comment.SearchPosting();
        }

        @Then("I click comment menu")
        public void ClickCommentMenu(){
            comment.ClickCommentMenu();
        }

        @When("I write text on comment posting")
        public void WriteText(){
            comment.WriteTextonPosting();
        }

        @And("I click Add button")
        public void ClickAddButton(){
            comment.ClickAddButton();
        }

        @Then("my comment have been sent")
        public void CommentSent(){
            comment.CommentSent();
        }
    }
