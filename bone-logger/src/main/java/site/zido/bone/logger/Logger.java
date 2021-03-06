package site.zido.bone.logger;

import org.slf4j.LoggerFactory;
import site.zido.bone.logger.impl.Slf4jLogger;

public abstract class Logger{
    protected Logger(String name){

    }
    protected Logger(Class<?> classzz){

    }

    public abstract void info(String msg);
    public abstract void error(String msg);
    public abstract void debug(String msg);
    public abstract void warn(String msg);
    public abstract void trace(String msg);
}
