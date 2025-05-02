package solodev;

public class MyDate {
    private int day;
    private int month;
    private int year;

    MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public boolean isValid() {
        if (month == 2) {
            if (day < 1 || day > 28) {
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }
}