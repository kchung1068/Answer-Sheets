import java.util.ArrayList;

public class StudentAnswerSheet
{
  private ArrayList<String> answers;  // the list of the student's answers
  private String name;

  public StudentAnswerSheet(String nm, ArrayList<String> ans)
  {
    name = nm;
    answers = new ArrayList<String>();
    for (String a : ans)
      answers.add(a);
  }



  /** @param key the list of correct answers, represented as strings of length one
   *         Precondition: key.size() is equal to the number of answers in this answer sheet
   *  @return this student's test score
   */
  public double getScore(ArrayList<String> key)
  {
    double score = 0;
    for (int x = 0; x < key.size(); x += 1 ) {

      if (answers.get(x).equals("?")) {
        score += 0;
      } else if (answers.get(x).equals(key.get(x))) {
        score += 1;
      } else {
        score -= 0.25;
      }

    }
    return score;

  }

  // accessor (or get) methods
  public String getName()
  {
    return name;
  }
  public ArrayList<String> getAnswers()
  {
    return answers;
  }
}
