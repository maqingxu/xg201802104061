package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@WebFilter(filterName = "Filter 1",urlPatterns = {"/*"})
public class Filter1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig)  { }

    @Override
    public void destroy() {}

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter 1 - date begins");
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        String path = request.getRequestURI();
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleFormatter = new SimpleDateFormat("yyyy年MM月dd日HH: mm");
        System.out.println(path +" @" + simpleFormatter.format(calendar.getTime()));
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("Filter 1 - date ends");
    }
}
