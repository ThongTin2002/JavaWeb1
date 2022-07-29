package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class store_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./themify-icons/themify-icons.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"store-style.css\">\n");
      out.write("\n");
      out.write("    <!--Bootstrap-->\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    <title>Store</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"sub_heading\">\n");
      out.write("                <div>\n");
      out.write("                    <h3>\n");
      out.write("                        <a href=\"#\">Trang chủ</a>\n");
      out.write("                        <span>/</span>\n");
      out.write("                        <a href=\"#\">Cửa hàng</a>\n");
      out.write("                    </h3>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sort\">\n");
      out.write("                    <span>Hiển thị một kết quả duy nhất</span>\n");
      out.write("                    <form action=\"\">\n");
      out.write("                        <select name=\"sort-type\" id=\"\">\n");
      out.write("                            <option value=\"increase\">Giá tăng</option>\n");
      out.write("                            <option value=\"decrease\">Giá giảm</option>\n");
      out.write("                            <option value=\"populate\">Phổ biến</option>\n");
      out.write("                        </select>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container-xl container-fluid\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-9\">\n");
      out.write("                <div id=\"store\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xl-3 col-lg-3 col-md-4 col-sm-5\">\n");
      out.write("                            <div class=\"products\">\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div class=\"card\">\n");
      out.write("                                        <div class=\"product\">\n");
      out.write("                                            <div class=\"image_box\">\n");
      out.write("                                                <img class=\"card-img-top w-100\" src=\"https://toplist.vn/images/800px/thuc-an-cho-cho-pedigree-255768.jpg\" alt=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"card-body\">\n");
      out.write("                                                <div class=\"product_decs\">\n");
      out.write("                                                    <h5 class=\"card-title text-center name_product\">Card title</h5>\n");
      out.write("                                                    <p class=\"card-text text-center price\">75000đ</p>\n");
      out.write("                                                    <a href=\"#\" class=\"buy_button\">\n");
      out.write("                                                        <button>Mua hàng</button>\n");
      out.write("                                                    </a>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xl-3 col-lg-3 col-md-4 col-sm-5\">\n");
      out.write("                            <div class=\"products\">\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div class=\"card\">\n");
      out.write("                                        <div class=\"product\">\n");
      out.write("                                            <div class=\"image_box\">\n");
      out.write("                                                <img class=\"card-img-top w-100\" src=\"https://toplist.vn/images/800px/thuc-an-cho-cho-pedigree-255768.jpg\" alt=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"card-body\">\n");
      out.write("                                                <div class=\"product_decs\">\n");
      out.write("                                                    <h5 class=\"card-title text-center name_product\">Card title</h5>\n");
      out.write("                                                    <p class=\"card-text text-center price\">75000đ</p>\n");
      out.write("                                                    <a href=\"#\" class=\"buy_button\">\n");
      out.write("                                                        <button>Mua hàng</button>\n");
      out.write("                                                    </a>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xl-3 col-lg-3 col-md-4 col-sm-5\">\n");
      out.write("                            <div class=\"products\">\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div class=\"card\">\n");
      out.write("                                        <div class=\"product\">\n");
      out.write("                                            <div class=\"image_box\">\n");
      out.write("                                                <img class=\"card-img-top w-100\" src=\"https://toplist.vn/images/800px/thuc-an-cho-cho-pedigree-255768.jpg\" alt=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"card-body\">\n");
      out.write("                                                <div class=\"product_decs\">\n");
      out.write("                                                    <h5 class=\"card-title text-center name_product\">Card title</h5>\n");
      out.write("                                                    <p class=\"card-text text-center price\">75000đ</p>\n");
      out.write("                                                    <a href=\"#\" class=\"buy_button\">\n");
      out.write("                                                        <button>Mua hàng</button>\n");
      out.write("                                                    </a>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3\">\n");
      out.write("                <div id=\"sidebar\">\n");
      out.write("                    <div class=\"categories\">\n");
      out.write("                        <span class=\"sidebar_title\">Danh mục sản phẩm</span>\n");
      out.write("                        <ul class=\"list-group\">\n");
      out.write("                            <li class=\"list-group-item\">\n");
      out.write("                                <a href=\"#\">Thức ăn</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"list-group-item\">\n");
      out.write("                                <a href=\"#\">Quần áo</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"list-group-item\">\n");
      out.write("                                <a href=\"#\">Phụ kiện</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"new_product\">\n");
      out.write("                        <span class=\"sidebar_title\">Sản phẩm mới</span>\n");
      out.write("                        <ul class=\"list-group\">\n");
      out.write("                            <li class=\"list-group-item\">\n");
      out.write("                                <img src=\"https://toplist.vn/images/800px/thuc-an-cho-cho-pedigree-255768.jpg\" alt=\"\" class=\"w-25\">\n");
      out.write("                                <a href=\"#\">Thức ăn cho chó</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"list-group-item\">\n");
      out.write("                                <img src=\"https://toplist.vn/images/800px/thuc-an-cho-cho-pedigree-255768.jpg\" alt=\"\" class=\"w-25\">\n");
      out.write("                                <a href=\"#\">Thức ăn cho chó</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"list-group-item\">\n");
      out.write("                                <img src=\"https://toplist.vn/images/800px/thuc-an-cho-cho-pedigree-255768.jpg\" alt=\"\" class=\"w-25\">\n");
      out.write("                                <a href=\"#\">Thức ăn cho chó</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"best_product\">\n");
      out.write("                        <span class=\"sidebar_title\">Sản phẩm bán chạy</span>\n");
      out.write("                        <ul class=\"list-group\">\n");
      out.write("                            <li class=\"list-group-item\">\n");
      out.write("                                <img src=\"https://toplist.vn/images/800px/thuc-an-cho-cho-pedigree-255768.jpg\" alt=\"\" class=\"w-25\">\n");
      out.write("                                <a href=\"#\">Thức ăn cho chó</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"list-group-item\">\n");
      out.write("                                <img src=\"https://toplist.vn/images/800px/thuc-an-cho-cho-pedigree-255768.jpg\" alt=\"\" class=\"w-25\">\n");
      out.write("                                <a href=\"#\">Thức ăn cho chó</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"list-group-item\">\n");
      out.write("                                <img src=\"https://toplist.vn/images/800px/thuc-an-cho-cho-pedigree-255768.jpg\" alt=\"\" class=\"w-25\">\n");
      out.write("                                <a href=\"#\">Thức ăn cho chó</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"data-mdb-readonly\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
