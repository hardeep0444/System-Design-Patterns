public class OAES_Canvas_Adapter implements OAES_LMS_Adapter{

    @Override
    public void pushQuestion(OAES_Question question) {
        Canvas_API canvas_API = new Canvas_API();
        canvas_API.displayQuestion(question);
    }
}
