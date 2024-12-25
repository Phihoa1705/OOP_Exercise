package OOP_Ex.Exercise3.Bai3_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
/*
    1. Tạo một chuỗi thời gian từ các thuộc tính hour, minute, second của đối tượng.
    2. Chuyển chuỗi thời gian đó thành một đối tượng Date.
    3. Định dạng lại đối tượng Date thành chuỗi với định dạng "HH:mm:ss".
    4. Trả về chuỗi định dạng thời gian này.
 */
    @Override
    public String toString() {
        String timeString = String.format("%d:%d:%d", hour, minute, second);
        Date time= null;
        try {
            time = new SimpleDateFormat("HH:mm:ss").parse(timeString);
        } catch (ParseException ex) {
            /*
                Logger là một lớp trong Java được sử dụng để ghi lại các thông tin log,
                thường dùng để theo dõi hoạt động của ứng dụng hoặc ghi lại lỗi khi có vấn
                đề xảy ra.

                Logger.getLogger() tạo ra một đối tượng logger với tên này, để bạn có thể
                ghi log vào một nguồn (ví dụ như console, file, hoặc hệ thống log khác).

                log(Level.SEVERE, null, ex) ghi một thông báo log với mức độ nghiêm trọng là SEVERE

                Level.SEVERE là mức độ log cao nhất (thường dùng để báo lỗi nghiêm trọng hoặc
                những vấn đề có thể gây ra sự cố lớn trong chương trình).

                null là đối số thứ hai, nhưng ở đây không sử dụng (thường là thông điệp log hoặc
                thông tin bổ sung). Khi không cần cung cấp thông điệp bổ sung, bạn có thể truyền null.

                ex là đối tượng Exception (lỗi) sẽ được ghi lại. Lỗi này sẽ cung cấp thông tin chi tiết
                về ngoại lệ xảy ra, như loại lỗi và thông điệp lỗi.
             */
            Logger.getLogger(MyTime.class.getName()).log(Level.SEVERE, null, ex);
        }
        timeString = new SimpleDateFormat("HH:mm:ss").format(time);
        return timeString;
    }

    public MyTime nextHour(){
        this.hour++;
        return this;
    }

    public MyTime nextMinute(){
        this.minute++;
        return this;
    }

    public MyTime nextSecond(){
        this.second++;
        return this;
    }


    public MyTime previousHour(){
        this.hour--;
        return this;
    }

    public MyTime previousMinute(){
        this.minute--;
        return this;
    }

    public MyTime previousSecond(){
        this.second--;
        return this;
    }
}
