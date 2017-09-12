package com.nemeth;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by java on 2017.09.12..
 */
public class HelloIphoneTest {
    @Test
    public void iPhone() throws Exception {
        assertThat(new HelloIphone().iPhone(), is("New iPhone is introduced today."));
    }

}