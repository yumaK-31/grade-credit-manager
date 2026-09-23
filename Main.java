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

        while (choice != 7) {

            System.out.println("========================");
            
            System.out.println("1. 科目を追加");
            System.out.println("2. 科目一覧を見る");
            System.out.println("3. 取得単位数を見る");
            System.out.println("4. GPAを見る");
            System.out.println("5. 科目を消去");
            System.out.println("6. 科目の編集");
            System.out.println("7. 終了");

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

                    for (int i = 0; i < subjects.size(); i++ ) {
                        Subject subject = subjects.get(i);
                        System.out.print(i+1 + ". ");
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

                    if (subjects.size() == 0) {
                        System.out.println("まだ科目が登録されていません");
                    } else {
                    System.out.println("GPAを表示します");
                    double totalGradePoint = 0;
                    
                    
                    
                    for (Subject subject : subjects) {
                        totalGradePoint += subject.getGradePoint() * subject.getCredit();//GPAの数字換算*その科目の単位数
                        sumCredit += subject.getCredit();//合計取得単位数
                    }

                    double gpa = totalGradePoint / sumCredit;

                    System.out.println("GPA：" + gpa);
                    break;
                    }

                case 5:
                    System.out.print("消去する科目の番号を入力してください: ");
                    int deleteNumber = scanner.nextInt();

                    if (deleteNumber >= 1 && deleteNumber <= subjects.size()){
                        int deleteIndex = deleteNumber - 1; //消去したい科目の番号とArrayのIndex番号を合わせる

                        Subject deleteSubject = subjects.get(deleteIndex); //消去する科目を参照

                        subjects.remove(deleteIndex);
                        System.out.println("「" + deleteSubject.getName() + "」を消去しました");

                    } else {
                        System.out.println("有効な数字を入力してください");
                    }
                break;  
                
                case 6:
                    System.out.print("編集する科目の番号を入力してください：");
                    int editNumber = scanner.nextInt();

                    if (editNumber >= 1 && editNumber <= subjects.size()){
                        int editIndex = editNumber - 1; //科目番号とインデックス番号を合わせる

                        Subject editSubject = subjects.get(editIndex);

                        System.out.print("新しい科目名：");//科目名の変更
                        String newName = scanner.next();
                        editSubject.setName(newName);

                        System.out.print("新しい単位数：");//単位数の変更
                        int newCredit = scanner.nextInt();
                        editSubject.setCredit(newCredit);

                        System.out.print("新しい成績：");//成績の変更
                        String newGrade = scanner.next();
                        editSubject.setGrade(newGrade);
                    }
                break;

                case 7:
                    System.out.println("アプリを終了します");
                break;

                default:
                    System.out.println("1〜7の番号を入力してください");
            }
        }
        scanner.close();
    }
    
}