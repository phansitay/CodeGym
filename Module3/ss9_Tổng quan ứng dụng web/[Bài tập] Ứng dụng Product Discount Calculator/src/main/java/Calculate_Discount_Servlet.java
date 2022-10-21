import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Calculate_Discount_Servlet", value = "/DiscountAmount")
public class Calculate_Discount_Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String descript=request.getParameter("description");
        double price = Double.parseDouble(request.getParameter("price"));
        int discount = Integer.parseInt(request.getParameter("discount"));
        double discountAmount =price*discount*0.01;
        double discountPricce = price-discountAmount;
        request.setAttribute("description",descript);
        request.setAttribute("price",price);
        request.setAttribute("discount",discount);
        request.setAttribute("discountA",discountAmount);
        request.setAttribute("discountP",discountPricce);
        request.getRequestDispatcher("kq.jsp").forward(request,response);
    }
}
