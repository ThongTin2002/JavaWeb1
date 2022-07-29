<%-- 
    Document   : Store
    Created on : Jul 29, 2022, 2:18:16 PM
    Author     : ADMIN
--%>

<%@page import="entity.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./themify-icons/themify-icons.css">
    <link rel="stylesheet" href="store-style.css">

    <!--Bootstrap-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>

    <title>Store</title>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="sub_heading">
                <div>
                    <h3>
                        <a href="#">Trang chủ</a>
                        <span>/</span>
                        <a href="#">Cửa hàng</a>
                    </h3>
                </div>
                <div class="sort">
                    <span>Hiển thị một kết quả duy nhất</span>
                    <form action="">
                        <select name="sort-type" id="">
                            <option value="increase">Giá tăng</option>
                            <option value="decrease">Giá giảm</option>
                            <option value="populate">Phổ biến</option>
                        </select>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <div class="container-xl container-fluid">
        <div class="row">
            <div class="col-lg-9">
                <div id="store">
                    <div class="row">
                        <%
                            ArrayList<Product> productArray = (ArrayList<Product>)request.getAttribute("productArray");
                            for(Product product : productArray) {
                        %>
                        <div class="col-xl-3 col-lg-3 col-md-4 col-sm-5">
                            <div class="products">
                                <a href="#">
                                    <div class="card">
                                        <div class="product">
                                            <div class="image_box">
                                                <img class="card-img-top w-100" src="" alt="">
                                            </div>
                                            <div class="card-body">
                                                <div class="product_decs">
                                                    <h5 class="card-title text-center name_product"><%= product.getName() %></h5>
                                                    <p class="card-text text-center price"><%= product.getPrice() %></p>
                                                    <a href="#" class="buy_button">
                                                        <button>Mua hàng</button>
                                                    </a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <%
                            }
                        %>
                    </div>
                </div>
            </div>
            <div class="col-lg-3">
                <div id="sidebar">
                    <div class="categories">
                        <span class="sidebar_title">Danh mục sản phẩm</span>
                        <ul class="list-group">
                            <li class="list-group-item">
                                <a href="#">Thức ăn</a>
                            </li>
                            <li class="list-group-item">
                                <a href="#">Quần áo</a>
                            </li>
                            <li class="list-group-item">
                                <a href="#">Phụ kiện</a>
                            </li>
                        </ul>
                    </div>
                    <div class="new_product">
                        <span class="sidebar_title">Sản phẩm mới</span>
                        <ul class="list-group">
                            <%
                                ArrayList<Product> lastestProductArray = (ArrayList<Product>)request.getAttribute("lastestProductArray");
                                for(Product lastestProduct : lastestProductArray) {
                            %>
                                <li class="list-group-item">
                                    <img src="https://toplist.vn/images/800px/thuc-an-cho-cho-pedigree-255768.jpg" alt="" class="w-25">
                                    <a href="#"><%= lastestProduct.getName() %></a>
                                </li>
                            <%
                                }
                            %>
                        </ul>
                    </div>
                    <div class="best_product">
                        <span class="sidebar_title">Sản phẩm bán chạy</span>
                        <ul class="list-group">
                            <li class="list-group-item">
                                <img src="https://toplist.vn/images/800px/thuc-an-cho-cho-pedigree-255768.jpg" alt="" class="w-25">
                                <a href="#">Thức ăn cho chó</a>
                            </li>
                            <li class="list-group-item">
                                <img src="https://toplist.vn/images/800px/thuc-an-cho-cho-pedigree-255768.jpg" alt="" class="w-25">
                                <a href="#">Thức ăn cho chó</a>
                            </li>
                            <li class="list-group-item">
                                <img src="https://toplist.vn/images/800px/thuc-an-cho-cho-pedigree-255768.jpg" alt="" class="w-25">
                                <a href="#">Thức ăn cho chó</a>
                            </li>
                        </ul>
                    </div>
                    <div class="data-mdb-readonly">

                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
