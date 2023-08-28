public class OAES_QuestionManager {
    
    public OAES_LMS_Adapter adapter;

    public OAES_QuestionManager(OAES_LMS_Adapter adapter)
    {
        this.adapter = adapter;
    }

    public void sendQuestions(String[] questions) 
    {
        
        for (String question : questions) {
            OAES_Question oaesQuesObj = new OAES_Question(question);
            adapter.pushQuestion(oaesQuesObj);
        }
    }
    
}
