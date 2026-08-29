import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Subject> subjects = new ArrayList<>();

        System.out.println("========================");
        System.out.println("   成績・単位管理アプリ");
        System.out.println("========================");

        int choice = 0;

        while (choice != 5) {

            System.out.println("========================");
            
            System.out.println("1. 科目を追加");
            System.out.println("2. 科目一覧を見る");
            System.out.println("3. 取得単位数を見る");
            System.out.println("4. GPAを見る");
            System.out.println("5. 終了");

            System.out.println("========================");
            System.out.print("番号を入力してください：");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("科目を追加します");

                    System.out.print("科目名：");
                    String name = scanner.next();

                    System.out.print("単位数：");
                    int credit = scanner.nextInt();

                    System.out.print("成績：");
                    String grade = scanner.next();

                    Subject subject1 = new Subject(name, credit, grade);
                    subjects.add(subject1); //Array Listに追加

                    subject1.showInfo();

                    break;

                case 2:
                    System.out.println("科目一覧を表示します");

                    for (Subject subject : subjects) {
                        subject.showInfo();
                    }
                    break;

                case 3:
                    System.out.println("取得単位数を表示します");
                    int totalCredit = 0;
                    int minCredit = 124;
                    
                    for (Subject subject: subjects) {
                       totalCredit += subject.getCredit();
                    }

                    int requiredCredit = minCredit - totalCredit;

                    System.out.println("合計取得単位数：" + totalCredit);
                    System.out.println("必要残り単位数：" + requiredCredit);
                    break;

                case 4:
                    int sumCredit = 0;

                    if (sumCredit == 0) {
                        System.out.println("まだ科目が登録されていません");
                    } else {
                    System.out.println("GPAを表示します");
                    double totalGradePoint = 0;
                    
                    
                    
                    for (Subject subject : subjects) {
                        totalGradePoint += subject.getGradePoint() * subject.getCredit();
                        sumCredit += subject.getCredit();
                    }

                    double gpa = totalGradePoint / sumCredit;

                    System.out.println("GPA：" + gpa);
                    break;
                    }

                case 5:
                    System.out.println("アプリを終了します");
                    break;

                default:
                    System.out.println("1〜5の番号を入力してください");
            }
        }
        scanner.close();
    }
    
}