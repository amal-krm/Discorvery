<%-- 
    Document   : Navbar
    Created on : 3 juin 2020, 00:55:36
    Author     : Amal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <!-- header-start -->
    <header>
        <div class="header-area ">
            <div id="sticky-header" class="main-header-area">
                <div class="container-fluid">
                    <div class="header_bottom_border">
                        <div class="row align-items-center">
                            <div class="col-xl-2 col-lg-2">
                                <div class="logo">
                                    <a href="index.jsp">
                                        <img src="img/logo.png" alt="" height=35 width=200>
                                    </a>
                                </div>
                            </div>
                            <div class="col-xl-6 col-lg-6">
                                <div class="main-menu  d-none d-lg-block">
                                    <nav>
                                        <ul id="navigation">
                                            <li><a class="active" href="index.jsp">home</a></li>
                                            <li><a class="active" href="/User/Participations.jsp">Participations</a></li>
                                            <li><a href="#">Voyages <i class="ti-angle-down"></i></a>
                                                <ul class="submenu">
                                                    <li><a href="blog.jsp">Ma Liste</a></li>
                                                    <li><a href="single-blog.jsp">Tout Voyages</a></li>
                                                </ul>
                                            </li>
                                            
                                            <li><a href="contact.jsp">Nous Contactez</a></li>
                                          
                                        </ul>
                                    </nav>
                                </div>
                            </div>
                            <div class="col-xl-4 col-lg-4 d-none d-lg-block">
                                <div class="social_wrap d-flex align-items-center justify-content-end">
                                    
                                    <div class="main-menu d-none d-xl-block">
                                        <ul id="navigation">
                                            
                                            <li>
                                                <a href="contact.jsp"> <img src="img/user.png" alt="" height=35 width=50></a>
                                                 <ul class="submenu">
                                                    <li><a href="blog.jsp">Ma Liste</a></li>
                                                    <li><a href="single-blog.jsp">Tout Voyages</a></li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="seach_icon">
                                <a data-toggle="modal" data-target="#exampleModalCenter" href="#">
                                    <i class="fa fa-search"></i>
                                </a>
                            </div>
                            <div class="col-12">
                                <div class="mobile_menu d-block d-lg-none"></div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </header>
    <!-- header-end -->
</html>
