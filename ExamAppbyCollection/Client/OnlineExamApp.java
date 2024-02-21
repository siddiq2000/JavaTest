package Client;
import Model.*;
import Service.*;
import java.util.*;

public class OnlineExamApp {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        QuestionService qService = new QuestionService();
        ExamService examService = new ExamService();
        
        do{
            System.out.println("1.Add Question");
            System.out.println("2.View All Question");
            System.out.println("3.Schedule Exam");
            System.out.println("4.View Question Exam wise");
            System.out.println("5.Attempt exam as Student");
            System.out.println("6.Delete Question");
            System.out.println("11.Exit");
            System.out.println("Enter Choice");
            int choice = sc.nextInt(); sc.nextLine();
            switch (choice) { 
                case 1:
                    System.out.println("Enter Question and options with answer");
                    String qname = sc.nextLine(); System.out.println("Enter 4 options");
                    String op1 = sc.nextLine();
                    String op2 = sc.nextLine();
                    String op3 = sc.nextLine();
                    String op4 = sc.nextLine(); System.out.println("Enter Answer of question");
                    String answer = sc.nextLine();
                    Question q = new Question(qname, op1, op2, op3, op4, answer);
                    boolean b  = qService.isAddQuestion(q);
                    if(b) {
                        System.out.println("Question Added Successfully");
                    }
                    else {System.out.println("Error occured question not added");}
                    break;
                case 2:
                    ArrayList al = qService.showAllQuestion();
                    if(al!=null) {
                        for (Object obj:al) {
                            q=(Question)obj;
                            System.out.println(q.getId()+"\t"+q.getName()+"\t"+q.getOp1()+"\t"+q.getOp2()+"\t"+q.getOp3()+"\t"+q.getOp4()+"\t"+q.getAnswer());
                        }
                    }
                    else {System.out.println("No data present in collection");
                    }
                    break;
                case 3:
                    System.out.println("Enter Exam ID, Name, Date, Start Time, EndTime");
                    int examId = sc.nextInt(); sc.nextLine();
                    String name = sc.nextLine();
                    String date = sc.nextLine();
                    String starttime  = sc.nextLine();
                    String endtime = sc.nextLine();
                    Exam exam = new Exam(examId, name, date, starttime, endtime);
                    
                    b = examService.scheduleExam(exam);
                    if (b) {
                        System.out.println("Exam Scheduled Successfully");
                    }
                    else System.out.println("No question bank detected");
                    break;
                case 4:
                    Exam model = examService.getExamschedule();
                    if(model!=null) {
                        System.out.println(model.getId()+"\t"+model.getName()+"\t"+model.getDate()+"\t"+model.getStarttime()+"\t"+model.getEndtime());
                        al = model.getQuestionBank();
                        System.out.println("_____________________________________________________________________________________");
                        for (Object obj: al) {
                            q = (Question)obj;
                            System.out.println(q.getId()+"\t"+q.getName()+"\t"+q.getOp1()+"\t"+q.getOp2()+"\t"+q.getOp3()+"\t"+q.getOp4()+"\t"+q.getAnswer());
                        }
                    }
                    else System.out.println("There is no Scheduled Exam");
                    break;
                case 5:
                    Student student = new Student();
                    int sid = sc.nextInt(); sc.nextLine();
                    name = sc.nextLine();
                    model = examService.getExamschedule();
                    student.setId(sid);
                    student.setName(name);
                    if (model!=null) {
                        student.setModel(model);
                        al = model.getQuestionBank();
                        if (al.size()>0) {
                            for (Object obj : al) {
                                q = (Question)obj;
                                System.out.println("Question is: "+q.getName());
                                System.out.println("OPtion 1:"+q.getOp1());
                                System.out.println("OPtion 2:"+q.getOp2());
                                System.out.println("OPtion 3:"+q.getOp3());
                                System.out.println("OPtion 4:"+q.getOp4());
                                System.out.println("Enter your Answer");
                                answer = sc.nextLine(); 
                                if(answer.equals(q.getAnswer())){
                                    q.setStatus(true);
                                }
                            } int count=0; float per;
                            System.out.println("Print All Questions");
                            for(Object obj : al){
                                q = (Question)obj;
                                System.out.println(q.getId()+". Question: "+q.getName()+"\t"+q.isStatus());
                                if(q.isStatus()==true) 
                                    ++count;
                               
                            }
                            System.out.println("Total correct Questions: "+count+" of "+al.size());
                            per = ((float)count/(float)al.size())*100;
                            System.out.println("Percentage: "+per);
                        } else System.out.println("Wait for question paper");
                    }
                    else System.out.println("NO Exam");
                    break;
                case 6:
                    System.out.println("Enter question id to delete");
                    int qid = sc.nextInt();
                    al = qService.showAllQuestion();
                    if(al.size()>0) {
                        for(Object obj:al) {
                            q = (Question)obj;
                            if(q.getId()==qid) {
                                System.out.println(q.getName());
                                System.out.println("Do you want to delete this question");
                                String in = sc.nextLine();
                                if (in.equals("yes")) {
                                    int index = al.indexOf(obj);
                                    al.remove(index);
                                }
                                else return;
                            }
                        }
                    } else {System.out.println("Question bank not present");}
                    break;
                case 11:
                    System.exit(0);
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
        while(true);
    }
}