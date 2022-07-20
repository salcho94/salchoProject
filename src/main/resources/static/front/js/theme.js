// jQuery to collapse the navbar on scroll
$(window).scroll(function() {
    if ($(".navbar").offset().top > 50) {
        $(".navbar-fixed-top").addClass("top-nav-collapse");
    } else {
        $(".navbar-fixed-top").removeClass("top-nav-collapse");
    }
});

// jQuery for page scrolling feature - requires jQuery Easing plugin
$(function() {
    $('a.page-scroll').bind('click', function(event) {
        var $anchor = $(this);
        $('html, body').stop().animate({
            scrollTop: $($anchor.attr('href')).offset().top
        }, 1500, 'easeInOutExpo');
        event.preventDefault();
    });
});

// Closes the Responsive Menu on Menu Item Click
$('.navbar-collapse ul li a').click(function() {
    $('.navbar-toggle:visible').click();
});


document.addEventListener("DOMContentLoaded", function(){
    let randomNumber = Math.floor(Math.random() * 300) + 1;
    $('.intro').css('background-image' , 'radial-gradient(circle at 50% 50%,rgba(0,0,0,0.46),rgba(0,0,0,0.88)),url(/front/img/main/main_'+randomNumber+'.jpg)');
});
