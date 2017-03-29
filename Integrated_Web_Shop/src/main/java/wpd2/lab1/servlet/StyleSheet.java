package wpd2.lab1.servlet;

/**
 * Created by Administrator on 28/03/2017.
 */

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StyleSheet extends BaseServlet{
    private static final String STYLE_TEMPLATE = "StyleSheet.css";
    public static final  String HTML_UTF_8 = "text/css; charset=UTF-8";
    public StyleSheet() { }

    private Object getObject() {
        String path = "StyleSheet.css";
        return path;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        showViewCss(response, STYLE_TEMPLATE, getObject());

    }
}
