package org.sonar.plugins.yaml.checks;

import junit.framework.TestCase;

public class NewLinesCheckTest extends TestCase {
    public void testCheck() {
        assertNotNull(new NewLinesCheck());
    }
}
