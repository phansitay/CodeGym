import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/CustomerServlet")
public class CustomerServlet extends HttpServlet {
    private static List<Customer> customerList = new ArrayList<>();
    static {
        customerList.add(new Customer(1,"Phan Sỉ Tây","17-08-2001","Quảng Nam","https://upload.wikimedia.org/wikipedia/commons/thumb/a/aa/Ros%C3%A9_at_a_fan_signing_event_on_September_25%2C_2022_%28cropped%29.jpg/1200px-Ros%C3%A9_at_a_fan_signing_event_on_September_25%2C_2022_%28cropped%29.jpg"));
        customerList.add(new Customer(2,"Phạm Văn Nam","17-08-2001","Quảng Nam","https://upload.wikimedia.org/wikipedia/commons/thumb/a/aa/Ros%C3%A9_at_a_fan_signing_event_on_September_25%2C_2022_%28cropped%29.jpg/1200px-Ros%C3%A9_at_a_fan_signing_event_on_September_25%2C_2022_%28cropped%29.jpg"));
        customerList.add(new Customer(3,"Nguyễn Thị Tuyết Vi","17-08-2001","Quảng Nam","https://upload.wikimedia.org/wikipedia/commons/thumb/a/aa/Ros%C3%A9_at_a_fan_signing_event_on_September_25%2C_2022_%28cropped%29.jpg/1200px-Ros%C3%A9_at_a_fan_signing_event_on_September_25%2C_2022_%28cropped%29.jpg"));
        customerList.add(new Customer(4,"Phạm Anh Thư","17-08-2001","Quảng Nam","https://upload.wikimedia.org/wikipedia/commons/thumb/a/aa/Ros%C3%A9_at_a_fan_signing_event_on_September_25%2C_2022_%28cropped%29.jpg/1200px-Ros%C3%A9_at_a_fan_signing_event_on_September_25%2C_2022_%28cropped%29.jpg"));
        customerList.add(new Customer(5,"Lê Kiều Oanh","17-08-2001","Quảng Nam","https://upload.wikimedia.org/wikipedia/commons/thumb/a/aa/Ros%C3%A9_at_a_fan_signing_event_on_September_25%2C_2022_%28cropped%29.jpg/1200px-Ros%C3%A9_at_a_fan_signing_event_on_September_25%2C_2022_%28cropped%29.jpg"));
        customerList.add(new Customer(6,"Nguyễn Văn An","17-08-2001","Quảng Nam","https://upload.wikimedia.org/wikipedia/commons/thumb/a/aa/Ros%C3%A9_at_a_fan_signing_event_on_September_25%2C_2022_%28cropped%29.jpg/1200px-Ros%C3%A9_at_a_fan_signing_event_on_September_25%2C_2022_%28cropped%29.jpg"));

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerList",customerList);
        request.getRequestDispatcher("ListCustomer.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
