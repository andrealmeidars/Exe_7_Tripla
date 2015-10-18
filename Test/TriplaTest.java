import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TriplaTest {

    Tripla tripla;

    @Before
    public void setUp() throws Exception {
        this.tripla = new Tripla();

    }

    @Test
    public void showIf2NumbersIsEqual(){

        assertThat(tripla.isTripla(), is(true));

    }



}
