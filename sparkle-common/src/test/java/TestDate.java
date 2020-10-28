import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName : TestDate<br>
 * Description : TODO<br>
 * Company : rrtx
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2020/9/4 14:14
 **/
@SpringBootTest
@Slf4j
public class TestDate {

    @Test
    public void aa() throws ParseException {
/*        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        String t = sdf.format(calendar.getTime());
        log.info("{}", t);
        Date time = DateFormat.getDateInstance().parse(t);
        log.info("{}", time.getTime());
        log.info("{}", time.getTime() > new Date().getTime());*/
    }

}
