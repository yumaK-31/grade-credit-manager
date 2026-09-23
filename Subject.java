public class Subject {
   private String name;
   private int credit;
   private String grade;

   public String getName(){
      return this.name;
   }

   public void setName (String name){
      this.name = name;
   }

   public int getCredit(){
      return this.credit;
   }

   public void setCredit (int credit){
      this.credit = credit;
   }

   public String getGrade(){
      return this.grade;
   }

   public void setGrade(String grade){
      this.grade = grade;
   }

   public Subject(String name, int credit, String grade) {
      this.name = name;
      this.credit = credit;
      this.grade = grade;
   }

   public void showInfo() {
    System.out.println("科目名：" + name + "/ 単位数：" + credit + "/ 成績：" + grade);
   }

   public double getGradePoint() {
      switch (grade) {
         case "A" :
            return 4.0;
         case "B" :
            return 3.0;
         case "C" :
            return 2.0;
         case "D" :
            return 1.0;
         case "F" :
            return 0.0;
         default:
            return 0.0;
      }
   }
}
