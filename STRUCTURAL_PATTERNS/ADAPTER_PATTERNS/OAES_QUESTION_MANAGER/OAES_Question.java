public class OAES_Question {
    String question;

    public OAES_Question(String question) {
        this.question = question;
    }
    
    public String getQuestion() {
        return question;
    }
     public void setQuestion(String question) {
        this.question = question;
    }
    
    @Override
    public String toString() {
        return "OAES_Question{" +
        "question='" + question + '\'' +
        '}';
    }
    
}