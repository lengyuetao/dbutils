import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zhangantao on 2016/11/25.
 */
public class Response extends HttpServlet{
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public Response(){

    }
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse response){
        try {
            response.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
