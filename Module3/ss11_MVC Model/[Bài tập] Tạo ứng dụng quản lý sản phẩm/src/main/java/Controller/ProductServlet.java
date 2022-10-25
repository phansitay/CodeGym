package Controller;

import Model.Product;
import Service.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/ProductServlet")
public class ProductServlet extends HttpServlet {
    private ProductService productService=new ProductService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action =request.getParameter("action");
        if(action==null){
            action=" ";
        }
        switch (action){
            case "add":
                showCreateForm(request,response);
                break;
            case "edit":
                showEditForm(request,response);
                break;
            case "delete":break;
            case "view":break;
            case "search":break;
            default:
                listProduct(request,response);
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findByid(id);
        if (product ==null){
            request.getRequestDispatcher("View/error.jsp");
        }else {
            request.setAttribute("product",product);
            try {
                request.getRequestDispatcher("View/EditProduct.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("View/AddProduct.jsp").forward(request,response);
    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response) {
        List<Product> products =this.productService.findAll();
        request.setAttribute("products",products);
        try {
            request.getRequestDispatcher("View/ListProduct.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action =request.getParameter("action");
        if(action==null){
            action=" ";
        }
        switch (action){
            case "add":
                addProduct(request,response);
                break;
            case "edit":
                editProduct(request,response);
                break;
            case "delete":break;
            case "search":break;
            default:break;
        }
    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int price= Integer.parseInt(request.getParameter("price"));
        String description=request.getParameter("description");
        Product product=this.productService.findByid(id);
        if (product==null){
            try {
                request.getRequestDispatcher("View/error.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            product.setNameProduct(name);
            product.setPriceProduct(price);
            product.setDescriptProduct(description);
            this.productService.update(id,product);
            request.setAttribute("product",product);
            request.setAttribute("mess","product da duoc up date");
            try {
                request.getRequestDispatcher("View/EditProduct.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void addProduct(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        int price= Integer.parseInt(request.getParameter("price"));
        String description=request.getParameter("description");
        int id=(int)(Math.random()*1000);

        Product product= new Product(id,name,price,description);
        productService.save(product);
        String mess ="Them thanh cong.";
        request.setAttribute("mess",mess);
        try {
            request.getRequestDispatcher("View/AddProduct.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
