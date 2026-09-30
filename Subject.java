public class Subject {
   private String name;
   private int credit;
   private String grade;
   private int year;
   private int quarter;

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

   public int getYear(){
      return this.year;
   }

   public void setYear(int year){
      this.year = year;
   }

   public int getQuarter(){
      return this.quarter;
   }

   public void setQuarter(int quarter){
      this.quarter = quarter;
   }


   public Subject(String name, int credit, String grade, int year, int quarter) {
      this.name = name;
      this.credit = credit;
      this.grade = grade;
      this.year = year;
      this.quarter = quarter;
   }

   public void showInfo() {
    System.out.println("科目名：" + this.name + "/ 単位数：" + this.credit + "/ 成績：" + this.grade
      + "/ 年度：" + this.year + "/ Q：" + this.quarter);
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
