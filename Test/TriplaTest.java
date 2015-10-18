import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TriplaTest {
     private int array [];
    private Tripla tripla;



    @Before
    public void setUp() throws Exception {
        this.tripla = new Tripla();
    }


    @Test
    public void showTrueIfArrayIsTripla(){
        int[] array = new int[] {1,3,2,2,2};
        assertThat(tripla.isTripla(array), is(true));
    }

    @Test
    public void showFalseIfArrayIsNotTripla(){
        int[] array = new int[] {1,3,2,1,2};
        assertThat(tripla.isTripla(array), is(false));
    }








}
