package com.googlecode.yatspec.junit5;

import com.googlecode.yatspec.junit.SpecListener;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static java.lang.Math.sqrt;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@ExtendWith(SpecListener.class)
public abstract class AbstractTestCase {
    @Test
    public void testInParentClass() {
        assertThat(sqrt(9), is(3.0));
    }

}
