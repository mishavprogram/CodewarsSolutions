package march_april;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AlarmTest {

    @Test
    public void setAlarmTest() {
        assertTrue(Alarm.setAlarm(true, false));
        assertFalse(Alarm.setAlarm(true, true));
        assertFalse(Alarm.setAlarm(false, false));
        assertFalse(Alarm.setAlarm(false, true));
    }

}