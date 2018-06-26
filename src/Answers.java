public class Answers {
    private int id;
    private String description;
    private String postBy;

    public Answers(){}

    public Answers(int id, String description, String postBy) {
        this.id = id;
        this.description = description;
        this.postBy = postBy;
    }

    public String toString() {
        return id + ", " + description + ", " + postBy;
    }
}
