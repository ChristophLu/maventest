
package maventest;

/**
 * @author cludwig
 *
 */
public class Foo {

    private final ValueProvider provider;

    public Foo(final ValueProvider provider) {
        this.provider = provider;
    }

    public int getValue() {
        return this.provider.getValue() + 1;
    }
}
