import java.util.ArrayList;
import java.util.Arrays;

public class TestScoreRunner
{
  public static void main(String[] args)
  {
    ArrayList<String> key = new ArrayList<String>(Arrays.asList(
              new String[] {"A", "C", "D", "E", "B", "C", "E", "B", "B", "C"}));

    ArrayList<String> answers1 = new ArrayList<String>(Arrays.asList(
              new String[] {"A", "B", "D", "E", "A", "C", "?", "B", "D", "C"}));

    ArrayList<String> answers2 = new ArrayList<String>(Arrays.asList(
              new String[] {"A", "?", "D", "E", "A", "C", "?", "B", "D", "C"}));

    ArrayList<String> answers3 = new ArrayList<String>(Arrays.asList(
              new String[] {"A", "?", "D", "E", "A", "C", "E", "B", "D", "C"}));

    ArrayList<String> answers4 = new ArrayList<String>(Arrays.asList(
              new String[] {"A", "C", "D", "E", "A", "C", "E", "B", "D", "C"}));



    StudentAnswerSheet alex=new StudentAnswerSheet("Alex", answers1);
    StudentAnswerSheet betty=new StudentAnswerSheet("Betty", answers2);
    System.out.println("The key is "+key);
    System.out.println("Alex chose "+alex.getAnswers());
    System.out.println("Alex's score is (should be 5.25):"+alex.getScore(key));
    ArrayList<StudentAnswerSheet> sheets = new ArrayList<StudentAnswerSheet>();
    sheets.add(alex);
    sheets.add(betty);
    sheets.add(new StudentAnswerSheet("Clive", answers3));
    sheets.add(new StudentAnswerSheet("Donna", answers4));

    System.out.println();

    int counter = 0;
    double[] correctScores = {5.25,5.5,6.5,7.5};

    for (StudentAnswerSheet s : sheets)
    {
      System.out.println(s.getName() + " (Should be " + correctScores[counter++] + "): " + s.getScore(key));
    }
    TestResults results = new TestResults(sheets);
    System.out.println("Best is (should be Donna with a score of 7.5): " + results.highestScoringStudent(key));
  }
}