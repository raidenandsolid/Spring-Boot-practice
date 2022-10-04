function $(body) {

}

let target = document.body;

target.append('<div id="page-loader"></div>');
$(window).on("beforeunload", function() {
    $('#page-loader').fadeIn(1000).delay(9000).fadeOut(1000);
});