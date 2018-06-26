import java.util.Iterator;
import java.util.List;

public class Question {
    private int id;
    private String question;
    private List<Answers> answers;

    public Question(){}

    public Question(int id, String question, List<Answers> answers) {
        this.id = id;
        this.question = question;
        this.answers = answers;
    }

    public void displayInfo() {
        System.out.println("Qid: " + id + ", Questions: " + question);
        Iterator<Answers> itr = answers.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().toString());
        }
    }
}
