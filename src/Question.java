import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Question {
    private int id;
    private String question;
    private List<Answers> answers;
    private Map<String, String> weight;

    public Question(){}

    public Question(int id, String question, List<Answers> answers) {
        this.id = id;
        this.question = question;
        this.answers = answers;
    }

    public Question(int id, String question, List<Answers> answers, Map<String, String> weight) {
        this.id = id;
        this.question = question;
        this.answers = answers;
        this.weight = weight;
    }

    public void displayInfo() {
        System.out.println("Qid: " + id + ", Questions: " + question);
        Iterator<Answers> itr = answers.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().toString());
        }
        Iterator<Map.Entry<String, String>> itr1 = weight.entrySet().iterator();
        while (itr1.hasNext()){
            Map.Entry<String, String> cur = itr1.next();
            System.out.println(cur.getKey() + ", " + cur.getValue());
        }
    }
}
