package wpd2.lab1.servlet;

/**
 * Created by Administrator on 28/03/2017.
 */
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
public class JS extends BaseServlet{
    private static final String JS_TEMPLATE = "JS.js";
    public JS(){}

    private Object getObject() {
        String path = "JS.js";
        return path;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        showViewJs(response, JS_TEMPLATE, getObject());

    }
}
