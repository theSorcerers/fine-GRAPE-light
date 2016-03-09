package arrow.framework.logging;

public class WildflyLoggerImpl implements ArrowLogger {
  private final org.jboss.logging.Logger delegate;

  // private constructor
  private WildflyLoggerImpl(final String name) {
    this.delegate = org.jboss.logging.Logger.getLogger(name);
  }


  @Override
  public String getName() {
    return this.delegate.getName();
  }


  @Override
  public boolean isEnabled(final Level level) {
    return this.delegate.isEnabled(WildflyLoggerImpl.translate(level));
  }


  @Override
  public boolean isTraceEnabled() {
    return this.delegate.isEnabled(org.jboss.logging.Logger.Level.TRACE);
  }


  @Override
  public void trace(final Object message) {
    this.delegate.trace(message);
  }


  @Override
  public void trace(final Object message, final Throwable t) {
    this.delegate.trace(message, t);
  }


  @Override
  public void tracev(final String format, final Object... params) {
    this.delegate.tracev(format, params);
  }


  @Override
  public void tracev(final Throwable t, final String format, final Object... params) {
    this.delegate.tracev(t, format, params);
  }


  @Override
  public void tracef(final String format, final Object... params) {
    this.delegate.tracef(format, params);
  }


  @Override
  public void tracef(final Throwable t, final String format, final Object... params) {
    this.delegate.tracef(t, format, params);
  }


  @Override
  public boolean isDebugEnabled() {
    return this.delegate.isEnabled(org.jboss.logging.Logger.Level.DEBUG);
  }


  @Override
  public void debug(final Object message) {
    this.delegate.debug(message);
  }


  @Override
  public void debug(final Object message, final Throwable t) {
    this.delegate.debug(message, t);
  }


  @Override
  public void debugv(final String format, final Object... params) {
    this.delegate.debugv(format, params);
  }


  @Override
  public void debugv(final Throwable t, final String format, final Object... params) {
    this.delegate.debugv(t, format, params);
  }


  @Override
  public void debugf(final String format, final Object... params) {
    this.delegate.debugf(format, params);
  }


  @Override
  public void debugf(final Throwable t, final String format, final Object... params) {
    this.delegate.debugf(t, format, params);
  }


  @Override
  public boolean isInfoEnabled() {
    return this.delegate.isEnabled(org.jboss.logging.Logger.Level.INFO);
  }


  @Override
  public void info(final Object message) {
    this.delegate.info(message);
  }


  @Override
  public void info(final Object message, final Throwable t) {
    this.delegate.info(message, t);
  }


  @Override
  public void infov(final String format, final Object... params) {
    this.delegate.infov(format, params);
  }


  @Override
  public void infov(final Throwable t, final String format, final Object... params) {
    this.delegate.infov(t, format, params);
  }


  @Override
  public void infof(final String format, final Object... params) {
    this.delegate.infof(format, params);
  }


  @Override
  public void infof(final Throwable t, final String format, final Object... params) {
    this.delegate.infof(t, format, params);
  }


  @Override
  public void warn(final Object message) {
    this.delegate.warn(message);
  }


  @Override
  public void warn(final Object message, final Throwable t) {
    this.delegate.warn(message, t);
  }


  @Override
  public void warnv(final String format, final Object... params) {
    this.delegate.warnv(format, params);
  }


  @Override
  public void warnv(final Throwable t, final String format, final Object... params) {
    this.delegate.warnv(t, format, params);
  }


  @Override
  public void warnf(final String format, final Object... params) {
    this.delegate.warnf(format, params);
  }


  @Override
  public void warnf(final Throwable t, final String format, final Object... params) {
    this.delegate.warnf(t, format, params);
  }


  @Override
  public void error(final Object message) {
    this.delegate.error(message);
  }


  @Override
  public void error(final Object message, final Throwable t) {
    this.delegate.error(message, t);
  }


  @Override
  public void errorv(final String format, final Object... params) {
    this.delegate.errorv(format, params);
  }


  @Override
  public void errorv(final Throwable t, final String format, final Object... params) {
    this.delegate.errorv(t, format, params);
  }


  @Override
  public void errorf(final String format, final Object... params) {
    this.delegate.errorf(format, params);
  }


