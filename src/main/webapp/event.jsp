<!doctype html>
<html lang="en">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <link rel="stylesheet" href="./css/style_event.css">
    <link href='https://fonts.googleapis.com/css?family=Oswald' rel='stylesheet'>
    <link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">
    <script src="https://kit.fontawesome.com/3b0953321c.js" crossorigin="anonymous"></script>

    <title>Events - The NGO</title>
</head>

<body>
   <%@ page import="java.util.*" %>
    <nav class="navbar navbar-expand-lg navbar-dark ftco_navbar ftco-navbar-light" id="ftco-navbar">
        <div class="container">
            <a class="navbar-brand" href="index.html">The NGO</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
                  <span class="oi oi-menu"></span> Menu
              </button>

            <div class="collapse navbar-collapse" id="ftco-nav">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item"><a href="index.html" class="nav-link">Home</a></li>
                    <li class="nav-item"><a href="about.html" class="nav-link">About</a></li>
                    <li class="nav-item"><a href="causes.html" class="nav-link">Causes</a></li>
                    <li class="nav-item"><a href="donate.html" class="nav-link">Donate</a></li>
                    <li class="nav-item"><a href="blog.html" class="nav-link">Blog</a></li>
                    <li class="nav-item"><a href="gallery.html" class="nav-link">Gallery</a></li>
                    <li class="nav-item active"><a href="event.html" class="nav-link">Events</a></li>
                    <li class="nav-item"><a href="contact.html" class="nav-link">Contact</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <div class="title">
        <h1>Events</h1>
        <p>Building Blocks to a better Society</p>   
    </div>
    <hr width="60%" >

    <main class="container">
    <c:forEach var="user" items="${data}">
        <section class="box">
                <i class="far fa-calendar-alt"></i>  <span style="display: inline;font-size: 1rem;padding-bottom: 20px; " ;class="date">${user.eventDate }</span>
                <span style="display: inline;font-size: 1rem;padding-bottom: 20px; " ;class="date">- Event No : ${user.eventNo}</span>
                <button class="bb" onclick="location.href = 'registerEvent.html';">Register</button>
                <h3>${user.eventName}</h3>
                <p>${user.eventDescription }</p>    
                <a href="javascript:void();" class="readmore">Read More</a>
        </section>
	</c:forEach>
        <!-- <section class="box">
                <i class="far fa-calendar-alt"></i>  <span style="display: inline;font-size: 1rem;padding-bottom: 20px; " ;class="date">18th August,2020</span>
                <button class="bb" onclick="location.href = 'registerEvent.html';">Register</button>
                <h3>Teachers’ Training Workshop</h3>
                <p>A Teacher’s Training and Capacity Building Workshop is being organized for teachers of Mission Education centres across few cities. It's a step taken by the NGO in further ensuring quality education and accessible learning for children from marginalized sections of the society. The workshop was aimed at enabling all round development of children, and focused on innovative pedagogical methodologies for the primary and middle classes.</p>    
                <a href="javascript:void();" class="readmore">Read More</a>
        </section>

        <section class="box">
                <i class="far fa-calendar-alt"></i>  <span style="display: inline;font-size: 1rem;padding-bottom: 20px; " ;class="date">18th August,2020</span>
                <button class="bb" onclick="location.href = 'registerEvent.html';">Register</button>
                <h3>National Girl Child Day</h3>
                <p>National Girl Child Day is celebrated to encourage people to give equal opportunities to girl child regarding education, healthcare, nutrition etc. We are celebrating National Girl Child Day on the 24th of October 2021 at all the Mission Education centre across the country by engaging in various activities like poster making, painting around the theme of girl child, female feticide, lack of equal opportunities, child-marriage etc.
                   The activities are conducted to sensitize the children about their roles and responsibilities towards building a better society and build the practice of inclusion of one and all. Mission Education is a national level programme of our organistation, which is committed to providing basic education and healthcare to underprivileged children especially targetting girls from rural households.</p>    
                <a href="javascript:void();" class="readmore">Read More</a>
        </section>

        <section class="box">
            <i class="far fa-calendar-alt"></i>  <span style="display: inline;font-size: 1rem;padding-bottom: 20px; " ;class="date">18th August,2020</span>
            <button class="bb" onclick="location.href = 'registerEvent.html';">Register</button>
            <h3>Reaching to the depths</h3>
            <p>This initiative of ours aims to reach the broader spectrum of society which does not end with kids in cities or towns but we aim to reach the ones living in extremely rural condition, the tribes or the adivasis. In this we aim to give the children education and also give their parents an incentive to send them to schools. We aim to achieve this by providing nutritional meals in the school thus not only do the students get good education but also a healthy and balanced meal keeping them healthy. This would also help the daily wage working parents save costs on meals and thus give them more of reaason to send their kids to school. We also aim to create awareness among parents on why their kids deserve education and how it could just make their lives much better. 
            </p>    
            <a href="javascript:void();" class="readmore">Read More</a>
    </section>


    <section class="box">
    <i class="far fa-calendar-alt"></i>  <span style="display: inline;font-size: 1rem;padding-bottom: 20px; " ;class="date">18th August,2020</span>
    <button class="bb" onclick="location.href = 'registerEvent.html';">Register</button>
    <h3>Teach For India (TFI)</h3>
    <p>TFI is an ngo program that came has been in existence since 2009. This was a major success since its inception. Teachers volunteering here or even those looking for jobs accept very meagre salary or sometimes none at all, they enable holistic development for students making them more aware of the things the society can potentially offer them. Our NGO is proud to announce that we too have involved ourseleves in this outstandig program and we are looking to host sessions for volunteer training across various cities in the country and after training send them to different camps across several villages and hope to make a difference in the lives of children. The inaugral event is being held on 30th of November and the camp goes on for a week and the teaching session for the kids in villages goes on for about 30-40 days.</p>    
    <a href="javascript:void();" class="readmore">Read More</a>
    </section> -->
    </main>


<footer class="page-footer font-small special-color-dark pt-4">
        <div class="container">
            <ul class="list-unstyled list-inline text-center">
                <li class="list-inline-item">
                    <a class="btn-floating btn-fb mx-1 btn-lg">
                        <i class="fab fa-facebook-f" style="color:#6495ED"> </i>
                    </a>
                </li>
                <li class="list-inline-item">
                    <a class="btn-floating btn-tw mx-1 btn-lg">
                        <i class="fab fa-twitter" style="color:#6495ED"> </i>
                    </a>
                </li>
                <li class="list-inline-item">
                    <a class="btn-floating btn-gplus mx-1 btn-lg">
                        <i class="fab fa-google-plus-g" style="color:#6495ED"> </i>
                    </a>
                </li>
                <li class="list-inline-item">
                    <a class="btn-floating btn-li mx-1 btn-lg">
                        <i class="fab fa-linkedin-in" style="color:#6495ED"> </i>
                    </a>
                </li>
                <li class="list-inline-item">
                    <a class="btn-floating btn-dribbble mx-1 btn-lg">
                        <i class="fab fa-dribbble" style="color:#6495ED"> </i>
                    </a>
                </li>
            </ul>
        </div>
        <div class="footer-copyright text-center py-3">© 2020 Copyright :
            <a href="" style="color: antiquewhite;"> The NGO</a>
        </div>
    </footer>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    

    <script>
        $(".readmore").on('click',function(){
            $(this).parent().toggleClass("showcontent");
            var replacetxt = $(this).parent().hasClass("box showcontent") ? "Read Less" : "Read More";
        console.log(replacetxt);
        $(this).text(replacetxt);
        });
        
    </script>

</body>

</html>
