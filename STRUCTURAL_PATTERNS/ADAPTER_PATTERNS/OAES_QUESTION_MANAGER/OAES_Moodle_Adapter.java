public class OAES_Moodle_Adapter implements OAES_LMS_Adapter {

    @Override
    public void pushQuestion(OAES_Question question) {
        Moodle_API moodle_API = new Moodle_API();
        moodle_API.displayQuestion(question);
    }
    
}
