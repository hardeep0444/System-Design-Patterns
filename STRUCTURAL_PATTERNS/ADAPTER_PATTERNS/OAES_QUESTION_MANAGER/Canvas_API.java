public class Canvas_API {
    public void displayQuestion(OAES_Question ques) {
        Canvas_Question canq = new Canvas_Question(ques.toString());
        System.out.println("Canvas Questions...\n");
        System.out.println(canq.getQuestion());
    }
}
