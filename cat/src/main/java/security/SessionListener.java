package security;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
//@WebListener
public class SessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("the newly created session's id is ");
        System.out.print(se.getSession().getId());


    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("the newly created session's id is ");
        System.out.print(se.getSession().getId());
    }
}
