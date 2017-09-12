package com.nemeth;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by java on 2017.09.12..
 */
public class OperationTest {
    @Test
    public void sumNumbers() throws Exception {
        assertThat(new Operation().sumNumbers(2,3,5), is(10));
    }

}