<%@page import="OBJ.Aimer"%>
<%@page import="DAO.daoAimer"%>
<%@page import="OBJ.Admin"%>
<%@page import="DAO.daoAdmin"%>
<%@page import="OBJ.Type_Voyage"%>
<%@page import="OBJ.Voyage"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Database.Database"%>
<%@page import="DAO.daoVoyage"%>

<!doctype html>
<html class="no-js" lang="zxx">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>VOYAGES</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- <link rel="manifest" href="site.webmanifest"> -->
    <link rel="shortcut icon" type="image/x-icon" href="img/favicon.png">
    <!-- Place favicon.ico in the root directory -->

    <!-- CSS here -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/magnific-popup.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link rel="stylesheet" href="css/themify-icons.css">
    <link rel="stylesheet" href="css/nice-select.css">
    <link rel="stylesheet" href="css/flaticon.css">
    <link rel="stylesheet" href="css/gijgo.css">
    <link rel="stylesheet" href="css/animate.css">
    <link rel="stylesheet" href="css/slicknav.css">
    <link rel="stylesheet" href="css/style.css">
    <!-- <link rel="stylesheet" href="css/responsive.css"> -->
</head>

<body>
    <!--[if lte IE 9]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="https://browsehappy.com/">upgrade your browser</a> to improve your experience and security.</p>
        <![endif]-->

    <!-- header-start -->
    <%@include file="Navbar.jsp" %>
    <!-- header-end -->

    <!-- bradcam_area  -->
    <div class="bradcam_area bradcam_bg_4">
        <div class="container">
            <div class="row">
                <div class="col-xl-12">
                    <div class="bradcam_text text-center">
                        <h3>Nos Voyages</h3>
                        <p>La vie ce n'est pas seulement respirer c'est aussi avoir le souffle coupé.</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--/ bradcam_area  -->


    <!--================Blog Area =================-->
     
    <% 
       Database db = new Database();
       daoVoyage daov = new daoVoyage(db);
       daoAimer daoA = new daoAimer(db);
       String id ="";
       ResultSet Rs = daov.all();
       
         %>
                          
    <section class="blog_area section-padding">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 mb-5 mb-lg-0">
                    <div class="blog_left_sidebar">
                       <% 
                           
                           while(Rs.next()){
                               id = Rs.getObject(1).toString();
                               Integer i = daoA.getCount(id);
                           %>
                       
                        <article class="blog_item">
                            <div class="blog_item_img">
                                <img class="card-img rounded-0" src=<%=Rs.getObject(9) %> alt=""> <%--9  Photo--%>
                                <a href="single-blog.jsp" class="blog_item_date">
                                    <h3> <%=Rs.getObject(6) %> </h3>  <%-- 6  Date--%>
                
                                </a>
                            </div>

                            <div class="blog_details">
                                <a class="d-inline-block" href="single-blog.jsp">
                                    <h2><%=Rs.getObject(3) %> - <%=Rs.getObject(5) %></h2> <%--3 Nom/ 5 Ville--%>
                                </a>
                                <p><%=Rs.getObject(4) %></p> <%--4 Description--%>
                                <ul class="blog-info-link">
                                    <li><a href="#"><i class="fa fa-comments"></i> <%=i %> Likes</a></li>
                                </ul>
                               
                            </div>                               
                       </article>

                                <% } 
                                   Rs.close();%>

                        <nav class="blog-pagination justify-content-center d-flex">
                            <ul class="pagination">
                                <li class="page-item">
                                    <a href="#" class="page-link" aria-label="Previous">
                                        <i class="ti-angle-left"></i>
                                    </a>
                                </li>
                                <li class="page-item">
                                    <a href="#" class="page-link">1</a>
                                </li>
                                <li class="page-item active">
                                    <a href="#" class="page-link">2</a>
                                </li>
                                <li class="page-item">
                                    <a href="#" class="page-link" aria-label="Next">
                                        <i class="ti-angle-right"></i>
                                    </a>
                                </li>
                            </ul>
                        </nav>
                    </div>
                </div>
                <div class="col-lg-4">
                    <div class="blog_right_sidebar">
                        <aside class="single_sidebar_widget post_category_widget">
                            <h4 class="widget_title">Categories</h4> <%--Type voyages--%>
                            <ul class="list cat-list">
                                <li>
                                    <a href="#" class="d-flex">
                                        <p>Citadin</p>
                                    </a>
                                </li>                               
                                <li>
                                    <a href="#" class="d-flex">
                                        <p>Camping</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#" class="d-flex">
                                        <p>Sejour</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#" class="d-flex">
                                        <p>Auto-tour</p>
                                    </a>
                                </li>                               
                            </ul>
                        </aside>

                    
                        <aside class="single_sidebar_widget instagram_feeds">
                            <h4 class="widget_title">Instagram </h4>
                            <ul class="instagram_row flex-wrap">
                                <li>
                                    <a href="#">
                                        <img class="img-fluid" src="img/post/post_5.png" alt="">
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <img class="img-fluid" src="img/post/post_6.png" alt="">
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <img class="img-fluid" src="img/post/post_7.png" alt="">
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <img class="img-fluid" src="img/post/post_8.png" alt="">
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <img class="img-fluid" src="img/post/post_9.png" alt="">
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <img class="img-fluid" src="img/post/post_10.png" alt="">
                                    </a>
                                </li>
                            </ul>
                        </aside>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!--================Blog Area =================-->

    <!-- footer-start -->
        <%@include file="footer.jsp" %>
      <!-- footer-end -->

  <!-- Modal -->
  <div class="modal fade custom_search_pop" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
      <div class="modal-content">
        <div class="serch_form">
            <input type="text" placeholder="Search" >
            <button type="submit">search</button>
        </div>
      </div>
    </div>
  </div>
    <!-- JS here -->
    <script src="js/vendor/modernizr-3.5.0.min.js"></script>
    <script src="js/vendor/jquery-1.12.4.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/isotope.pkgd.min.js"></script>
    <script src="js/ajax-form.js"></script>
    <script src="js/waypoints.min.js"></script>
    <script src="js/jquery.counterup.min.js"></script>
    <script src="js/imagesloaded.pkgd.min.js"></script>
    <script src="js/scrollIt.js"></script>
    <script src="js/jquery.scrollUp.min.js"></script>
    <script src="js/wow.min.js"></script>
    <script src="js/nice-select.min.js"></script>
    <script src="js/jquery.slicknav.min.js"></script>
    <script src="js/jquery.magnific-popup.min.js"></script>
    <script src="js/plugins.js"></script>
    <script src="js/gijgo.min.js"></script>

    <!--contact js-->
    <script src="js/contact.js"></script>
    <script src="js/jquery.ajaxchimp.min.js"></script>
    <script src="js/jquery.form.js"></script>
    <script src="js/jquery.validate.min.js"></script>
    <script src="js/mail-script.js"></script>

    <script src="js/main.js"></script>
    <script>
        $('#datepicker').datepicker({
            iconsLibrary: 'fontawesome',
            icons: {
             rightIcon: '<span class="fa fa-caret-down"></span>'
         }
        });
        $('#datepicker2').datepicker({
            iconsLibrary: 'fontawesome',
            icons: {
             rightIcon: '<span class="fa fa-caret-down"></span>'
         }
        });
    </script>
</body>
</html>

