public class Moodle_API {
    


    public void displayQuestion(OAES_Question ques) {
        Moodle_Question modq = new Moodle_Question(ques.toString());
        System.out.println("Moodle1 Questions...\n");
        System.out.println(modq.getQuestion());
    }
}
