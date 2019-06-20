package fangfa.net.common.component;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.stereotype.Component;

import javax.servlet.Servlet;

/**
 * @author: green
 * @version: 1.0
 * @Date: 2019/6/19/019
 * @description:
 */
@Component
public class HystrixStreamServlet extends ServletRegistrationBean<HystrixMetricsStreamServlet> {

    private static final int LOAD_ON_START_UP = 1;
    private static final String URL_MAPPING = "/actuator/hystrix.stream";

    /**
     * Create a new {@link ServletRegistrationBean} instance with the specified
     * {@link Servlet} and URL mappings.
     */
    public HystrixStreamServlet() {
        super(new HystrixMetricsStreamServlet(), URL_MAPPING);
        setLoadOnStartup(LOAD_ON_START_UP);
        setName(this.getClass().getName());
    }
}
