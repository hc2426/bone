package site.zido.test;

import org.junit.Assert;
import org.junit.Test;
import site.zido.core.beans.AnnotationParser;

import java.util.Set;

public class ClassFindTest {
    @Test
    public void findTest(){
        AnnotationParser parser = new AnnotationParser("site.zido.core.beans");
        Set<Class<?>> classes = parser.findClasses();
        Assert.assertTrue("类扫描失败",!classes.isEmpty());
    }
}
