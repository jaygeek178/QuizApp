package org.com.projectOne;

public class Questions {

    private int qNo;
    private String title;

    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String answer;


    public Questions() {
    }

    public int getqNo() {
        return qNo;
    }

    public void setqNo(int qNo) {
        this.qNo = qNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public String getAnswer(String i) {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Questions(int qNo, String title, String option1, String option2, String option3, String option4, String answer) {
        this.qNo = qNo;
        this.title = title;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "qNo=" + qNo +
                ", title='" + title + '\'' +
                ", option1='" + option1 + '\'' +
                ", option2='" + option2 + '\'' +
                ", option3='" + option3 + '\'' +
                ", option4='" + option4 + '\'' +
                ", answer=" + answer +
                '}';
    }
}
