package designpattern;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MacOSTest {

    @Test
    public void should_running_ok_in_China(){
        ChinesePower chinesePower = new ChinesePowerImpl();
        chinesePower.plug();
        assertThat(new MacOS().run(chinesePower), is(true));
    }

    @Test
    public void should_running_ok_in_Japan(){
        JapanPower japanPower = new JapanPowerImpl();

//         assertThat(new MacOS().run(chinesePower), is(true));
    }

}