  @Override
  public void errorf(final Throwable t, final String format, final Object... params) {
    this.delegate.errorf(t, format, params);
  }


  @Override
  public void fatal(final Object message) {
    this.delegate.fatal(message);
  }


  @Override
  public void fatal(final Object message, final Throwable t) {
    this.delegate.fatal(message, t);
  }


  @Override
  public void fatalv(final String format, final Object... params) {
    this.delegate.fatalv(format, params);
  }


  @Override
  public void fatalv(final Throwable t, final String format, final Object... params) {
    this.delegate.fatalv(t, format, params);
  }


  @Override
  public void fatalf(final String format, final Object... params) {
    this.delegate.fatalf(format, params);
  }


  @Override
  public void fatalf(final Throwable t, final String format, final Object... params) {
    this.delegate.fatalf(t, format, params);
  }


  @Override
  public void log(final Level level, final Object message) {
    this.delegate.log(WildflyLoggerImpl.translate(level), message);
  }


  @Override
  public void log(final Level level, final Object message, final Throwable t) {
    this.delegate.log(WildflyLoggerImpl.translate(level), message, t);
  }


  @Override
  public void logv(final Level level, final String format, final Object... params) {
    this.delegate.logv(WildflyLoggerImpl.translate(level), format, params);
  }


  @Override
  public void logv(final Level level, final Throwable t, final String format, final Object... params) {
    this.delegate.logv(WildflyLoggerImpl.translate(level), t, format, params);
  }


  @Override
  public void logf(final Level level, final String format, final Object... params) {
    this.delegate.logf(WildflyLoggerImpl.translate(level), format, params);
  }


  @Override
  public void logf(final Level level, final Throwable t, final String format, final Object... params) {
    this.delegate.logf(WildflyLoggerImpl.translate(level), t, format, params);
  }



  /**
   * Translate from SynLogger.Level to org.jboss.logging.Logger.Level
   */

  private static org.jboss.logging.Logger.Level translate(final Level level) {
    if (level != null) {
      switch (level) {
        case FATAL:
          return org.jboss.logging.Logger.Level.FATAL;
        case ERROR:
          return org.jboss.logging.Logger.Level.ERROR;
        case WARN:
          return org.jboss.logging.Logger.Level.WARN;
        case INFO:
          return org.jboss.logging.Logger.Level.INFO;
        case DEBUG:
          return org.jboss.logging.Logger.Level.DEBUG;
        case TRACE:
          return org.jboss.logging.Logger.Level.TRACE;
      }
    }
    return null;
  }



  /**
   * Get a Logger instance given the logger name.
   *
   * @param name the logger name
   *
   * @return the logger
   */
  public static WildflyLoggerImpl getLogger(final String name) {
    return new WildflyLoggerImpl(name);
  }

  /**
   * Get a Logger instance given the logger name with the given suffix.
   * <p/>
   * <p>
   * This will include a logger separator between logger name and suffix.
   *
   * @param name the logger name
   * @param suffix a suffix to append to the logger name
   *
   * @return the logger
   */
  public static WildflyLoggerImpl getLogger(final String name, final String suffix) {
    return WildflyLoggerImpl.getLogger(name == null || name.length() == 0 ? suffix : name + "." + suffix);
  }

  /**
   * Get a Logger instance given the name of a class. This simply calls create(clazz.getName()).
   *
   * @param clazz the Class whose name will be used as the logger name
   *
   * @return the logger
   */
  public static WildflyLoggerImpl getLogger(final Class<?> clazz) {
    return WildflyLoggerImpl.getLogger(clazz.getName());
  }

  /**
   * Get a Logger instance given the name of a class with the given suffix.
   * <p/>
   * <p>
   * This will include a logger separator between logger name and suffix
   *
   * @param clazz the Class whose name will be used as the logger name
   * @param suffix a suffix to append to the logger name
   *
   * @return the logger
   */
  public static WildflyLoggerImpl getLogger(final Class<?> clazz, final String suffix) {
    return WildflyLoggerImpl.getLogger(clazz.getName(), suffix);
  }


  @Override
  public void warnDrawLine() {
    this.delegate.warn("=================================================");

  }
}
