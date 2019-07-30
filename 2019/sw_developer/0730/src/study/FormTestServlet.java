package study;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FormTestServlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{

        request.setCharacterEncoding("utf-8");

        System.out.println("FormTestServet");

        /*
            request : 요청과 관련되어진 함수 모음 ( clinet -> server)
            response : 응답과 관련되어진 함수가 모여있다.(server->client)

            sendRedirect - 브라우저에게 해당 경로로 요청할 것을 지시한다.
         */

        String gul = request.getParameter("gul");
        String abcd = request.getParameter("abcd");
        String xxyz = request.getParameter("xxyz");
        System.out.println("gul : " + gul );
        System.out.println("abcd : " + abcd );
        System.out.println("xxyz : " + xxyz );

        String method = request.getParameter("method");
        System.out.println("method : " + method);

        String pwd = request.getParameter("pwd");
        System.out.println("pwd : " + pwd);

        String content = request.getParameter("content");
        System.out.println("content : " + content);

        String fruit = request.getParameter("fruit");
        System.out.println("fruit : " + fruit);

        response.sendRedirect("/test_01.html"); //ㄱ경로 들어가야 함
    }

}
