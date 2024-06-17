package michael;

import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("JUnit Platform Suite Demo")
@SelectPackages({"michael"})
//@IncludeClassNamePatterns({.VoitureTest.class, .Statistique_implTest.class})
class suiteTest {
}