<%-- 
    Document   : news
    Created on : Jul 25, 2022, 8:20:07 AM
    Author     : USER
--%>

<%@page import="entity.News"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./themify-icons/themify-icons.css">
    <link rel="stylesheet" href="news-style.css">

    <!--Bootstrap-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>

    <title>News</title>
</head>
<body>
    <div class="row">
        <div class="text-center">
            <h1>
                <span class="title">Tin tức</span>
            </h1>
        </div>
    </div>
    <div class="container-xl container-fluid">
        <div class="row">
            <div class="col-lg-9">
                <div id="news_contents">
                    <div class="row">
                        <%
                            ArrayList<News> newsArray = (ArrayList<News>)request.getAttribute("newsArray");
                            for(News news : newsArray) {
                        %>
                        <div class="col-xl-3 col-lg-4">
                            <div class="contents_items">
                                <a href="./ShowNewContent?idNews=<%= news.getIdNews() %>">
                                    <div class="card">
                                        <div class="news_items">
                                            <div class="image_box">
                                                <img class="card-img-top" src="<%= news.getImg() %>" alt="avatar">
                                            </div>
                                            <div class="card-body">
                                                <div class="news_decs">
                                                    <h5 class="card-title"><%= news.getTitle() %></h5>
                                                    <p class="card-text"><%= news.getDescription()%></p>
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
                                <a href="#">Áo</a>
                            </li>
                            <li class="list-group-item">
                                <a href="#">Quần</a>
                            </li>
                            <li class="list-group-item">
                                <a href="#">Vòng cổ</a>
                            </li>
                        </ul>
                    </div>
                    <div class="new_news">
                        <span class="sidebar_title">Bài viết mới</span>
                        <ul class="list-group">
                            <li class="list-group-item">
                                <a href="#">Some quick example text to build on the card title and make up the bulk of the card's content.</a>
                            </li>
                            <li class="list-group-item">
                                <a href="#">Some quick example text to build on the card title and make up the bulk of the card's content.</a>
                            </li>
                            <li class="list-group-item">
                                <a href="#">Some quick example text to build on the card title and make up the bulk of the card's content.</a>
                            </li>
                        </ul>
                    </div>
                    <div class="new_respond">
                        <span class="sidebar_title">Phản hồi gần đây</span>
                        <ul class="list-group">
                            <li class="list-group-item">
                                <a href="#">Áo</a>
                            </li>
                            <li class="list-group-item">
                                <a href="#">Quần</a>
                            </li>
                            <li class="list-group-item">
                                <a href="#">Vòng cổ</a>
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