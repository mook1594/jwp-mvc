package core.mvc.tobe.resolver;

public interface HandlerMethodArgumentResolver {

    boolean isSupport();

    Object resolve();
}
