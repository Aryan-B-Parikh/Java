package Basics.Lecture.Tasks;

interface Exam
{
    boolean Pass(int mark);
}
interface Classify
{
    String Division(int average);
}
class Result implements Exam,Classify
{
    int mark;
    int average;
    Result(int mark, int average) {
        this.mark = mark;
        this.average = average;
    }
    @Override
    public boolean Pass(int mark) {
        return mark >= 50;
    }
    @Override
    public String Division(int average) {
        if (average >= 60) {
            return "First";
        }
        else if (average >= 50) {
            return "Second";
        }
        else {
            return "No Division";
        }
    }
}
public class Tak2307 {
    public static void main(String[] args) {
        Result result = new Result(95, 90);
        System.out.println( result.Pass(result.mark));
        System.out.println(result.Division(result.average)); 
    }
}