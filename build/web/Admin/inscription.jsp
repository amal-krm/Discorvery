<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js" lang="zxx">

    <head>
        <meta charset="utf-8">
        <title>Travelo</title>
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
        <link rel="stylesheet" href="css/slick.css">
        <link rel="stylesheet" href="css/slicknav.css">
        <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/themes/smoothness/jquery-ui.css">

        <link rel="stylesheet" href="css/style.css">
        <!-- <link rel="stylesheet" href="css/responsive.css"> -->
    </head>

    <body>
        <!--[if lte IE 9]>
                <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="https://browsehappy.com/">upgrade your browser</a> to improve your experience and security.</p>
            <![endif]-->
        <%@include file="Navbar.jsp" %>
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
                        <!-- For Gradient Border Use -->
                        <!-- <div class="mt-10">
                                                <div class="primary-input">
                                                        <input id="primary-input" type="text" name="first_name" placeholder="Primary color" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Primary color'">
                                                        <label for="primary-input"></label>
                                                </div>
                                        </div> -->
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
                    <div class="single-element-widget">
                        <h3 class="mb-30">Switches</h3>
                        <div class="switch-wrap d-flex justify-content-between">
                            <p>01. Sample Switch</p>
                            <div class="primary-switch">
                                <input type="checkbox" id="default-switch">
                                <label for="default-switch"></label>
                            </div>
                        </div>
                        <div class="switch-wrap d-flex justify-content-between">
                            <p>02. Primary Color Switch</p>
                            <div class="primary-switch">
                                <input type="checkbox" id="primary-switch" checked>
                                <label for="primary-switch"></label>
                            </div>
                        </div>
                        <div class="switch-wrap d-flex justify-content-between">
                            <p>03. Confirm Color Switch</p>
                            <div class="confirm-switch">
                                <input type="checkbox" id="confirm-switch" checked>
                                <label for="confirm-switch"></label>
                            </div>
                        </div>
                    </div>
                    <div class="single-element-widget mt-30">
                        <h3 class="mb-30">Selectboxes</h3>
                        <div class="default-select" id="default-select"">
                            <select>
                                <option value=" 1">English</option>
                                <option value="1">Spanish</option>
                                <option value="1">Arabic</option>
                                <option value="1">Portuguise</option>
                                <option value="1">Bengali</option>
                            </select>
                        </div>
                    </div>
                    <div class="single-element-widget mt-30">
                        <h3 class="mb-30">Checkboxes</h3>
                        <div class="switch-wrap d-flex justify-content-between">
                            <p>01. Sample Checkbox</p>
                            <div class="primary-checkbox">
                                <input type="checkbox" id="default-checkbox">
                                <label for="default-checkbox"></label>
                            </div>
                        </div>
                        <div class="switch-wrap d-flex justify-content-between">
                            <p>02. Primary Color Checkbox</p>
                            <div class="primary-checkbox">
                                <input type="checkbox" id="primary-checkbox" checked>
                                <label for="primary-checkbox"></label>
                            </div>
                        </div>
                        <div class="switch-wrap d-flex justify-content-between">
                            <p>03. Confirm Color Checkbox</p>
                            <div class="confirm-checkbox">
                                <input type="checkbox" id="confirm-checkbox">
                                <label for="confirm-checkbox"></label>
                            </div>
                        </div>
                        <div class="switch-wrap d-flex justify-content-between">
                            <p>04. Disabled Checkbox</p>
                            <div class="disabled-checkbox">
                                <input type="checkbox" id="disabled-checkbox" disabled>
                                <label for="disabled-checkbox"></label>
                            </div>
                        </div>
                        <div class="switch-wrap d-flex justify-content-between">
                            <p>05. Disabled Checkbox active</p>
                            <div class="disabled-checkbox">
                                <input type="checkbox" id="disabled-checkbox-active" checked disabled>
                                <label for="disabled-checkbox-active"></label>
                            </div>
                        </div>
                    </div>
                    <div class="single-element-widget mt-30">
                        <h3 class="mb-30">Radios</h3>
                        <div class="switch-wrap d-flex justify-content-between">
                            <p>01. Sample radio</p>
                            <div class="primary-radio">
                                <input type="checkbox" id="default-radio">
                                <label for="default-radio"></label>
                            </div>
                        </div>
                        <div class="switch-wrap d-flex justify-content-between">
                            <p>02. Primary Color radio</p>
                            <div class="primary-radio">
                                <input type="checkbox" id="primary-radio" checked>
                                <label for="primary-radio"></label>
                            </div>
                        </div>
                        <div class="switch-wrap d-flex justify-content-between">
                            <p>03. Confirm Color radio</p>
                            <div class="confirm-radio">
                                <input type="checkbox" id="confirm-radio" checked>
                                <label for="confirm-radio"></label>
                            </div>
                        </div>
                        <div class="switch-wrap d-flex justify-content-between">
                            <p>04. Disabled radio</p>
                            <div class="disabled-radio">
                                <input type="checkbox" id="disabled-radio" disabled>
                                <label for="disabled-radio"></label>
                            </div>
                        </div>
                        <div class="switch-wrap d-flex justify-content-between">
                            <p>05. Disabled radio active</p>
                            <div class="disabled-radio">
                                <input type="checkbox" id="disabled-radio-active" checked disabled>
                                <label for="disabled-radio-active"></label>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>


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
        <!-- link that opens popup -->
        <!--     
            <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
            <script src="https://static.codepen.io/assets/common/stopExecutionOnTimeout-de7e2ef6bfefd24b79a3f68b414b87b8db5b08439cac3f1012092b2290c719cd.js"></script>
        
            <script src=" https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"> </script> -->
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
        <script src="js/slick.min.js"></script>



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
        </script>
    </body>

</html>
