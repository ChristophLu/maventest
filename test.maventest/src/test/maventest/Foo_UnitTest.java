
package test.maventest;

import maventest.Foo;
import maventest.ValueProvider;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

import mockit.Mocked;
import mockit.NonStrictExpectations;
import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class)
@SuppressWarnings("unused")
public class Foo_UnitTest {

    @Mocked
    ValueProvider provider;

    @Test
    public void test_value() {
        assertEquals(43, getFoo().getValue());
    }

    private ValueProvider getProvider() {
        return this.provider;
    }

    private Foo getFoo() {
        new NonStrictExpectations() {

            {
                getProvider().getValue();
                result = 42;
            }
        };
        return new Foo(getProvider());
    }
}
