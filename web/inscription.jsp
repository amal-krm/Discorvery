<!doctype html>
<html class="no-js" lang="zxx">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>interior</title>
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
                            <h3>Inscription</h3>
                            <p>Rester c'est exister mais voyager c'est vivre.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--/ bradcam_area  -->


        <!--================Blog Area =================-->
        <section class="blog_area section-padding">
            <div class="container">
                <div class="section-top-border">
                    <div class="row">
                        <div class="col-lg-8 col-md-8">
                            <h3 class="mb-30">Form Element</h3>
                            <form action="#">
                                <div class="mt-10">
                                    <input type="text" name="first_name" placeholder="First Name"
                                           onfocus="this.placeholder = ''" onblur="this.placeholder = 'First Name'" required
                                           class="single-input">
                                </div>
                                <div class="mt-10">
                                    <input type="text" name="last_name" placeholder="Last Name"
                                           onfocus="this.placeholder = ''" onblur="this.placeholder = 'Last Name'" required
                                           class="single-input">
                                </div>
                                <div class="mt-10">
                                    <input type="text" name="last_name" placeholder="Last Name"
                                           onfocus="this.placeholder = ''" onblur="this.placeholder = 'Last Name'" required
                                           class="single-input">
                                </div>
                                <div class="mt-10">
                                    <input type="email" name="EMAIL" placeholder="Email address"
                                           onfocus="this.placeholder = ''" onblur="this.placeholder = 'Email address'" required
                                           class="single-input">
                                </div>
                                <div class="input-group-icon mt-10">
                                    <div class="icon"><i class="fa fa-thumb-tack" aria-hidden="true"></i></div>
                                    <input type="text" name="address" placeholder="Address" onfocus="this.placeholder = ''"
                                           onblur="this.placeholder = 'Address'" required class="single-input">
                                </div>
                                <div class="input-group-icon mt-10">
                                    <div class="icon"><i class="fa fa-plane" aria-hidden="true"></i></div>
                                    <div class="form-select" id="default-select"">
                                        <select>
                                            <option value=" 1">City</option>
                                            <option value="1">Dhaka</option>
                                            <option value="1">Dilli</option>
                                            <option value="1">Newyork</option>
                                            <option value="1">Islamabad</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="input-group-icon mt-10">
                                    <div class="icon"><i class="fa fa-globe" aria-hidden="true"></i></div>
                                    <div class="form-select" id="default-select"">
                                        <select>
                                            <option value=" 1">Country</option>
                                            <option value="1">Bangladesh</option>
                                            <option value="1">India</option>
                                            <option value="1">England</option>
                                            <option value="1">Srilanka</option>
                                        </select>
                                    </div>
                                </div>

                                <div class="mt-10">
                                    <textarea class="single-textarea" placeholder="Message" onfocus="this.placeholder = ''"
                                              onblur="this.placeholder = 'Message'" required></textarea>
                                </div>
                                <div class="mt-10">
                                    <input type="text" name="first_name" placeholder="Primary color"
                                           onfocus="this.placeholder = ''" onblur="this.placeholder = 'Primary color'" required
                                           class="single-input-primary">
                                </div>
                                <div class="mt-10">
                                    <input type="text" name="first_name" placeholder="Accent color"
                                           onfocus="this.placeholder = ''" onblur="this.placeholder = 'Accent color'" required
                                           class="single-input-accent">
                                </div>
                                <div class="mt-10">
                                    <input type="text" name="first_name" placeholder="Secondary color"
                                           onfocus="this.placeholder = ''" onblur="this.placeholder = 'Secondary color'"
                                           required class="single-input-secondary">
                                </div>
                            </form>
                        </div>
                        <div class="col-lg-3 col-md-4 mt-sm-30">
                            <div class="blog_right_sidebar">
                        <aside class="single_sidebar_widget post_category_widget">
                            <h4 class="widget_title">Categories</h4>
                            <ul class="list cat-list">
                                <li>
                                    <a href="#" class="d-flex">
                                        <p>Resaurant food</p>
                                        <p>(37)</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#" class="d-flex">
                                        <p>Travel news</p>
                                        <p>(10)</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#" class="d-flex">
                                        <p>Modern technology</p>
                                        <p>(03)</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#" class="d-flex">
                                        <p>Product</p>
                                        <p>(11)</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#" class="d-flex">
                                        <p>Inspiration</p>
                                        <p>21</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#" class="d-flex">
                                        <p>Health Care (21)</p>
                                        <p>09</p>
                                    </a>
                                </li>
                            </ul>
                        </aside>

                        <aside class="single_sidebar_widget popular_post_widget">
                            <h3 class="widget_title">Voyages Recent</h3>
                            <div class="media post_item">
                                <img src="img/post/post_1.png" alt="post">
                                <div class="media-body">
                                    <a href="single-blog.jsp">
                                        <h3>From life was you fish...</h3>
                                    </a>
                                    <p>January 12, 2019</p>
                                </div>
                            </div>
                            <div class="media post_item">
                                <img src="img/post/post_2.png" alt="post">
                                <div class="media-body">
                                    <a href="single-blog.jsp">
                                        <h3>The Amazing Hubble</h3>
                                    </a>
                                    <p>02 Hours ago</p>
                                </div>
                            </div>
                            <div class="media post_item">
                                <img src="img/post/post_3.png" alt="post">
                                <div class="media-body">
                                    <a href="single-blog.jsp">
                                        <h3>Astronomy Or Astrology</h3>
                                    </a>
                                    <p>03 Hours ago</p>
                                </div>
                            </div>
                            <div class="media post_item">
                                <img src="img/post/post_4.png" alt="post">
                                <div class="media-body">
                                    <a href="single-blog.jsp">
                                        <h3>Asteroids telescope</h3>
                                    </a>
                                    <p>01 Hours ago</p>
                                </div>
                            </div>
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