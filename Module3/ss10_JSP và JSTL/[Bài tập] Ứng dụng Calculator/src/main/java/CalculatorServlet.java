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
        int add = 0;
        int sub=0;
        int mul=0;
        float div=0;
        if (operator.equals("+")){
            add =first*second;
        }else {
            if(operator.equals("-")){
                sub =first-second;
            }else {
                if (operator.equals("*")){
                    mul =first*second;
                }else {
                    div = first/second;
                }
            }
        }
        request.setAttribute("cong",add);
        request.setAttribute("tru",sub);
        request.setAttribute("nhan",mul);
        request.setAttribute("chia",div);

        request.getRequestDispatcher()

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
