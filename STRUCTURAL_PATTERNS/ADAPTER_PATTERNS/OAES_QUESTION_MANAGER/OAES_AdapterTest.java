
public class OAES_AdapterTest{
	public static void main(String[] args) {
		try{
			OAES_LMS_Adapter moodle = new OAES_Moodle_Adapter();
			OAES_QuestionManager qm = new OAES_QuestionManager(moodle);
			String[] questions = new String[3];
			questions[0] = "question 1";
			questions[1] = "question 2";
			questions[2] = "question 3";
			qm.sendQuestions(questions);
		}catch(Exception e){
				//Handle errors for Class.forName
				e.printStackTrace();
		}
	}
	//end main
};


