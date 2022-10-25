import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", value = "/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int first = Integer.parseInt(request.getParameter("firstOperand"));
        int second = Integer.parseInt(request.getParameter("secondOperand"));
        String operator = request.getParameter("operator");
        int s=0;
        switch (operator) {
            case "+":
                s = first + second;
                break;
            case "-":
                s = first - second;
                break;
            case "*":
                s = first * second;
                break;
            case "/":
                s = first / second;
                break;
            default:
                break;
        }
            request.setAttribute("s",s);
            request.setAttribute("first",first);
            request.setAttribute("second",second);
            request.setAttribute("operator",operator);
            request.getRequestDispatcher("kq.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
